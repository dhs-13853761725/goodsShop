package com.mr.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1115393087 on 2019/5/5.
 */

public class Order {

    //订单id
    private Integer orId;

    //用户id
    private Integer userId;

    //购物车id
    private Integer carId;

    //优惠卷id
    private Integer yhId;

    //地址id
    private Integer addressId;

    //订单生成时间
    private Date orDate;

    //订单金额
    private Double orPrice;

    //快递费用
    private Integer orPostage;

    //买家留言
    private String orContent;

    //订单编号UUID
    private String orUuid;

    //一键支付
    private String orUuid1;

    //快递类型
    private Integer orExpress;

    //商品id
    private Integer orComid;


    //订单支付状态
    private Integer orState;

    private Double payPrice;

    private Date payDate;

    //商品数量
    private Integer carCount;

    public String getPayDates(){
        if(payDate != null){
            return new SimpleDateFormat("yyyy-MM-dd").format(payDate);
        }
        return "";
    }

    public String getOrDates(){
        if(orDate != null){
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(orDate);
        }
        return "";
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Date getOrDate() {
        return orDate;
    }

    public void setOrDate(Date orDate) {
        this.orDate = orDate;
    }

    public Double getOrPrice() {
        return orPrice;
    }

    public void setOrPrice(Double orPrice) {
        this.orPrice = orPrice;
    }

    public Integer getOrPostage() {
        return orPostage;
    }

    public void setOrPostage(Integer orPostage) {
        this.orPostage = orPostage;
    }

    public String getOrContent() {
        return orContent;
    }

    public void setOrContent(String orContent) {
        this.orContent = orContent;
    }

    public String getOrUuid() {
        return orUuid;
    }

    public void setOrUuid(String orUuid) {
        this.orUuid = orUuid;
    }

    public String getOrUuid1() {
        return orUuid1;
    }

    public void setOrUuid1(String orUuid1) {
        this.orUuid1 = orUuid1;
    }

    public Integer getOrExpress() {
        return orExpress;
    }

    public void setOrExpress(Integer orExpress) {
        this.orExpress = orExpress;
    }

    public Integer getOrComid() {
        return orComid;
    }

    public void setOrComid(Integer orComid) {
        this.orComid = orComid;
    }

    public Integer getOrState() {
        return orState;
    }

    public void setOrState(Integer orState) {
        this.orState = orState;
    }

    public Double getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Double payPrice) {
        this.payPrice = payPrice;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Integer getCarCount() {
        return carCount;
    }

    public void setCarCount(Integer carCount) {
        this.carCount = carCount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orId=" + orId +
                ", userId=" + userId +
                ", carId=" + carId +
                ", yhId=" + yhId +
                ", addressId=" + addressId +
                ", orDate=" + orDate +
                ", orPrice=" + orPrice +
                ", orPostage=" + orPostage +
                ", orContent='" + orContent + '\'' +
                ", orUuid='" + orUuid + '\'' +
                ", orUuid1='" + orUuid1 + '\'' +
                ", orExpress=" + orExpress +
                ", orComid=" + orComid +
                ", orState=" + orState +
                ", payPrice=" + payPrice +
                ", payDate=" + payDate +
                ", carCount=" + carCount +
                '}';
    }

    public Order() {
    }

    public Order(Integer orId, Integer userId, Integer carId, Integer yhId, Integer addressId, Date orDate, Double orPrice, Integer orPostage, String orContent, String orUuid, String orUuid1, Integer orExpress, Integer orComid, Integer orState, Double payPrice, Date payDate, Integer carCount) {
        this.orId = orId;
        this.userId = userId;
        this.carId = carId;
        this.yhId = yhId;
        this.addressId = addressId;
        this.orDate = orDate;
        this.orPrice = orPrice;
        this.orPostage = orPostage;
        this.orContent = orContent;
        this.orUuid = orUuid;
        this.orUuid1 = orUuid1;
        this.orExpress = orExpress;
        this.orComid = orComid;
        this.orState = orState;
        this.payPrice = payPrice;
        this.payDate = payDate;
        this.carCount = carCount;
    }
}
