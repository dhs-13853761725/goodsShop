package com.mr.pojo;

import org.apache.solr.client.solrj.beans.Field;

/**
 * Created by 王美千 on 2019/4/29.
 */
public class Commodity {

    @Field("id")
    private String comId;//商品ID
    @Field("com_number")
    private String comNumber;//商品编号
    @Field("com_name")
    private String comName;//商品名称
    @Field("com_type")
    private Integer comType;//商品类型
    @Field("com_state")
    private Integer comState;//商品状态
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
    private Integer comHot;
    private Integer comNew;

    @Field("sa_id")
    private Integer saId;
    @Field("com_monthsales")
    private Integer comMonthsales;
    @Field("com_totalsales")
    private Integer comTotalsales;
    @Field()
    private Integer comTotalevaluate;

    public Commodity(String comId, String comNumber, String comName, Integer comType, Integer comState, Double comMoney, Double comPrice, Integer comAcvitity, Integer comFreight, Integer comFlavor, Integer comPack, Integer comCount, Integer comHot, Integer comNew, Integer saId, Integer comMonthsales, Integer comTotalsales, Integer comTotalevaluate) {
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
        this.comHot = comHot;
        this.comNew = comNew;
        this.saId = saId;
        this.comMonthsales = comMonthsales;
        this.comTotalsales = comTotalsales;
        this.comTotalevaluate = comTotalevaluate;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "comId='" + comId + '\'' +
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
                ", comHot=" + comHot +
                ", comNew=" + comNew +
                ", saId=" + saId +
                ", comMonthsales=" + comMonthsales +
                ", comTotalsales=" + comTotalsales +
                ", comTotalevaluate=" + comTotalevaluate +
                '}';
    }

    public Integer getComHot() {
        return comHot;
    }

    public void setComHot(Integer comHot) {
        this.comHot = comHot;
    }

    public Integer getComNew() {
        return comNew;
    }

    public void setComNew(Integer comNew) {
        this.comNew = comNew;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
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

    public Integer getSaId() {
        return saId;
    }

    public void setSaId(Integer saId) {
        this.saId = saId;
    }

    public Integer getComMonthsales() {
        return comMonthsales;
    }

    public void setComMonthsales(Integer comMonthsales) {
        this.comMonthsales = comMonthsales;
    }

    public Integer getComTotalsales() {
        return comTotalsales;
    }

    public void setComTotalsales(Integer comTotalsales) {
        this.comTotalsales = comTotalsales;
    }

    public Integer getComTotalevaluate() {
        return comTotalevaluate;
    }

    public void setComTotalevaluate(Integer comTotalevaluate) {
        this.comTotalevaluate = comTotalevaluate;
    }

    public Commodity() {
    }


}
