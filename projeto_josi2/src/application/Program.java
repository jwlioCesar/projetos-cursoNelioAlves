package application;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a marca do carro: ");
		String marca = sc.next();
		System.out.print("digite a modelo do carro: ");
		String modelo = sc.next();
		System.out.print("digite o ano do carro: ");
		int ano = sc.nextInt();
		
		Carro carro = new Carro(marca, modelo, ano);
		System.out.println();
		System.out.println("informações do carro");
		System.out.println(carro.getInformacoes());
		
sc.close();
	}

}
