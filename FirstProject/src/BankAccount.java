/*
Program description: This program will hold the users banking information, 
including their personal info, money exchange, and bills received
Author: Ahmad Shabaneh
Assignment: PA1
Date: May, 31 2018
Class: CSCI 1082
*/

import java.text.NumberFormat;

import java.util.Locale;
import java.util.Scanner;

public class BankAccount 
{
	public static void main(String[] args)
	{	
		//Use to be able to input 
		Scanner cin = new Scanner(System.in);
		//Corrects values to US dollar formats
		NumberFormat numberFormatter = NumberFormat.getCurrencyInstance(Locale.US);
		 
		//Variables
		String name, street, city, state, zipcode, ssn;
		double withdraw, deposit, iBalance, cBalance;
		//Constants
		final int CORRECT_CHAR_SSN = 10;
		final int CORRECT_CHAR_ZIP = 5;
		
		
		//INPUT ALL INFORMATION FOR ACCOUNT
		System.out.print("Full name: ");   //name
		name = cin.nextLine();
		
		System.out.print("Street address: ");	//address
		street = cin.nextLine();
		
		System.out.print("City: ");	  //city
		city = cin.nextLine();
		
		System.out.print("State: ");   //state
		state = cin.nextLine();
		
		System.out.print("Zipcode: ");	//zipcode
		zipcode = cin.nextLine();
		int zipcodeLength = zipcode.length();
		//Loop until the zipcode's length matches the constants value
		while (zipcodeLength != CORRECT_CHAR_ZIP)
		{
			System.out.print("Input invalid, please re-enter Zipcode: ");
			zipcode = cin.nextLine();
			zipcodeLength = zipcode.length();
		}
		
		System.out.print("Social Security Number: ");   //social security number
		ssn = cin.nextLine();
		int ssnLength = ssn.length();
		//Loop until the ssn's length matches the constants value
		while (ssnLength != CORRECT_CHAR_SSN)
		{
			System.out.print("Input invalid, please re-enter Social Security Number: ");
			ssn = cin.nextLine();
			ssnLength = ssn.length();
		}		
		
		System.out.println(">============================<");
		System.out.println("YOUR ACCOUNT IS NOW READY");
		System.out.println(">============================<");
		
		
		System.out.print("How much money do you want to add to your account: ");  //Initial balance
		iBalance = cin.nextDouble();
		
		System.out.print("Amount to withdraw: ");   //Withdraw
		withdraw = cin.nextDouble();
		
		System.out.print("Amount to deposit: ");   //Deposit
		deposit = cin.nextDouble();
		cBalance = iBalance + deposit - withdraw;   //Measures current balance
		System.out.println("The current balance is: " + cBalance);
		
		
		cin.close();
		
		
		
		
		System.out.println("\n************************************************");
		System.out.println("****************ACCOUNT INFORMATION*************");			
		System.out.println("************************************************");
		
		
		//OUTPUTS YOUR PROFILE INFORMATION IN A TABLE
		System.out.println("\nProfile: \n");
		
			System.out.printf("%-20s %-25s %-10s %-10s %-10s %-5s%n", 
					"Full Name","Address", "City", "State", "Zipcode", "SSN");
				
			System.out.printf("%-20s %-25s %-10s %-10s %-10s %s-%s-%-5s %n%n%n",
					name, street, city, state, zipcode, ssn.substring(0, 3), ssn.substring(3, 6), ssn.substring(6, 10));
				
		
		
		//OUTPUTS YOUR ACCOUNTING INFORMATION
		System.out.printf("Account Summary: \n\n");
		
			System.out.printf("Initial Balance: %s%nWithdraw: %s%nDeposit: %s%nCurrent Balance: %s%n%n%n", 
					numberFormatter.format(iBalance), numberFormatter.format(withdraw), numberFormatter.format(deposit), 
					numberFormatter.format(cBalance));
		
		
		//MEASURE HOW MANY OF EACH BILL USER HAS RECEIVED
		double hundredBills =  cBalance / 100;   //Hundreds
		hundredBills = Math.floor(hundredBills);
		
		double twentyBills = (cBalance - (hundredBills * 100)) / 20;   //Twenties
		twentyBills = Math.floor(twentyBills);
		
		double tenBills = (cBalance - (hundredBills * 100) - (twentyBills * 20)) / 10;   //Tens
		tenBills = Math.floor(tenBills);
		
		double fiveBills = (cBalance- (hundredBills * 100) - (twentyBills * 20) - (tenBills * 10)) / 5;   //Fives
		fiveBills = Math.floor(fiveBills);
		
		double oneBills = (cBalance- (hundredBills * 100) - (twentyBills * 20) - (tenBills * 10) - (fiveBills * 5));   //Ones
		oneBills = Math.floor(oneBills);
		
		
		//Outputs your bills recieved
		System.out.println("Bill Count: \n");
		
			System.out.printf("$100 bills: %d%n$20 bills: %d%n$10 bills: %d%n$5 bills: %d%n$1 bills: %d", 
					(int)hundredBills, (int)twentyBills, (int)tenBills, (int)fiveBills, (int)oneBills);
			
		
	}
}
