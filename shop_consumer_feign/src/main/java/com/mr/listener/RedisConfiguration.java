package com.mr.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@Configuration
public class RedisConfiguration {

    @Autowired
    private RedisConnectionFactory redisConfiguration;

    @Bean
    public RedisMessageListenerContainer redisMessageListenerContainer(){
        RedisMessageListenerContainer config = new RedisMessageListenerContainer ();
        config.setConnectionFactory(redisConfiguration);
        return config;
    }

    @Bean
    public KeyListener keyListener(){
        System.err.println("redis 过期监听已启动》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
        return new KeyListener(this.redisMessageListenerContainer());
    }


}
