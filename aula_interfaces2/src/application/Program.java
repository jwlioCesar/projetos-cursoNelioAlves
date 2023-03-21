package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.Parcelas;
import model.services.PaypalTaxService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double contractValue = sc.nextDouble();

		Contract contract = new Contract(numero, date, contractValue);

		System.out.print("Entre com o numero de parcelas: ");
		int numeroDeParcelas = sc.nextInt();

		Parcelas p = new Parcelas(numeroDeParcelas, contract, new PaypalTaxService());

		System.out.println("Parcelas: ");
		p.processoDeParcelas(contract);

		sc.close();

	}

}
