
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Leia 2 valores inteiros (A e B).
		 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
		 * Multiplos", indicando se os valores lidos são múltiplos entre si. 
		 * Atenção: os números devem poder ser digitados em 
		 *	ordem crescente ou decrescente. .
		 */
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		// Falando assim A dividir B?
		if (A % B == 0 || A % B == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Ñ são multiplos");
		}
		sc.close();
		
	}

}
