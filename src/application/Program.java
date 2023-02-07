package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Amount:");
		double amount = sc.nextDouble();
		System.out.println("Months:");
		int months = sc.nextInt();
		InterestService br = new BrazilInterestService(1.0);
		double payment = br.payment(amount, months);
		System.out.println("Payment after " + months + " months: ");
		System.out.print(String.format("%.2f", payment));

		sc.close();
	}
}
