package com.capg.presentationLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.capg.serviceLayer.BankService;


public class BankMain 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to XYZ bank");
		for(;;)
		{
		Scanner s=new Scanner(System.in);
		
		BankService bs=new BankService();
		System.out.println("1.Create account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Show Balance");
		System.out.println("5.Fund Transfer");
		System.out.println("6.Print Transactions");
		System.out.println("Enter your choice");
		int a=s.nextInt();
		switch(a)
		{
		case 1:bs.createAccount();break;
		case 2:bs.deposit();break;
		case 3:bs.withDraw();break;
		case 4:bs.showBalance();break;
		case 5:bs.fundTransfer();break;
		case 6: List<String> l1=new ArrayList<String>();
        l1=bs.printTransactions();
        Iterator<String> itr=l1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        break;
		default:System.out.println("Enter valid choice");
		}
		 System.out.println("Do u want to continue\n 1.Yes 2.No");
	        if(s.nextInt()==1)
	        {
	            continue;
	        }
	        else
	        {
	        	System.out.println("Thank You");
	            System.exit(0);
	        }
	       s.close();
		}
	}
}
