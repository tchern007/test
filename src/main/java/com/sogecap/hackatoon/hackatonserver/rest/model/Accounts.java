package com.sogecap.hackatoon.hackatonserver.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Accounts {

	List<Account> accounts = new ArrayList<Account>();

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	
}
