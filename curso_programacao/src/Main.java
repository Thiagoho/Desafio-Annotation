import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) { 
		/* Fazer um programa que leia:
			O nome de um funcionário, o número de horas trabalhadas no mês, 
			o valor da hora normal, e o número de horas extras trabalhadas.
			Considerando que a hora extra vale 1.5x a hora normal, calcule e mostre:
			O salário base,
			O valor das horas extras,
			E o salário final.*/
		/**Exercício de fixação** */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome;
		double horaTrabalhada, horaNormal, horaExtra;
		double salariobase, salarioHoraExtra, salarioFinal;
		
		nome = sc.next();
		horaTrabalhada = sc.nextDouble();
		horaNormal = sc.nextDouble();
		horaExtra = sc.nextDouble();
		
		salariobase = (horaTrabalhada * horaNormal);
		salarioHoraExtra = (horaExtra * horaNormal * 1.5);
		salarioFinal = (salariobase + salarioHoraExtra);
		
		System.out.println("Funicionário -> " + nome);
		System.out.printf("Salário base -> %.2f%n", salariobase);
		System.out.printf("Hora extras -> %.2f%n", salarioHoraExtra);
		System.out.printf("Salário final -> %.2f%n", salarioFinal);
		
		sc.close();

	}
}
