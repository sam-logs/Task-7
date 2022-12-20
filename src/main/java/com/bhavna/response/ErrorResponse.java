package com.bhavna.response;

public class ErrorResponse {
	private String message;
	private boolean success;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ErrorResponse(String message, boolean success) {
		super();
		this.message = message;
		this.success = success;
	}

	public ErrorResponse() {
		super();
	}

	

}
