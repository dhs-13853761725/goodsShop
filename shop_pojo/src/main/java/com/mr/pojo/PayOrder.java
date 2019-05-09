package com.mr.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by 1115393087 on 2019/5/6.
 */
public class PayOrder {

    //支付详细表


    //支付详细表 主键
    private Integer payId;

    //用户id
    private Integer userId;

    //独有的支付编号
    private String payUuid;

    //支付金额
    private Double payPrice;

    //订单的id
    private Integer orId;

    //支付时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payDate;


    @Override
    public String toString() {
        return "PayOrder{" +
                "payId=" + payId +
                ", userId=" + userId +
                ", payUuid='" + payUuid + '\'' +
                ", payPrice=" + payPrice +
                ", orId=" + orId +
                ", payDate=" + payDate +
                '}';
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPayUuid() {
        return payUuid;
    }

    public void setPayUuid(String payUuid) {
        this.payUuid = payUuid;
    }

    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
}
