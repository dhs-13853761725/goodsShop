package com.mr.pojo;

/**
 * Created by 1115393087 on 2019/4/30.
 */
public class AddrUser {

    private Integer addressId;//地址ID
    private Integer userId;//用户ID
    private String userName;//名字
    private String addressName;//收件人
    private String addressPhone;//手机号
    private String addressProvince;//省
    private String addressCity;//市
    private String addressCounty;//县
    private String addressDetailed;//详细地址
    private Integer addressDefault;//默认


    @Override
    public String toString() {
        return "AddrUser{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", addressName='" + addressName + '\'' +
                ", addressPhone='" + addressPhone + '\'' +
                ", addressProvince='" + addressProvince + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressCounty='" + addressCounty + '\'' +
                ", addressDetailed='" + addressDetailed + '\'' +
                ", addressDefault=" + addressDefault +
                '}';
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressPhone() {
        return addressPhone;
    }

    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty;
    }

    public String getAddressDetailed() {
        return addressDetailed;
    }

    public void setAddressDetailed(String addressDetailed) {
        this.addressDetailed = addressDetailed;
    }

    public Integer getAddressDefault() {
        return addressDefault;
    }

    public void setAddressDefault(Integer addressDefault) {
        this.addressDefault = addressDefault;
    }
}
