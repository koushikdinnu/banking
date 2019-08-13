package com.capg.serviceLayer;

import java.util.List;

import com.capg.beanlayer.BankDet;

public interface ServiceInterface {
	public void createAccount();
	BankDet showBalance();
	public void deposit();
	public void withDraw();
	 public void fundTransfer();
	 List<String> printTransactions();

}
