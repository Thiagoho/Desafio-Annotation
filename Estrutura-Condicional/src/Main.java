

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/* Expressão condicional Ternária.
	 * Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
	 * condição.*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("Desconto: %.2f", desconto);
		
		sc.close();
	}
}
