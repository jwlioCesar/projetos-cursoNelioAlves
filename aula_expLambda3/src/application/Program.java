package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list.forEach(System.out::println);
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'N');
		
		System.out.println(sum);
		
	}

}
