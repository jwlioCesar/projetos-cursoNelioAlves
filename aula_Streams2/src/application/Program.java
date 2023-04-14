package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("enter full file path: ");
		String path = sc.nextLine();
		// c://temp//eclipse-workspace//aula_Streams2//in.txt

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			List<Product> list = new ArrayList<>();

			while (line != null) {
				String fields[] = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Double avg = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0, (x, y) -> x + y) / list.size();

			System.out.printf("AVERAGE PRICE: %.2f \n", avg);

			Comparator<String> comp = (s1, s2) -> s2.toUpperCase().compareTo(s1.toUpperCase());

			List<String> newList = list.stream()
					.filter(x -> x.getPrice() < avg)
					.map(x -> x.getName())
					.sorted(comp)
					.collect(Collectors.toList());

			newList.forEach(System.out::println);

		} catch (IOException e) {
			e.getMessage();
		} finally {
			sc.close();
		}

	}

}
