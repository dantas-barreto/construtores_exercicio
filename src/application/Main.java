package application;

import java.util.Locale;
import java.util.Scanner;
import util.Account;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = teclado.nextInt();		
		teclado.nextLine();
		System.out.print("Enter account holder: ");
		String holder = teclado.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = teclado.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = teclado.nextDouble();
			account = new Account(holder, number, initialDeposit);
		} else {
			account = new Account(holder, number);
		}
		System.out.println();
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double depositValue = teclado.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = teclado.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		teclado.close();
	}
}
