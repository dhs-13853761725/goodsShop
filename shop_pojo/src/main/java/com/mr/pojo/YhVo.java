package com.mr.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 1115393087 on 2019/5/8.
 */
public class YhVo {

    //优惠卷id
    private Integer yhId;

    //优惠卷独有的编号
    private String yhUuid;

    //商品id
    private Integer comId;

    //优惠卷生效时间
    private Date yhDateB;

    //优惠卷失效时间
    private Date yhDateE;

    //优惠价格
    private Double yhPrice;

    //使用方式  1 满减   2  无门槛
    private Integer yhType;

    //获取方式
    private Integer yhHq;

    //满减金额   满减专属 使用
    private Double yhFull;

    //当前优惠卷是否使用过
    private Integer yhDesc;


    public String getYhDateEs(){
        if(yhDateE != null){
            return new SimpleDateFormat("yyyy-MM-dd").format(yhDateE);
        }
        return "";
    }

    public String getYhDateBs(){
        if(yhDateB != null){
            return new SimpleDateFormat("yyyy-MM-dd").format(yhDateB);
        }
        return "";
    }



    @Override
    public String toString() {
        return "YhVo{" +
                "yhId=" + yhId +
                ", yhUuid='" + yhUuid + '\'' +
                ", comId=" + comId +
                ", yhDateB=" + yhDateB +
                ", yhDateE=" + yhDateE +
                ", yhPrice=" + yhPrice +
                ", yhType=" + yhType +
                ", yhHq=" + yhHq +
                ", yhFull=" + yhFull +
                ", yhDesc=" + yhDesc +
                '}';
    }

    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public String getYhUuid() {
        return yhUuid;
    }

    public void setYhUuid(String yhUuid) {
        this.yhUuid = yhUuid;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Date getYhDateB() {
        return yhDateB;
    }

    public void setYhDateB(Date yhDateB) {
        this.yhDateB = yhDateB;
    }

    public Date getYhDateE() {
        return yhDateE;
    }

    public void setYhDateE(Date yhDateE) {
        this.yhDateE = yhDateE;
    }

    public Double getYhPrice() {
        return yhPrice;
    }

    public void setYhPrice(Double yhPrice) {
        this.yhPrice = yhPrice;
    }

    public Integer getYhType() {
        return yhType;
    }

    public void setYhType(Integer yhType) {
        this.yhType = yhType;
    }

    public Integer getYhHq() {
        return yhHq;
    }

    public void setYhHq(Integer yhHq) {
        this.yhHq = yhHq;
    }

    public Double getYhFull() {
        return yhFull;
    }

    public void setYhFull(Double yhFull) {
        this.yhFull = yhFull;
    }

    public Integer getYhDesc() {
        return yhDesc;
    }

    public void setYhDesc(Integer yhDesc) {
        this.yhDesc = yhDesc;
    }
}
