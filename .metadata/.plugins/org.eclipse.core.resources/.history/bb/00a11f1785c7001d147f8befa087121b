package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		double months = sc.nextDouble();
		
		InterestService is = new BrazilInterestService();
		
		System.out.println("Payment after "+ months + " months:");
		System.out.printf("%.2f",is.payment(amount, months));
		
		sc.close();
	}

}
