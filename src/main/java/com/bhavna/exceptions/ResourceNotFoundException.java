package com.bhavna.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	String resourceName;
	String fieldName;
	String fieldValue;

	public ResourceNotFoundException(String resourceName, String fieldName, String category) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, category));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = category;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

}
