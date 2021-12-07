package entities;

public class Account {

	private int number;
	private String holder;	
	private double balance;
	
	public static final double TAX = 5.00;
	
	//CONSTRUCTORS
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		
	}
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;		
	}
	
	//GETTERS/SETTERS
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//METHODOS
	
	public void deposit(double amount) {
		this.balance += amount;		
	}
	
	public void withdraw(double amount) {
		
		this.balance -= amount + TAX;
	}
	
	public String toString() {
		return "Account: " 
				+ this.number
				+ ", Holder: "
				+ this.holder
				+ ", Balance: $"
				+ String.format("%.2f",this.balance);
		
	}
	
	
	
}
