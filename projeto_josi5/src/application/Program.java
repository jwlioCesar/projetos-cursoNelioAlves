package application;

import entities.Retangulo;
import exceptions.DimensaoInvalidaException;

public class Program {

	public static void main(String[] args) {

		try {

			Retangulo ret = new Retangulo(-1.0, 4.0);
			System.out.println("area: " + ret.calcularArea());

		} catch (DimensaoInvalidaException e) {
			System.out.println(e.getMessage());
		}
	}

}
