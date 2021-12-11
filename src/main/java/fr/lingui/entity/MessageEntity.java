package fr.lingui.entity;

public class MessageEntity {
	
	private String userId;
	private String username;
	private String userReceiverId;
	private String userReceiverName;
	private String content;
	private String chatId;

	public MessageEntity() {
		
	}

	public MessageEntity(String userId, String username, String userReceiverId, String userReceiverName, String content) {
		this.userId = userId;
		this.username = username;
		this.userReceiverId = userReceiverId;
		this.userReceiverName = userReceiverName;
		this.content = content;
	}
	
	public MessageEntity(String userId, String username, String userReceiverId, String userReceiverName, String content, String chatId) {
		this.userId = userId;
		this.username = username;
		this.userReceiverId = userReceiverId;
		this.userReceiverName = userReceiverName;
		this.content = content;
		this.chatId = chatId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserReceiverId() {
		return userReceiverId;
	}

	public void setUserReceiverId(String userReceiverId) {
		this.userReceiverId = userReceiverId;
	}

	public String getUserReceiverName() {
		return userReceiverName;
	}

	public void setUserReceiverName(String userReceiverName) {
		this.userReceiverName = userReceiverName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	@Override
	public String toString() {
		return "MessageEntity [userId=" + userId + ", username=" + username + ", userReceiverId=" + userReceiverId
				+ ", userReceiverName=" + userReceiverName + ", content=" + content + ", chatId=" + chatId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chatId == null) ? 0 : chatId.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userReceiverId == null) ? 0 : userReceiverId.hashCode());
		result = prime * result + ((userReceiverName == null) ? 0 : userReceiverName.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MessageEntity other = (MessageEntity) obj;
		if (chatId == null) {
			if (other.chatId != null)
				return false;
		} else if (!chatId.equals(other.chatId))
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userReceiverId == null) {
			if (other.userReceiverId != null)
				return false;
		} else if (!userReceiverId.equals(other.userReceiverId))
			return false;
		if (userReceiverName == null) {
			if (other.userReceiverName != null)
				return false;
		} else if (!userReceiverName.equals(other.userReceiverName))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	

}
