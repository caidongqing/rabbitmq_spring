package mq.service;

import org.springframework.amqp.core.Message;

import org.springframework.amqp.core.MessageListener;

public class QueueOneLitener implements

		MessageListener {

	public void onMessage(Message message) {

		System.out.println("data :" + new String(message.getBody()));

	}

}