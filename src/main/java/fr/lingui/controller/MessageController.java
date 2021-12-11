package fr.lingui.controller;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import fr.lingui.entity.MessageEntity;


@Controller
public class MessageController {

	@MessageMapping("/message/{chatId}")
	@SendTo("/broker")
	public MessageEntity chatData(MessageEntity message, @DestinationVariable String chatId) throws Exception {
		System.out.println(message);
		message.setChatId(chatId);
		return message;
	}
	
}
