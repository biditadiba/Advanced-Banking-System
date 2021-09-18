package Problem1;

import java.util.ArrayList;

public class Bank {
	String bankName;

	ArrayList<BankAccount> accounts;

	Bank(String bankName) {
		this.bankName = bankName;
		// accounts = new ArrayList<>();
	}

	private void addAccount(BankAccount acc) {
		accounts.add(acc);
	}

	public String addAccount(String name, double balance) {
		BankAccount acc = new BankAccount(name, balance);
		addAccount(acc);
		return acc.getAccNum();

	}

	private BankAccount findAccount(String accNum) {

		for (BankAccount b : accounts) {
			if (b.getAccNum().equals(accNum)) {
				return b;

			}

		}

		return null;
	}

	public void deposit(String accNum, double depAmount) {
		BankAccount bank = findAccount(accNum);
		if (bank != null) {
			bank.deposit(depAmount);
		} else {
			System.out.println("Bank Account not found");
		}

	}

	public void withdraw(String accNumber, double withdrawAmount) {
		BankAccount bank = findAccount(accNumber);

		if (bank != null) {
			bank.withdraw(withdrawAmount);
		} else {
			System.out.println("Bank Account not found");
		}
	}

	public void display(String accNum) {

		BankAccount bank = findAccount(accNum);
		if (bank != null)
			// bank.toString();
			System.out.println(bank.toString());
	}

	public void display() {
		for (BankAccount b : accounts) {
			System.out.println(b.toString());
		}
	}

}
