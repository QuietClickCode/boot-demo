package com.example.demo.utils.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import javax.jms.Topic;


/**
 * 点对点和订阅模式的消息发布
 * @author zwq
 * @date 2018/10/25 15:51
 */
@Component
@EnableScheduling
public class MessageProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private TopicConfig topicConfig;

    public void send() {
        //send queue.
        this.jmsMessagingTemplate.convertAndSend(topicConfig.queue(), "hi,activeMQ(queue)");
        //send topic.
//        this.jmsMessagingTemplate.convertAndSend(topicConfig.topic(), "hi,activeMQ(topic)");
    }

}