package com.sogecap.hackatoon.hackatonserver.rest.model;

public class Details {
	private String type;
	private String description;
	private String posted;
	private String completed;
	private Balance new_balance;
	private Balance value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPosted() {
		return posted;
	}
	public void setPosted(String posted) {
		this.posted = posted;
	}
	public String getCompleted() {
		return completed;
	}
	public void setCompleted(String completed) {
		this.completed = completed;
	}
	public Balance getNew_balance() {
		return new_balance;
	}
	public void setNew_balance(Balance new_balance) {
		this.new_balance = new_balance;
	}
	public Balance getValue() {
		return value;
	}
	public void setValue(Balance value) {
		this.value = value;
	}
	
	
}
