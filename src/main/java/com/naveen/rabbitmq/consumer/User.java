package com.naveen.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.naveen.rabbitmq.config.MessagingConfig;
import com.naveen.rabbitmq.dto.OrderStatus;

@Component
public class User {
	
	@RabbitListener(queues=MessagingConfig.QUEUE)
	public void consumerMessageFromQueue(OrderStatus orderStatus)
	{
		System.out.println("message received from queue "+orderStatus);
	}

}
