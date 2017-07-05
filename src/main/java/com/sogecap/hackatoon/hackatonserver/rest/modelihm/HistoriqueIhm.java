package com.sogecap.hackatoon.hackatonserver.rest.modelihm;

import java.util.ArrayList;
import java.util.List;

public class HistoriqueIhm 
{
	private String avoirActuel;
	private String theme;
	private List<TransactionIhm> transactions = new ArrayList<TransactionIhm>();
	
	public String getAvoirActuel() {
		return avoirActuel;
	}
	public void setAvoirActuel(String avoirActuel) {
		this.avoirActuel = avoirActuel;
	}
	public List<TransactionIhm> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionIhm> transactions) {
		this.transactions = transactions;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	
	
	
}
