
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
		switch (semana) {
		case 1: {
			dia = "Domingo";
			break;
		} 
		case 2: {
			dia = "Segunda - feira.";
			break;
		}
		case 3: {
			dia = "Terça - feira.";
			break;
		}
		case 4: {
			dia = "Quarta - feira.";
			break;
		}
		case 5: {
			dia = "Quinta - feira.";
			break;
		}
		case 6: {
		dia = "Sexta - feira.";
			break;
		}
		case 7: {
			dia = "Sabádo.";
			break;
		}
		default:
			dia = "Valor inválido!";
			break;
		}
		System.out.println("Hoje é " + dia);
		sc.close();
	}
}
