package com.sogecap.hackatoon.hackatonserver.rest.model;


import java.util.ArrayList;
import java.util.List;

public class Account extends JSonRoot{

	private String id;
	private String bank_id;
	private String label;
	private String number;
	private List<Owners> owners = new ArrayList<Owners>();
	private String type;
	private Balance balance;
	private Routing bank_routing;
	private Routing account_routing;
	private String kind;
	
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public Routing getBank_routing() {
		return bank_routing;
	}
	public void setBank_routing(Routing bank_routing) {
		this.bank_routing = bank_routing;
	}
	public Routing getAccount_routing() {
		return account_routing;
	}
	public void setAccount_routing(Routing account_routing) {
		this.account_routing = account_routing;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBank_id() {
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public List<Owners> getOwners() {
		return owners;
	}
	public void setOwners(List<Owners> owners) {
		this.owners = owners;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Balance getBalance() {
		return balance;
	}
	public void setBalance(Balance balance) {
		this.balance = balance;
	}
	

	
	
	
}
