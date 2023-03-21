import java.util.Scanner;

public class Fibonacci{

    private static int[] vetAux = new int[50];
    private static int k;

    public static long fibo(int n) {
             k = 1; // inicializa k
             return recursao(n);
           }

    private static long recursao(int n) {
            if (n < 0) {
               return vetAux[0];
          } else {
           if (k < 3) {
              vetAux[n] = k - 1;
              k++;
           } else {
                 vetAux[n] = vetAux[n + 1] + vetAux[n + 2];
                 }
              return recursao(n - 1);
           }
    }

    public static void main(String[] args) {  // teste do programa. Imprime os 30 primeiros termos
    	Scanner sc = new Scanner(System.in);

    	System.out.println("digite um numero para checar se ele pertence a sequencia de fibonacci");
    	int n = sc.nextInt();
    	String x = null;
    	
    	for (int i = 0; i < 30; i++) {
    		if(n == Fibonacci.fibo(i)) {
    			x = "o numero informado pertence a sequencia";
    		}else if (x == null) {
    			x = "o numero informado não pertence a sequencia";
    		}
        System.out.print(Fibonacci.fibo(i) + " ");
        }
    	System.out.println();
    	System.out.println(x);
    	
    	sc.close();
    }
}