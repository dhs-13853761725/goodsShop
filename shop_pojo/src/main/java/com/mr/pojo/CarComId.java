package com.mr.pojo;

/**
 * Created by 1115393087 on 2019/5/2.
 */
public class CarComId {

    private Integer userId;

    private Integer carId;

    private Integer count;

    @Override
    public String toString() {
        return "CarComId{" +
                "userId=" + userId +
                ", carId=" + carId +
                ", count=" + count +
                '}';
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
