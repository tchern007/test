package com.sogecap.hackatoon.hackatonserver.rest.model;

public class Counterparty {
	private String id;
	private Routing bank_routing;
	private Routing account_routing;
	private String kind;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}
