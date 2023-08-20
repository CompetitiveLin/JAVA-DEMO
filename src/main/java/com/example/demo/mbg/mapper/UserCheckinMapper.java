package com.example.demo.mbg.mapper;

import com.example.demo.mbg.model.UserCheckin;
import com.example.demo.mbg.model.UserCheckinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCheckinMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    long countByExample(UserCheckinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int deleteByExample(UserCheckinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int insert(UserCheckin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int insertSelective(UserCheckin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    List<UserCheckin> selectByExample(UserCheckinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    UserCheckin selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int updateByExampleSelective(@Param("record") UserCheckin record, @Param("example") UserCheckinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int updateByExample(@Param("record") UserCheckin record, @Param("example") UserCheckinExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int updateByPrimaryKeySelective(UserCheckin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_checkin
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    int updateByPrimaryKey(UserCheckin record);
}