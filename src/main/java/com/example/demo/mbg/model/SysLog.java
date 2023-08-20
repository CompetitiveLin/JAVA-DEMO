package com.example.demo.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class SysLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.id
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.method
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String method;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.duration
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Long duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.params
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String params;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.ip
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_log
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.id
     *
     * @return the value of sys_log.id
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.id
     *
     * @param id the value for sys_log.id
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.method
     *
     * @return the value of sys_log.method
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.method
     *
     * @param method the value for sys_log.method
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.duration
     *
     * @return the value of sys_log.duration
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.duration
     *
     * @param duration the value for sys_log.duration
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.params
     *
     * @return the value of sys_log.params
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.params
     *
     * @param params the value for sys_log.params
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setParams(String params) {
        this.params = params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.ip
     *
     * @return the value of sys_log.ip
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.ip
     *
     * @param ip the value for sys_log.ip
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_time
     *
     * @return the value of sys_log.create_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_time
     *
     * @param createTime the value for sys_log.create_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", method=").append(method);
        sb.append(", duration=").append(duration);
        sb.append(", params=").append(params);
        sb.append(", ip=").append(ip);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}