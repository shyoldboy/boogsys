package com.zyt.heima.entity;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userName
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nickname
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birnative
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String birnative;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nownative
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String nownative;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private Short sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private Date birthday;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userId
     *
     * @return the value of user.userId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userId
     *
     * @param userid the value for user.userId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userName
     *
     * @return the value of user.userName
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userName
     *
     * @param username the value for user.userName
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nickname
     *
     * @return the value of user.nickname
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nickname
     *
     * @param nickname the value for user.nickname
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birnative
     *
     * @return the value of user.birnative
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getBirnative() {
        return birnative;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birnative
     *
     * @param birnative the value for user.birnative
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setBirnative(String birnative) {
        this.birnative = birnative == null ? null : birnative.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nownative
     *
     * @return the value of user.nownative
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getNownative() {
        return nownative;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nownative
     *
     * @param nownative the value for user.nownative
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setNownative(String nownative) {
        this.nownative = nownative == null ? null : nownative.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public Short getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setSex(Short sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}