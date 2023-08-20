package com.example.demo.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.username
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.status
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.nickname
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.email
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.avatar
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.phone_number
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.sex
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Byte sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.permission
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Byte permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.birth
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date birth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.enroll_date
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date enrollDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.graduate_date
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date graduateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.department
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.institute
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private String institute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.created_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.updated_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date updatedTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.is_deleted
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Boolean isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.deleted_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private Date deletedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.username
     *
     * @return the value of user_info.username
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.username
     *
     * @param username the value for user_info.username
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.status
     *
     * @return the value of user_info.status
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.status
     *
     * @param status the value for user_info.status
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.nickname
     *
     * @return the value of user_info.nickname
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.nickname
     *
     * @param nickname the value for user_info.nickname
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.email
     *
     * @return the value of user_info.email
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.email
     *
     * @param email the value for user_info.email
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.avatar
     *
     * @return the value of user_info.avatar
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.avatar
     *
     * @param avatar the value for user_info.avatar
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.phone_number
     *
     * @return the value of user_info.phone_number
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.phone_number
     *
     * @param phoneNumber the value for user_info.phone_number
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.sex
     *
     * @return the value of user_info.sex
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.sex
     *
     * @param sex the value for user_info.sex
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.permission
     *
     * @return the value of user_info.permission
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Byte getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.permission
     *
     * @param permission the value for user_info.permission
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setPermission(Byte permission) {
        this.permission = permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.birth
     *
     * @return the value of user_info.birth
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.birth
     *
     * @param birth the value for user_info.birth
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.enroll_date
     *
     * @return the value of user_info.enroll_date
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getEnrollDate() {
        return enrollDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.enroll_date
     *
     * @param enrollDate the value for user_info.enroll_date
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.graduate_date
     *
     * @return the value of user_info.graduate_date
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getGraduateDate() {
        return graduateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.graduate_date
     *
     * @param graduateDate the value for user_info.graduate_date
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.department
     *
     * @return the value of user_info.department
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.department
     *
     * @param department the value for user_info.department
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.institute
     *
     * @return the value of user_info.institute
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public String getInstitute() {
        return institute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.institute
     *
     * @param institute the value for user_info.institute
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setInstitute(String institute) {
        this.institute = institute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.created_time
     *
     * @return the value of user_info.created_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.created_time
     *
     * @param createdTime the value for user_info.created_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.updated_time
     *
     * @return the value of user_info.updated_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.updated_time
     *
     * @param updatedTime the value for user_info.updated_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.is_deleted
     *
     * @return the value of user_info.is_deleted
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.is_deleted
     *
     * @param isDeleted the value for user_info.is_deleted
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.deleted_time
     *
     * @return the value of user_info.deleted_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public Date getDeletedTime() {
        return deletedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.deleted_time
     *
     * @param deletedTime the value for user_info.deleted_time
     *
     * @mbg.generated Sun Aug 20 14:18:41 CST 2023
     */
    public void setDeletedTime(Date deletedTime) {
        this.deletedTime = deletedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", status=").append(status);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", avatar=").append(avatar);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", sex=").append(sex);
        sb.append(", permission=").append(permission);
        sb.append(", birth=").append(birth);
        sb.append(", enrollDate=").append(enrollDate);
        sb.append(", graduateDate=").append(graduateDate);
        sb.append(", department=").append(department);
        sb.append(", institute=").append(institute);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", deletedTime=").append(deletedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}