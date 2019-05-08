package com.mr.utils;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by 1115393087 on 2019/4/2.
 */
public class redisUtils {


    public static Jedis redisUtil(){
        GenericObjectPoolConfig config = new GenericObjectPoolConfig();
        JedisPool jedisPool = new JedisPool(config,"127.0.0.1",6379,1000,"123");
        Jedis redis = jedisPool.getResource();
        return redis;
    }

}
