package com.sogecap.hackatoon.hackatonserver.rest.model;

import java.util.ArrayList;
import java.util.List;

public class Transactions extends JSonRoot{

	List<Transaction> transactions = new ArrayList<Transaction>();

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	
	
}
