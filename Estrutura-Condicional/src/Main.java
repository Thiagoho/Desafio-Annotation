
import java.lang.invoke.SwitchPoint;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*  Problema exemplo
		 *  Fazer um programa para ler um valor
		 *  inteiro de 1 a 7 representando um
		 *  dia da semana (sendo 1=domingo, 2=segunda, e assim por diante). 
		 *  Escrever na tela o dia da semana correspondente, conforme exemplos.
		*/
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		int semana = sc.nextInt();
		String dia;
		
		if (semana == 1) {
			dia = "Domingo.";
		} else if (semana == 2) {
			dia = "Segunda - feira";
		} else if (semana == 3) {
			dia = "Terça - feira.";
		} else if (semana == 4) {
			dia = "Quarta - feira.";
		} else if (semana == 5) {
			dia = "Quinta - feira.";
		} else if (semana == 6) {
			dia = "Sexta - feira.";
		} else if (semana == 7) {
			dia = "Sabádo.";
		} else {
			dia = "Valor inválido!";
		}
		System.out.println("Dia da semana: " + dia);
			
		sc.close();
	}
}
