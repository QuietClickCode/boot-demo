package com.example.demo.utils.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * 创建 点对点模式的对象和发布订阅模式的对象
 * @author zwq
 * @date 2018/10/25 15:35
 */
@Configuration
public class TopicConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("test.queue");
    }

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("sample.topic");
    }
}
