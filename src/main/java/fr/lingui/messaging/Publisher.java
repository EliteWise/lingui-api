package fr.lingui.messaging;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.lingui.config.MessagingConfig;
import fr.lingui.entity.MessageEntityRabbitMQ;

@RestController
@RequestMapping("/send")
public class Publisher {

	@Autowired
	private RabbitTemplate template;
	
	@PostMapping()
	public String sendMessage(@RequestBody MessageEntityRabbitMQ message) {
		message.setMessageId(UUID.randomUUID().toString());
		template.convertSendAndReceive(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, message);
		return "Test";
	}
}
