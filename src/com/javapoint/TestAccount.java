package com.javapoint;

class Account{
	int acc_no;
	String name;
	float amount;
	
	//method to initialize abject
	void insert(int a, String n, float amt) {
		acc_no=a;
		name=n;
		amount=amt;
		}
	//deposit method
	void deposit(float amt) {
		amount=amount+amt;
		System.out.println(amt+" deposited");
		}
	//withdraw method
	void withdraw(float amt) {
		if(amount<amt) {
			System.out.println("Insufficient funds");
		}else {
			amount=amount-amt;
			System.out.println(amt+" withdrawn");
		}
	}
	//method to check balance
	void checkBalance() {
		System.out.println("Balance is "+amount);
		}
	//method to display values of objects
	void display() {
		System.out.println(acc_no+" "+name+" "+amount);
		}}
	//creating a test class to deposit and withdraw amounts
	class TestAccount{
		public static void main(String[] args) {
			Account a1=new Account();
			a1.insert(5, "Barry", 2540);
			a1.display();
			a1.checkBalance();
			a1.deposit(6543);
			a1.checkBalance();
			a1.withdraw(500);
			a1.checkBalance();
		}
	}
	