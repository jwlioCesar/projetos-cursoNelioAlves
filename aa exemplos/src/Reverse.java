import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = sc.nextLine();
		int x = name.length() - 1;

		for (int i = 0; i < name.length(); x--, i++) {
			System.out.print(name.charAt(x));
		}

		sc.close();
	}

}
