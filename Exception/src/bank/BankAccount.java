package bank;

public class BankAccount {
  
	private int balance;
	private String name; 
	
	public BankAccount(String name , int balance) {
		this.name = name;
		this.balance = balance;
	}
	public void withdraw(int amount) throws BalanceException{
		if(amount>balance) {
			throw new BalanceException("Insufficient balance");
		}
		balance -= amount;
		System.out.println("Withdrawal successful");
	}
	public void showBalance() {
		System.out.println( name +" ka balance" + balance);
	}
}
