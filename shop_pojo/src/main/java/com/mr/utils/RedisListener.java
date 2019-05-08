package com.mr.utils;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by 1115393087 on 2019/4/13.
 */
public class RedisListener extends JedisPubSub {

    


    @Override
    public void onPSubscribe(String pattern, int subscribedChannels) {
        System.out.println("onPSubscribe "
                + pattern + " " + subscribedChannels);
    }


    //过期后执行的事件
    @Override
    public void onPMessage(String pattern, String channel, String message) {
        Integer id = Integer.valueOf(message);


        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mr_1809_05";
        String username = "mr_1808";
        String password = "1";

        Connection con = null;
        String sql = "update t_order set ord_state = 3  where ord_id = ?";
        PreparedStatement ps = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);

            ps.execute();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Jedis jedis = redisUtils.redisUtil();
        //jedis.del("OrderList");
        //System.out.println();
        System.err.println("id为{"+message+"}的订单已过期！！！！");
        //System.out.println();
    }


}
