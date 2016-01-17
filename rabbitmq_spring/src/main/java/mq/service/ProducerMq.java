package mq.service;

import

org.springframework.amqp.core.AmqpTemplate;

import

org.springframework.beans.factory.annotation.Autowired;

import

org.springframework.stereotype.Service;

@Service

public class ProducerMq {

	@Autowired
	private AmqpTemplate amqpTemplate;

	public void sendDataToCrQueue(Object obj) {

		amqpTemplate.convertAndSend("queue_one_key", obj);

	}

}