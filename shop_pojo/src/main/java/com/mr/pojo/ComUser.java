package com.mr.pojo;

/**
 * Created by 1115393087 on 2019/5/8.
 */
public class ComUser {

    private Integer userId;

    private Integer comId;


    @Override
    public String toString() {
        return "ComUser{" +
                "userId=" + userId +
                ", comId=" + comId +
                '}';
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
}
