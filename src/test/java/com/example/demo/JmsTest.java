package com.example.demo;

import com.example.demo.utils.queue.MessageProducer;
import com.example.demo.utils.queue.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;

/**
 * @author zwq
 * @date 2018/10/19 15:01
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JmsTest {
    @Autowired
    private Producer producer;

    @Autowired
    private MessageProducer messageProducer;



    @Test
    public void contextLoads() throws InterruptedException {
        Destination destination = new ActiveMQQueue("mytest.queue");

        for(int i=0; i<100; i++){
            producer.sendMessage(destination, "myname is chhliu!!!");
        }
    }

    @Test
    public void pubSubTest() throws InterruptedException {

        for(int i=0; i<100; i++){
            messageProducer.send();
        }
    }
}
