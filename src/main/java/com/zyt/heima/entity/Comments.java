package com.zyt.heima.entity;

import java.util.Date;

public class Comments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.commID
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String commid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.commContext
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String commcontext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.partentId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String partentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.commTime
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private Date commtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.userId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.blogId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    private String blogid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.commID
     *
     * @return the value of comments.commID
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getCommid() {
        return commid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.commID
     *
     * @param commid the value for comments.commID
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setCommid(String commid) {
        this.commid = commid == null ? null : commid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.commContext
     *
     * @return the value of comments.commContext
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getCommcontext() {
        return commcontext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.commContext
     *
     * @param commcontext the value for comments.commContext
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setCommcontext(String commcontext) {
        this.commcontext = commcontext == null ? null : commcontext.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.partentId
     *
     * @return the value of comments.partentId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getPartentid() {
        return partentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.partentId
     *
     * @param partentid the value for comments.partentId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setPartentid(String partentid) {
        this.partentid = partentid == null ? null : partentid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.commTime
     *
     * @return the value of comments.commTime
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public Date getCommtime() {
        return commtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.commTime
     *
     * @param commtime the value for comments.commTime
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setCommtime(Date commtime) {
        this.commtime = commtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.userId
     *
     * @return the value of comments.userId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.userId
     *
     * @param userid the value for comments.userId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.blogId
     *
     * @return the value of comments.blogId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public String getBlogid() {
        return blogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.blogId
     *
     * @param blogid the value for comments.blogId
     *
     * @mbg.generated Sat Sep 28 15:20:08 CST 2019
     */
    public void setBlogid(String blogid) {
        this.blogid = blogid == null ? null : blogid.trim();
    }
}