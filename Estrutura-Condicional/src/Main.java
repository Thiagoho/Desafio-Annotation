

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/* Espressão condicional Ternária.
	 * Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
	 * condição.*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double  preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.5;
		}
		System.out.println("Seu desconto: "+ desconto);
		sc.close();
	}
}
