package com.hrothwell.shiritori.websockets.messages;

import org.owasp.encoder.Encode;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicMessage {
	
	private String userName;
	private String message;
	
	public BasicMessage() {
		//empty for Jackson serialization
	}
	
	public BasicMessage(String userName, String message) {
		this.setUserName(userName);
		this.setMessage(message);
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = Encode.forHtml(userName);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = Encode.forHtml(message);
	}
	
}
