package Problem1;

import java.util.Random;

public class BankAccount {
	private String memeberName, accNumber;
	private double accountBalance;

	public BankAccount(String memeberName, double accountBalance) {
		this.memeberName = memeberName;
		this.accountBalance = accountBalance;
		Random rand = new Random();
		accNumber = "" + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);

	}

	public void deposit(double depAmount) {
		accountBalance += depAmount;
	}

	public void withdraw(double withAmount) {
		if ((accountBalance - withAmount) > 0) {
			accountBalance -= withAmount;
		} else
			System.out.println("Insufficient Balance");
	}

	public String getAccNum() {

		return accNumber;
	}

	public double getBalance() {
		return accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [memeberName=" + memeberName + ", accNumber=" + accNumber + ", accountBalance="
				+ accountBalance + "]";
	}
//	public void display()
//	{
//		System.out.println(this);
//	}

//	public void display() {
//		System.out.println("Name: " + memeberName + "\nAccount Number: " + accNumber + "\nBalance: " + accountBalance);
//	}

}
