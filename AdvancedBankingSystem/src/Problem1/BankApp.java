package Problem1;

import javax.swing.JOptionPane;

public class BankApp {
	public static void main(String[] args) {
		// String name = JOptionPane.showInputDialog("Enter name: ");
		Bank bank = new Bank("Bangladesh Krishi Bank"); // ("Bangladesh Krishi Bank");

		int option;
		while (true)

		{
			option = getUserInput();
			switch (option) {
			case 1:
				String name = JOptionPane.showInputDialog("Enter name: ");
				String balance = JOptionPane.showInputDialog("Enter initial balance:");
				double accountBalance = Integer.parseInt(balance);
				String Bk = bank.addAccount(name, accountBalance);
				System.out.println(Bk);
				break;

			case 2:

				String accNumber = JOptionPane.showInputDialog("Enter account number: ");
				String balance2 = JOptionPane.showInputDialog("Enter deposit amount:");
				double depAmount = Integer.parseInt(balance2);
				bank.deposit(accNumber, depAmount);
				break;

			case 3:
				System.out.println("Enter account number and withdraw amountwithdraw amount:");
				String accNumber2 = JOptionPane.showInputDialog("Enter account number: ");
				String balance3 = JOptionPane.showInputDialog("Enter withdraw amount:");
				double withAmount = Integer.parseInt(balance3);
				bank.withdraw(accNumber2, withAmount);
				break;

			case 4:
				String accNumber3 = JOptionPane.showInputDialog("Enter account number: ");
				bank.display(accNumber3);
				break;

			case 5:
				bank.display();

				break;

			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}

	}

	public static int getUserInput() {
		String op = JOptionPane
				.showInputDialog("\nMenu\n" + "Enter 1 to create a new account.\n" + "Enter 2 to deposit money.\n"
						+ "Enter 3 withdraw money\n" + "Enter 4 to display the account info of a particular account\n"
						+ "Enter 5 to display all accounts info\n" + "Enter 0 to Exit\n" + "Enter Your Choice: ");
		int option = Integer.parseInt(op);
		return option;
	}

}
