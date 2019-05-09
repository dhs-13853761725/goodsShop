package com.mr.shopcart.pojo;


/**
 * Created by 1115393087 on 2019/4/29.
 */
public class ShopCar {


    //购物车主键
    private Integer carId;

    //用户id
    private Integer usId;

    //商品id  可能有多个
    private String carContent;

    // 优惠卷id
    private Integer yhId;


    @Override
    public String toString() {
        return "ShopCar{" +
                "carId=" + carId +
                ", usId=" + usId +
                ", carContent='" + carContent + '\'' +
                ", yhId=" + yhId +
                '}';
    }


    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getCarContent() {
        return carContent;
    }

    public void setCarContent(String carContent) {
        this.carContent = carContent;
    }

    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }
}
