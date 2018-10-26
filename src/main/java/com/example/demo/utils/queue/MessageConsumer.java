package com.example.demo.utils.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 点对点和订阅模式的消息接收者
 * @author zwq
 * @date 2018/10/25 15:52
 */
@Service
public class MessageConsumer {

    @JmsListener(destination = "test.queue")
    public void receiveQueue(String text) {
        System.out.println("Consumer2="+text);
    }

//    @JmsListener(destination = "sample.topic")
//    public void receiveTopic(String text) {
//        System.out.println("Consumer3="+text);
//    }

}
