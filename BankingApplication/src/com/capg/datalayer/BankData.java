package com.capg.datalayer;

import java.util.ArrayList;
import java.util.List;

import com.capg.beanlayer.BankDet;

public class BankData implements DataInterface{
	BankDet b=new BankDet();
	 static List<BankDet> list=new ArrayList<BankDet>();
		
		public void createBankAccount(BankDet b) {
		list.add(b);
		System.out.println(list);
		}
		public BankDet showBalance(double accountno,int pin) {
			BankDet b=new BankDet();
			for(BankDet b1:list)
			{
			if(b1.getAccountno()==accountno)
			{
				b=b1;
				System.out.println("Balance is"+b);
				break;
			}
			}
			
			return b;		
		}
		
		public void deposit(double accountno, int amt) {
			
			for(BankDet b1:list){
			if(b1.getAccountno()==accountno)
			{
				b=b1;				 
				break;
			}
			}
			b.setBalance(b.getBalance()+amt);
			System.out.println("amount successfully deposited");
			System.out.println("new balance:"+b.getBalance());
			b.setList(+amt+ " rupees successfully deposited");
			}
		public void withDraw(double accountno, int amt) {
			BankDet b=new BankDet();
			for(BankDet b1:list){
			if(b1.getAccountno()==accountno)
			{
				b=b1;
				break;
			}
			}
			if(b.getBalance()>amt){
				b.setBalance(b.getBalance()-amt);
				System.out.println("amount sucessfully withdrawn");
				System.out.println("Balance="+b.getBalance());
				b.setList(+amt+ " rupees Amount withrawn");
			}
			
		}
			
	public void fundTransfer(double accountno, double acctno, int amt) {
		BankDet b=new BankDet();
		for(BankDet b1:list){
		if(b1.getAccountno()==accountno)
		{
			b=b1;
			break;
		}
		}
		BankDet b2=new BankDet();
		for(BankDet bt:list){
			if(bt.getAccountno()==acctno)
			{
				b2=bt;
				break;
			}
				}
		if(b.getAccountno()!=BankDet.getAcctno()){	
		
		if(b.getBalance()>amt){
				b.setBalance(b.getBalance()-amt);
			
				System.out.println("Amount successfully credited and deposited to required acccount");
				System.out.println("new balance:"+b.getBalance());
				b2.setBalance(b.getBalance()+amt);
				b.setList(+amt+ "rupees Amount succcesfully transferred to required account:");
			}
			else
				System.out.println("Insufficient amount in your account");
		}
		else{
			System.out.println("acccounts are same and hence funds cannot be transferred");
		}
		}

	public List<String> printTransction(double Accountno) {
		BankDet b=new BankDet();
		for(BankDet b1:list)
		if(b1.getAccountno()== Accountno)
		{
			b=b1;
			break;
		}
		return b.getList();
		
		}

	/*account number validation: It checks whether the user enter valid account number or not*/
	public double checkAccountNo(double accountno) {
		int b = 0;
		for(BankDet b1 : list) { 
			   if(b1.getAccountno()==accountno)
			   {
				   b=1;
				  return accountno;
			   }
			}
		if(b==0)
		{
			System.out.println("please enter a valid account number");
		}
	return 1;

		
	}
	/* pin validation: It checks whether the user entered correct pin or not*/
	
	public int pincheck(int pin) {
		int c = 0;
		for(BankDet b1 : list) { 
			   if(b1.getPin()==pin)
			   {
				   c=1;
				  return 0;
			   }
			}
		if(c==0)
		{
			System.out.println("please enter a valid pin");
		}
	return 1;
		// TODO Auto-generated method stub
	
	}

	}

