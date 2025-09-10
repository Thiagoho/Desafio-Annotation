import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) { 
		/* Fazer um programa em Java que:
			Leia os dados de duas vendas.
			Para cada venda, ler:
			o nome do produto,
			a quantidade vendida,
			o preço unitário.
			Calcule o valor total da compra e imprima o resultado. */
		/**Exercício de fixação** */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		int qte1, qte2;
		
		double precoUnitario1, precoUnitario2, total;
		
		nome1 = sc.next();
		qte1 = sc.nextInt();
		precoUnitario1 = sc.nextDouble(); 
				
		nome2 = sc.next();
		qte2 = sc.nextInt();
		precoUnitario2 = sc.nextDouble();
		
		total = (qte1 * precoUnitario1) + (qte2 * precoUnitario2);
		System.out.printf("Valor total %.2f%n ", total);
		sc.close();
	}
}
