package fr.lingui.entity;

public class Message {
	
	private String messageId;
	private String content;
	
	public Message() {
		
	}
	
	public Message(String messageId, String content) {
		this.messageId = messageId;
		this.content = content;
	}

	public String getMessageId() {
		return messageId;
	}
	
	public String getContent() {
		return content;
	}
	
}
