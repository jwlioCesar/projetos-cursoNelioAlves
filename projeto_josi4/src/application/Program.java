package application;

import entities.Animal;
import entities.Cachorro;
import entities.Gato;

public class Program {

	public static void main(String[] args) {

		Animal gato = new Gato("eduardo", "siames");
		Cachorro cachorro = new Cachorro("scooby", "pitbull");
	
		System.out.println(gato.brincar());
		System.out.println(cachorro.brincar());
		
	}
}
