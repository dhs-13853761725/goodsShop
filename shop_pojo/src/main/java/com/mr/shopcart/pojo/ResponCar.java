package com.mr.shopcart.pojo;



/**
 * Created by 1115393087 on 2019/4/29.
 */

public class ResponCar {

    private Integer carId;

    //优惠卷id
    private Integer yhId;

    //商品id
    private Integer comId;

    //购物车中的商品id  可能有多个
    private String carContent;

    //用户id
    private Integer userId;

    // 优惠价格
    private Double yhPrice;

    // 商品名称
    private String comName;

    //商品数量  购买了多少件||个
    private Integer carCount;

    // 商品图片
    private String imgOne;

    //运费
    private Integer comFreight;

    //样式     颜色
    private String comFlavor;

    //外部     包装
    private String comPack;

    //库存
    private Integer comCount;

    //原价
    private Double comPrice;

    //促销价
    private Double comMoney;



    private String comNumber;//商品编号
    private Integer comType;//商品类型
    private Integer comState;//商品状态

    private Integer comAcvitity;//优惠券





    //现价就是原价减去优惠价格


    //总价格
    public String getCarZong12(){
        if(carCount != null && comMoney != null){
            return ""+carCount * comMoney;
        }
        return "";
    }

    @Override
    public String toString() {
        return "ResponCar{" +
                "carId=" + carId +
                ", yhId=" + yhId +
                ", comId=" + comId +
                ", carContent='" + carContent + '\'' +
                ", userId=" + userId +
                ", yhPrice=" + yhPrice +
                ", comName='" + comName + '\'' +
                ", carCount=" + carCount +
                ", imgOne='" + imgOne + '\'' +
                ", comFreight=" + comFreight +
                ", comFlavor='" + comFlavor + '\'' +
                ", comPack='" + comPack + '\'' +
                ", comCount=" + comCount +
                ", comPrice=" + comPrice +
                ", comMoney=" + comMoney +
                ", comNumber='" + comNumber + '\'' +
                ", comType=" + comType +
                ", comState=" + comState +
                ", comAcvitity=" + comAcvitity +
                '}';
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

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getCarContent() {
        return carContent;
    }

    public void setCarContent(String carContent) {
        this.carContent = carContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Double getYhPrice() {
        return yhPrice;
    }

    public void setYhPrice(Double yhPrice) {
        this.yhPrice = yhPrice;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public Integer getCarCount() {
        return carCount;
    }

    public void setCarCount(Integer carCount) {
        this.carCount = carCount;
    }

    public String getImgOne() {
        return imgOne;
    }

    public void setImgOne(String imgOne) {
        this.imgOne = imgOne;
    }

    public Integer getComFreight() {
        return comFreight;
    }

    public void setComFreight(Integer comFreight) {
        this.comFreight = comFreight;
    }

    public String getComFlavor() {
        return comFlavor;
    }

    public void setComFlavor(String comFlavor) {
        this.comFlavor = comFlavor;
    }

    public String getComPack() {
        return comPack;
    }

    public void setComPack(String comPack) {
        this.comPack = comPack;
    }

    public Integer getComCount() {
        return comCount;
    }

    public void setComCount(Integer comCount) {
        this.comCount = comCount;
    }

    public Double getComPrice() {
        return comPrice;
    }

    public void setComPrice(Double comPrice) {
        this.comPrice = comPrice;
    }

    public Double getComMoney() {
        return comMoney;
    }

    public void setComMoney(Double comMoney) {
        this.comMoney = comMoney;
    }

    public String getComNumber() {
        return comNumber;
    }

    public void setComNumber(String comNumber) {
        this.comNumber = comNumber;
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

    public Integer getComAcvitity() {
        return comAcvitity;
    }

    public void setComAcvitity(Integer comAcvitity) {
        this.comAcvitity = comAcvitity;
    }
}
