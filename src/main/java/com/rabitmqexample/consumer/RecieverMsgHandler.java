package com.rabitmqexample.consumer;

import com.rabitmqexample.config.RabbitMqConfig;
import com.rabitmqexample.messages.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RecieverMsgHandler {
    @RabbitListener(queues = RabbitMqConfig.QUEUE_NAME)
    public void  handlerMessage(CustomMessage messageBody){
        System.out.println(messageBody);
    }
}
