package com.mr.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by shun on 2019/5/8.
 */
public class Evaluate {

    private Integer evaId;//评价ID

    private Integer userId;//用户id

    private String userName;//姓名

    private Integer comId;//商品Id

    private String comName;//商品名

    private Integer comType;//商

    private Integer comPack;//包装

    private Double comMoney;// 单价

    private Integer comCount;//数量

    private String evaContent;//内容

    private Integer evaLevel;//级别 好中差

    private Integer evaState;//状态

    private Date evaTime;

    @Override
    public String toString() {
        return "Evaluate{" +
                "evaId=" + evaId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", comId=" + comId +
                ", comName='" + comName + '\'' +
                ", comType=" + comType +
                ", comPack=" + comPack +
                ", comMoney=" + comMoney +
                ", comCount=" + comCount +
                ", evaContent='" + evaContent + '\'' +
                ", evaLevel=" + evaLevel +
                ", evaState=" + evaState +
                ", evaTime=" + evaTime +
                '}';
    }
public String getEvaTimes(){
        if(evaTime != null){
            return new SimpleDateFormat("yyyy-MM-dd").format(evaTime);
        }
        return "";
}

    public Date getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(Date evaTime) {
        this.evaTime = evaTime;
    }

    public Integer getEvaId() {
        return evaId;
    }

    public void setEvaId(Integer evaId) {
        this.evaId = evaId;
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

    public Integer getComType() {
        return comType;
    }

    public void setComType(Integer comType) {
        this.comType = comType;
    }

    public Integer getComPack() {
        return comPack;
    }

    public void setComPack(Integer comPack) {
        this.comPack = comPack;
    }

    public Double getComMoney() {
        return comMoney;
    }

    public void setComMoney(Double comMoney) {
        this.comMoney = comMoney;
    }

    public Integer getComCount() {
        return comCount;
    }

    public void setComCount(Integer comCount) {
        this.comCount = comCount;
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

    public Evaluate() {
    }

    public Evaluate(Integer evaId, Integer userId, String userName, Integer comId, String comName, Integer comType, Integer comPack, Double comMoney, Integer comCount, String evaContent, Integer evaLevel, Integer evaState,Date evaTime) {
        this.evaId = evaId;
        this.userId = userId;
        this.userName = userName;
        this.comId = comId;
        this.comName = comName;
        this.comType = comType;
        this.comPack = comPack;
        this.comMoney = comMoney;
        this.comCount = comCount;
        this.evaContent = evaContent;
        this.evaLevel = evaLevel;
        this.evaState = evaState;
        this.evaTime = evaTime;
    }

}
