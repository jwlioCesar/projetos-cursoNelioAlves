package application;

import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Defina o saldo da conta: R$");
			Banco b = new Banco(sc.nextDouble());

			System.out.print("quanto você deseja sacar? R$");
			b.saque(sc.nextDouble());
			System.out.println("novo saldo: " + b.getSaldo());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
