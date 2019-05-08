package com.mr.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shun on 2019/4/29.
 */
public class User {

    private Integer userId;
    private String userNickname;
    private String userName;
    private Integer userSex;
    private Date userTime;
    private Date userBir;
    private String userPhone;
    private String userEmail;
    private String userPass;
    private Integer userJurisdiction;
    private String userDiscount;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Date getUserTime() {
        return userTime;
    }

    public String getUserTimes(){
        if (userTime != null){
          return   new SimpleDateFormat("yyyy-MM-dd").format(userTime);
        }
        return "";
    }

    public void setUserTime(Date userTime) {
        this.userTime = userTime;
    }

    public Date getUserBir() {
        return userBir;
    }

    public String getUserBirs(){
        if(userBir != null){
           return new SimpleDateFormat("yyyy-MM-dd").format(userBir);
        }
        return "";
    }

    public void setUserBir(Date userBir) {
        this.userBir = userBir;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Integer getUserJurisdiction() {
        return userJurisdiction;
    }

    public void setUserJurisdiction(Integer userJurisdiction) {
        this.userJurisdiction = userJurisdiction;
    }

    public String getUserDiscount() {
        return userDiscount;
    }

    public void setUserDiscount(String userDiscount) {
        this.userDiscount = userDiscount;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userNickname='" + userNickname + '\'' +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", userTime=" + userTime +
                ", userBir=" + userBir +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userJurisdiction=" + userJurisdiction +
                ", userDiscount='" + userDiscount + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer userId, String userNickname, String userName, Integer userSex, Date userTime, Date userBir, String userPhone, String userEmail, String userPass, Integer userJurisdiction, String userDiscount) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userName = userName;
        this.userSex = userSex;
        this.userTime = userTime;
        this.userBir = userBir;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userJurisdiction = userJurisdiction;
        this.userDiscount = userDiscount;
    }
}
