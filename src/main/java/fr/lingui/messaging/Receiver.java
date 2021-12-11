package fr.lingui.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import fr.lingui.config.MessagingConfig;
import fr.lingui.entity.MessageEntityRabbitMQ;

@Component
public class Receiver {

	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void receiveMessage(MessageEntityRabbitMQ message) {
		System.out.println("Listener: " + message.getContent());
	}
	
}
