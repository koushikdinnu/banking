package com.capg.datalayer;

import java.util.List;

import com.capg.beanlayer.BankDet;

public interface DataInterface {
	public void createBankAccount(BankDet b);
	public void deposit(double accountno, int amt);
	public void withDraw(double accountno, int amt);
	public void fundTransfer(double accountno, double acctno, int amt);
	public List<String> printTransction(double Accountno);
	public double checkAccountNo(double accountno);
	public int pincheck(int pin);
}
