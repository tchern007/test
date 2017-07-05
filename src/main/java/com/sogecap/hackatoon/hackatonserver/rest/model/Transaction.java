package com.sogecap.hackatoon.hackatonserver.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

	private String id;
	private Account account;
	private Counterparty counterparty;
	private Details details;
	private List<Holder> holders =  new ArrayList<Holder>();
	

	public List<Holder> getHolders() {
		return holders;
	}
	public void setHolders(List<Holder> holders) {
		this.holders = holders;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Counterparty getCounterparty() {
		return counterparty;
	}
	public void setCounterparty(Counterparty counterparty) {
		this.counterparty = counterparty;
	}
	public Details getDetails() {
		return details;
	}
	public void setDetails(Details details) {
		this.details = details;
	}
	
	
	
}
