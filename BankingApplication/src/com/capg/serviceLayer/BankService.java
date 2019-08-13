package com.capg.serviceLayer;

import java.util.List;
import java.util.Scanner;

import com.capg.beanlayer.BankDet;
import com.capg.datalayer.BankData;


public class BankService implements ServiceInterface {
	Scanner s1=new Scanner(System.in);
	Validations v=new Validations();
	BankDet bd=new BankDet();
	BankData b=new BankData();
	
	@Override
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter your name");
		String name=s1.next();
		bd.setName(name);
		System.out.println("Enter mobile Number");
		String mobNum=s1.next();
		bd.setMobilenumber(mobNum);
		System.out.println("Enter new pin");
		int pin=s1.nextInt();
		bd.setPin(pin);
		System.out.println("Enter the amount to be deposited");
		int a=s1.nextInt();
        bd.setBalance(a);
		 bd.setAccountno();
		System.out.println("Account created successfully");
		b.createBankAccount(bd);
	}

	@Override
	public BankDet showBalance() {
		  double i,accountno;
	        int k;
	        int pin;
	        do{
	        System.out.println("enter account no");
	         accountno = s1.nextDouble();
	        i=b.checkAccountNo(accountno);
	        }
	        while(i==1);
	        do{
	        System.out.println("enter the pin");
	         pin=s1.nextInt();
	        k=b.pincheck(pin);
	        }
	        while(k==1);
	        return b.showBalance(accountno,pin);
	       
	    }
		// TODO Auto-generated method stub
		
	

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		double i,accountno;
		do{
		System.out.println("enter the account no");
		 accountno = s1.nextDouble();
		 i=b.checkAccountNo(accountno);
		}
		while(i==1);
		System.out.println("enter the amount:");
		int amt = s1.nextInt();
		b.deposit(accountno, amt);
	}

	@Override
	public void withDraw() {
		 double i,accountno;
	       
	        
	        do{
	        System.out.println("enter the account no");
	         accountno = s1.nextDouble();
	         i=b.checkAccountNo(accountno);
	        }
	        while(i==1);
	        System.out.println("enter the amount to be withdrawn:");
	        int amt = s1.nextInt();
	        b.withDraw(accountno, amt);
	        
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fundTransfer() {
		  double i,accountno;
	        
	        do{
	        System.out.println("enter the account number to which amount has to be credited:");
	         accountno = s1.nextDouble();
	         i=b.checkAccountNo(accountno);
	        }
	        while(i==1);
	    do{
	        System.out.println("enter the account number from where amount has to be debited:");
	         accountno = s1.nextDouble();
	        i=b.checkAccountNo(accountno);
	    }
	    while(i==1);
	        System.out.println("enter the amount to be transferred");
	        int amt = s1.nextInt();
	        double acctto = 0;
	        b.fundTransfer(accountno, acctto, amt);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> printTransactions() {
		// TODO Auto-generated method stub
		 double i,accountno;
	       
	        do{
	        System.out.println("enter the account no");
	         accountno = s1.nextDouble();
	         i=b.checkAccountNo(accountno);
	        }
	        while(i==1);
	        
	        return b.printTransction(accountno);
	}

	

}
