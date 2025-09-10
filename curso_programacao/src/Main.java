import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) { 
		/*Fazer um programa para ler os dados de três peças:
			Para cada peça, ler:
			código da peça,
			quantidade de unidades,
			valor unitário.
			Calcular e mostrar o valor total a pagar. */
		/**Exercício de fixação** */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qte1, cod2, qte2, cod3, qte3;
		
		double valorUnitario1, valorUnitario2, valorUnitario3, total;
		
		cod1 = sc.nextInt();
		qte1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qte2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		cod3 = sc.nextInt();
		qte3 = sc.nextInt();
		valorUnitario3 = sc.nextDouble();
		
		total = (qte1 * valorUnitario1) + (qte2 * valorUnitario2) + (qte3 * valorUnitario3);
		System.out.printf("Valor total %.2f%n", total);
		sc.close();
	}
}
