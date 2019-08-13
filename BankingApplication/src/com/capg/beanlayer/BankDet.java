package com.capg.beanlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capg.serviceLayer.Validations;

public class BankDet {
	private String name;
	private String mobilenumber;
	
	private int pin;
	private int balance;
	private double Accountno;
	private static double acctno=1000;
	private List<String> list = new ArrayList<String>();
	Validations v=new Validations();
	Scanner sc=new Scanner(System.in);
	public String getName() {
		return name;
	}
	
		public void setName(String name)
	    {
	        if(v.validateName(name))
	        {
	        this.name = name;
	        }
	        else
	        {
	            System.out.println(" First letter should be capital\n Enter Valid Name:");
	            setName(sc.next());
	        }
	    }
		public String getMobilenumber() {
			return mobilenumber;
		}
		public void setMobilenumber(String mobNum) {
			if(v.validateMobileNumber(mobNum))
			{
			this.mobilenumber=mobNum;	
			}
			else
			{
				System.out.println("Enter valid mobile number");
				setMobilenumber(sc.next());
			}
			// TODO Auto-generated method stub
			
		}

		
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		if(v.validatePin(pin))
		{
		this.pin = pin;
		}
		else
		{
			System.out.println("Enter 4-digit pin number");
			setPin(sc.nextInt());
		}
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getAccountno() {
		return Accountno;
	}
	public void setAccountno() {
		Accountno = ++acctno;
	}
	@Override
	public String toString() {
		return "BankDet [name=" + name + ", mobilenumber=" + mobilenumber + ", pin=" + pin + ", balance=" + balance
				+ ", Accountno=" + Accountno + "]";
	}

	public static double getAcctno() {
		return acctno;
	}
	public static void setAcctno(double acctno) {
		BankDet.acctno = acctno;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(String string) {
		list.add(string);
		
	}
	
	public BankDet(String name,String mobilenumber, int pin, int balance, double accountno) {
		super();
		this.name = name;
		this.mobilenumber=mobilenumber;
		this.pin = pin;
		this.balance = balance;
		Accountno = accountno;
	}

	public BankDet() {
		// TODO Auto-generated constructor stub
	}

	
	
	
}
