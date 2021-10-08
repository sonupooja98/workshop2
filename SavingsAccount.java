package com.ws;

public class SavingsAccount {
	//variable to store annual interest rate
		static private double annualInterestRate;
		private double savingBalance;

		//constructor method
		public SavingsAccount() {

			this.savingBalance=0;
		}

		//Constructor method
		public SavingsAccount(double savingBalance) {

			this.savingBalance=savingBalance;
		}

		//Get saving balance
		public double getSavingBalance() {

			return this.savingBalance;
		}

		public double[] getMonthsSavingBalance(int total_months) {

			double[] monthlyI_month=new double[total_months];
			double monthlyI;
			for(int i=0;i<total_months;i++) {

				monthlyI= (double)(this.savingBalance*annualInterestRate/12);
				this.savingBalance+=monthlyI;
				monthlyI_month[i]=this.savingBalance;
			}
			return monthlyI_month;
		}

		// Modify interest rate by setting annual interest rate to a new value
		public static void modifyInterestRate(double newInterestRate) {

			annualInterestRate=newInterestRate;
		}

		//Method to calculate monthly interest
		public void calculateMonthlyInterest() {

			double monthlyI;
			monthlyI= (double)(this.savingBalance*annualInterestRate/12);
			this.savingBalance+=monthlyI;
		}
		public static void main(String[] args) {
			System.out.println("Banking  Interest rate Calculation");
			SavingsAccount saver = new SavingsAccount();
			saver.setAnnualInterestRest(0.05);
			saver.getAnnualInterestRest();

			saver.calculateMonthlyInterest(2000);
			saver.calculateAnnualInterest(2000);

			SavingsAccount saver1 = new SavingsAccount();
			saver1.setAnnualInterestRest(0.05);
			saver1.getAnnualInterestRest();

			saver1.calculateMonthlyInterest(3000);
			saver1.calculateAnnualInterest(3000);
		}

		public static double annualInterestRest = 0.04;

		public double getAnnualInterestRest() {
			return annualInterestRest;
		}

		public void setAnnualInterestRest(double annualInterestRest) {
			this.annualInterestRest = annualInterestRest;
		}
		public void calculateMonthlyInterest(double balance) {

			double monthlyInerest = (annualInterestRest*balance)/12;
			System.out.println("Your Monthly Interest for Rs." + balance + " is :"+ monthlyInerest);
			System.out.println("New Balance is " + (monthlyInerest+balance));

		}

		public void calculateAnnualInterest(double balance) {

			double annualInerest = (annualInterestRest*balance);
			System.out.println("Your Annual Interest for Rs." + balance + " is :"+ annualInerest);
			System.out.println("New Balance is " + (annualInerest+balance));
		}

	}