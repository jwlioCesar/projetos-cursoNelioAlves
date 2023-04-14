package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full path name: ");
		String path = sc.nextLine();
		//c://temp//eclipse-workspace//aula_Streams3//in.txt
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			List<Employee> list = new ArrayList<>();

			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (n1, n2) -> n1.toUpperCase().compareTo(n2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(x -> x.getSalary() > 2000.00)
					.map(x -> x.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than 2000.00");
			emails.forEach(System.out::println);
			
			Double sum = list.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getSalary())
					.reduce(0.0 , (x,y) -> x + y);
					
			System.out.println("Sum of salary of people whose name starts with 'M': " + sum);

		} catch (Exception e) {

		} finally {
			sc.close();
		}

	}

}
