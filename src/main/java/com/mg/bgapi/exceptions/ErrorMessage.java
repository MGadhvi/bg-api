package com.mg.bgapi.exceptions;

public class ErrorMessage {
	private String url;
	private String message;

	public ErrorMessage(String url, String message) {
		this.url = url;
		this.message = message;
	}

	public String getUrl() {
		return url;
	}

	public String getMessage() {
		return message;
	}
}
