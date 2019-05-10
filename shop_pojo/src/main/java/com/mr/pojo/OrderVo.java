package com.mr.pojo;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1115393087 on 2019/5/6.
 */
public class OrderVo {


    //订单表id
    private Integer orId;

    //订单表唯一编号
    private String orUuid;

    //订单生成时间
    private Date orDate;

    //用户id
    private Integer userId;

    //商品id
    private Integer comId;

    //商品名称
    private String comName;

    //商品颜色
    private Integer comFlavor;

    //商品包装
    private Integer comPack;

    //商品价格
    private Double comPrice;

    //购买数量
    private Integer orCount;

    //运费
    private Integer comFreight;

    //订单状态
    private Integer orState;

    //是否收货
    private Integer orAccept;

    //是否评论
    private Integer orIfcomment;

    private Double comMoney;


    //get方法   总金额
    public String getSumPrice(){
        DecimalFormat df = new DecimalFormat("#.00");
        return "" + df.format(orCount * comMoney);
    }

    public String getOrDates(){
        if(orDate != null){
            return new SimpleDateFormat("yyyy-MM-dd").format(orDate);
        }
        return "";
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "orId=" + orId +
                ", orUuid='" + orUuid + '\'' +
                ", orDate=" + orDate +
                ", userId=" + userId +
                ", comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comFlavor=" + comFlavor +
                ", comPack=" + comPack +
                ", comPrice=" + comPrice +
                ", orCount=" + orCount +
                ", comFreight=" + comFreight +
                ", orState=" + orState +
                ", orAccept=" + orAccept +
                ", orIfcomment=" + orIfcomment +
                ", comMoney=" + comMoney +
                '}';
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public String getOrUuid() {
        return orUuid;
    }

    public void setOrUuid(String orUuid) {
        this.orUuid = orUuid;
    }

    public Date getOrDate() {
        return orDate;
    }

    public void setOrDate(Date orDate) {
        this.orDate = orDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Integer getComFlavor() {
        return comFlavor;
    }

    public void setComFlavor(Integer comFlavor) {
        this.comFlavor = comFlavor;
    }

    public Integer getComPack() {
        return comPack;
    }

    public void setComPack(Integer comPack) {
        this.comPack = comPack;
    }

    public Double getComPrice() {
        return comPrice;
    }

    public void setComPrice(Double comPrice) {
        this.comPrice = comPrice;
    }

    public Integer getOrCount() {
        return orCount;
    }

    public void setOrCount(Integer orCount) {
        this.orCount = orCount;
    }

    public Integer getComFreight() {
        return comFreight;
    }

    public void setComFreight(Integer comFreight) {
        this.comFreight = comFreight;
    }

    public Integer getOrState() {
        return orState;
    }

    public void setOrState(Integer orState) {
        this.orState = orState;
    }

    public Integer getOrAccept() {
        return orAccept;
    }

    public void setOrAccept(Integer orAccept) {
        this.orAccept = orAccept;
    }

    public Integer getOrIfcomment() {
        return orIfcomment;
    }

    public void setOrIfcomment(Integer orIfcomment) {
        this.orIfcomment = orIfcomment;
    }

    public Double getComMoney() {
        return comMoney;
    }

    public void setComMoney(Double comMoney) {
        this.comMoney = comMoney;
    }
}
