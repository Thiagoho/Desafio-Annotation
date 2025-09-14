
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		sc.close();
	}

}
