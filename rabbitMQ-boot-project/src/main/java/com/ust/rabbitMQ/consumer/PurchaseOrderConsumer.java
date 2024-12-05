package com.ust.rabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;

import com.ust.rabbitMQ.model.OrderStatus;

public class PurchaseOrderConsumer {
	@Value("${ust.rabbitmq.queue}")
	String queuename;
	
	
	@Value("${ust.rabbitmq.exchange}")
	String exchange;
	
	@Value("${ust.rabbitmq.routingkey}")
	private String routingkey;
	
	@RabbitListener(queues = "ust_queue")
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message recived from Queue : " + orderStatus);
	}
}
