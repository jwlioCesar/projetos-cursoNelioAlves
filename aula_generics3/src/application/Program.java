package application;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(2, 4, 6);
		printList(myInts);
		List<String> myStr = Arrays.asList("maira", "ama");
		printList(myStr);
	}

	public static void printList(List<?> list) {
		for (Object lists : list) {
			System.out.println(lists);
		}

	}

}
