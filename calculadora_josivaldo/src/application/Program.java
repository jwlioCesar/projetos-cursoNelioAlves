package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Caculadora;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.print("digite uma operação (x, +, /, -): ");
		//espaço entre os numeros, ex: 3 x 3
		
		double x = sc.nextInt();
		char y = sc.next().charAt(0);
		double z = sc.nextInt();
	
	Caculadora c = new Caculadora (x, y, z);
		
	System.out.println("resultado = " + c.calcular());
	sc.close();

	}

}
