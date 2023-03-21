import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {

	public static void main(String[] args) {
		
		method1 ();
		System.out.println("end of program");
	}
	
	public static void method1() {
		
		System.out.println("**METHOD 1 START**");
		method2();
		System.out.println("**METHOD 1 ENDS**");

	}
	
	
	
	public static void method2(){
Scanner sc = new Scanner (System.in);
		
System.out.println("**METHOD 2 START**");

		try {
		String[] vect = sc.nextLine().split(" ");
		int p = sc.nextInt();
		
		System.out.println(vect[p]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid position");
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("Input error");
			e.printStackTrace();
		}finally {
			System.out.println("programa executado");
		}
		
		System.out.println("**METHOD 2 END**");

		sc.close();
	}
}