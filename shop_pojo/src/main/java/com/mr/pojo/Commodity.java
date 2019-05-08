package com.mr.pojo;

import org.apache.solr.client.solrj.beans.Field;

/**
 * Created by shun on 2019/5/6.
 */
public class Commodity {

    @Field("id")
    private Integer comId;//商品ID
    @Field("com_number")
    private String comNumber;//商品编号
    @Field("com_name")
    private String comName;//商品名称
    @Field("com_type")
    private Integer comType;//商品类型
    @Field("com_state")
    private Integer comState;//商品状态，是否在售
    @Field("com_money")
    private Double comMoney;//促销价
    @Field("com_price")
    private Double comPrice;//原价
    @Field("com_acvitity")
    private Integer comAcvitity;//优惠券
    @Field("com_freight")
    private Integer comFreight;//运费
    @Field("com_flavor")
    private Integer comFlavor;//口味
    @Field("com_pack")
    private Integer comPack;//包装
    @Field("com_count")
    private Integer comCount;//数量
    @Field("com_new")
    private Integer comNew;//是否新品
    @Field("com_hot")
    private Integer comHot;//是否热卖


    public String getComFreights(){
        if(comFreight != null){
            if(comFreight == 0){
                return "包邮";
            }else{
                return ""+comFreight;
            }
        }
        return "";
    }

    public String getComStates(){
        if(comState != null){
            if(comState==1){
                return "在售";
            }else {
                return "未售";
            }
        }
        return "";
    }

    public String getComFlavors(){
        if(comFlavor != null){
            if(comFlavor==1){
                return "原味";
            }else {
                return "其他味";
            }
        }
        return "";
    }
    public String getComPacks(){
        if(comPack != null){
            if(comPack==1){
                return "裸装";
            }else {
                return "盒装";
            }
        }
        return "";
    }
    public String getComNews(){
        if(comNew != null){
            if(comNew==1){
                return "新品";
            }else {
                return "非新品";
            }
        }
        return "";
    }
    public String getComHots(){
        if(comHot != null){
            if(comHot==1){
                return "热品";
            }else {
                return "非热品";
            }
        }
        return "";
    }
    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComNumber() {
        return comNumber;
    }

    public void setComNumber(String comNumber) {
        this.comNumber = comNumber;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Integer getComType() {
        return comType;
    }

    public void setComType(Integer comType) {
        this.comType = comType;
    }

    public Integer getComState() {
        return comState;
    }

    public void setComState(Integer comState) {
        this.comState = comState;
    }

    public Double getComMoney() {
        return comMoney;
    }

    public void setComMoney(Double comMoney) {
        this.comMoney = comMoney;
    }

    public Double getComPrice() {
        return comPrice;
    }

    public void setComPrice(Double comPrice) {
        this.comPrice = comPrice;
    }

    public Integer getComAcvitity() {
        return comAcvitity;
    }

    public void setComAcvitity(Integer comAcvitity) {
        this.comAcvitity = comAcvitity;
    }

    public Integer getComFreight() {
        return comFreight;
    }

    public void setComFreight(Integer comFreight) {
        this.comFreight = comFreight;
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

    public Integer getComCount() {
        return comCount;
    }

    public void setComCount(Integer comCount) {
        this.comCount = comCount;
    }

    public Integer getComNew() {
        return comNew;
    }

    public void setComNew(Integer comNew) {
        this.comNew = comNew;
    }

    public Integer getComHot() {
        return comHot;
    }

    public void setComHot(Integer comHot) {
        this.comHot = comHot;
    }

    public Commodity() {
    }

    public Commodity(Integer comId, String comNumber, String comName, Integer comType, Integer comState, Double comMoney, Double comPrice, Integer comAcvitity, Integer comFreight, Integer comFlavor, Integer comPack, Integer comCount, Integer comNew, Integer comHot) {
        this.comId = comId;
        this.comNumber = comNumber;
        this.comName = comName;
        this.comType = comType;
        this.comState = comState;
        this.comMoney = comMoney;
        this.comPrice = comPrice;
        this.comAcvitity = comAcvitity;
        this.comFreight = comFreight;
        this.comFlavor = comFlavor;
        this.comPack = comPack;
        this.comCount = comCount;
        this.comNew = comNew;
        this.comHot = comHot;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "comId=" + comId +
                ", comNumber='" + comNumber + '\'' +
                ", comName='" + comName + '\'' +
                ", comType=" + comType +
                ", comState=" + comState +
                ", comMoney=" + comMoney +
                ", comPrice=" + comPrice +
                ", comAcvitity=" + comAcvitity +
                ", comFreight=" + comFreight +
                ", comFlavor=" + comFlavor +
                ", comPack=" + comPack +
                ", comCount=" + comCount +
                ", comNew=" + comNew +
                ", comHot=" + comHot +
                '}';
    }
}
