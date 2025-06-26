package bank;

public class ExceptionExample {
	public static void main(String[] args) {
		BankAccount account = new BankAccount("ali" , 1000);
		try {
			account.withdraw(500);
			account.withdraw(600);
		}
		catch(BalanceException e) {
			System.out.println("error" + e.getMessage());
		}
	}

}
