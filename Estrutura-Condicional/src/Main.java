import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Fazer um programa para ler um número inteiro, 
		 e depois dizer se este número é negativo ou não. 
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Não negativo");
		}
		
		sc.close();
	}

}
