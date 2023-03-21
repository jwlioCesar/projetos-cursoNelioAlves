package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.abstractShape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		abstractShape c1 = new Circle(Color.BLACK, 2.0);
		abstractShape c2 = new Rectangle(Color.BLUE, 3.0, 4.0);
		
		System.out.println("Circle color: " + c1.getColor() );
		System.out.println("Rectangle color: " + c2.getColor() );

		sc.close();

	}

}
