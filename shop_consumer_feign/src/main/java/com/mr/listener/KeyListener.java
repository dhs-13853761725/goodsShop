package com.mr.listener;

import com.mr.pay.service.PayServiceFeign;
import com.mr.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.lang.Nullable;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * Created by 1115393087 on 2019/5/7.
 */
@Component
public class KeyListener extends KeyExpirationEventMessageListener {

    @Autowired
    private PayServiceFeign payServiceFeign;


    @Autowired
    private JavaMailSender mailSender;



    public KeyListener(RedisMessageListenerContainer listenerContainer) {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, @Nullable byte[] pattern) {
        String key = new String(message.getBody());
        //如果第一位为q那么就是 订单过期
            if(key.substring(0,1).equals("q")){
                key = key.substring(1,key.length());
                System.err.println("该用户在指定时间内未完成订单的支付{"+key+"}该订单已过期>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                //当订单过期时  这是通过订单我uuid去修改的  将状态该为3   3 是订单已过期
                payServiceFeign.updateStateKey(key);
                System.err.println("该key{"+key+"}已过期>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        //否则  就是 已经收货
            }else if(key.substring(0,1).equals("a")){
                key = key.substring(1,key.length());
                System.err.println("{"+key+"}该订单已收货>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                //当订单过期时  这是通过订单我uuid去修改的  将状态该为3   3 是订单已过期
                payServiceFeign.updateAcceptKey(key);
                System.err.println("{"+key+"}该订单已收货>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            }else{
                System.err.println("开始发送邮件   催促卖家发货中》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
                String[] id = key.split(",");
                SimpleMailMessage message1 = new SimpleMailMessage();
                message1.setFrom("xiaogengi@163.com");//发件人
                message1.setTo("2580030645@qq.com");//收件人
                message1.setSubject("请尽快发货");// 标题
                System.err.println(id[0]+",,,,,,"+id[1]);
                message1.setText("{"+id[1]+"}，希望你尽快发货");// 内容
                //message1.setText("123123");
                //修改状态为 催货完成
                mailSender.send(message1);
                System.err.println("邮件发送成功 》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》》");
            }


    }
}
