package com.example.demo.component;

import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import com.example.demo.util.JwtUtil;
import com.example.demo.dto.UserInfoDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.example.demo.constant.AuthorizationConstant.HEADER_NAME;
import static com.example.demo.constant.AuthorizationConstant.HEADER_PREFIX;

/**
 * @className: JwtAuthenticationTokenFilter
 * @description: jwt过滤器,每次请求都会经过这个filter
 */
@Slf4j
//@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    @Autowired
    private UserDetailsService userDetailsService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException, ServletException, IOException {
        log.info("doFilterInternal");
        String bearerToken  = request.getHeader(HEADER_NAME);
        if (ObjectUtil.isNotNull(bearerToken)) {
            String token = bearerToken.substring(HEADER_PREFIX.length());    // The part after "Bearer "
            String userName = JwtUtil.getUserNameToken(token);
            //当userName不为空且没经过认证时进行校验token是否为有效token
            if (ObjectUtil.isNotNull(userName) && ObjectUtil.isNull(SecurityContextHolder.getContext().getAuthentication())) {
                UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
                UserInfoDetails user = (UserInfoDetails) userDetails;
                //检验token，新增下面的if判断
                if (StrUtil.equals(userName,user.getUsername()) && JwtUtil.verifyToken(token)) {
                    /**
                     * UsernamePasswordAuthenticationToken继承AbstractAuthenticationToken实现Authentication
                     * 所以当在页面中输入用户名和密码之后首先会进入到UsernamePasswordAuthenticationToken验证(Authentication)，
                     * 然后生成的Authentication会被交由AuthenticationManager来进行管理
                     * 而AuthenticationManager管理一系列的AuthenticationProvider，
                     * 而每一个Provider都会通UserDetailsService和UserDetail来返回一个
                     * 以UsernamePasswordAuthenticationToken实现的带用户名和密码以及权限的Authentication
                     */
                    UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }
        }
        filterChain.doFilter(request,response);
    }
}