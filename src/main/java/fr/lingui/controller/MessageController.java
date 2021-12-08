package fr.lingui.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import fr.lingui.entity.Greeting;
import fr.lingui.entity.Message;


@Controller
public class MessageController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public String greeting(Message message) throws Exception {
		System.out.println(message.getContent());
		return new Greeting("Hello " + message.getMessageId()).getContent();
	}
	
}
