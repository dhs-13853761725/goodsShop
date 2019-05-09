package com.mr.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1115393087 on 2019/5/7.
 */
public class CommHtml {

    //订单id
    private Integer orId;

    //商品id
    private Integer comId;

    //用户id
    private Integer userId;

    //商品名称
    private String comName;

    //商品颜色
    private Integer comFlavor;

    //商品包装
    private Integer comPack;

    //商品图片
    private String comUrl;

    //商品价格
    private Double comPrice;

    //      评价表
    // 评价id
    private Integer evaId;

    //评论内容
    private String evaContent;

    //好中差评
    private Integer evaLevel;

    //评论状态
    private Integer evaState;

    //订单表中的商品id
    private Integer orComid;


    //评论时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date evaTime;

    //是否未匿名
    private Integer evaAnonymous;



    public String getEvaTimes(){
        if(evaTime != null){
            return  new SimpleDateFormat("yyyy-mm-dd").format(evaTime);
        }
        return "";
    }

    @Override
    public String toString() {
        return "CommHtml{" +
                "orId=" + orId +
                ", comId=" + comId +
                ", userId=" + userId +
                ", comName='" + comName + '\'' +
                ", comFlavor=" + comFlavor +
                ", comPack=" + comPack +
                ", comUrl='" + comUrl + '\'' +
                ", comPrice=" + comPrice +
                ", evaId=" + evaId +
                ", evaContent='" + evaContent + '\'' +
                ", evaLevel=" + evaLevel +
                ", evaState=" + evaState +
                ", orComid=" + orComid +
                ", evaTime=" + evaTime +
                ", evaAnonymous=" + evaAnonymous +
                '}';
    }

    public Integer getOrId() {
        return orId;
    }

    public void setOrId(Integer orId) {
        this.orId = orId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public String getComUrl() {
        return comUrl;
    }

    public void setComUrl(String comUrl) {
        this.comUrl = comUrl;
    }

    public Double getComPrice() {
        return comPrice;
    }

    public void setComPrice(Double comPrice) {
        this.comPrice = comPrice;
    }

    public Integer getEvaId() {
        return evaId;
    }

    public void setEvaId(Integer evaId) {
        this.evaId = evaId;
    }

    public String getEvaContent() {
        return evaContent;
    }

    public void setEvaContent(String evaContent) {
        this.evaContent = evaContent;
    }

    public Integer getEvaLevel() {
        return evaLevel;
    }

    public void setEvaLevel(Integer evaLevel) {
        this.evaLevel = evaLevel;
    }

    public Integer getEvaState() {
        return evaState;
    }

    public void setEvaState(Integer evaState) {
        this.evaState = evaState;
    }

    public Integer getOrComid() {
        return orComid;
    }

    public void setOrComid(Integer orComid) {
        this.orComid = orComid;
    }

    public Date getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(Date evaTime) {
        this.evaTime = evaTime;
    }

    public Integer getEvaAnonymous() {
        return evaAnonymous;
    }

    public void setEvaAnonymous(Integer evaAnonymous) {
        this.evaAnonymous = evaAnonymous;
    }
}
