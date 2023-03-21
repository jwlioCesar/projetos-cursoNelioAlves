package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite base de um retangulo: ");
		double base = sc.nextDouble();
		System.out.print("digite altura de um retangulo: ");
		double altura = sc.nextDouble();

		Retangulo r = new Retangulo(base, altura);

		System.out.println("area = " + r.calcularArea());
		System.out.println("perimetro = " + r.calcularPerimetro());

		sc.close();
	}

}
