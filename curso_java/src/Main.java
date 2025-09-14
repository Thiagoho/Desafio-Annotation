import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 5;
		
		System.out.println("Bom dia!");
		if(x < 0) {
			System.out.println("Bom tarde!");
		}
		System.out.println("Boa noite!");
		
		sc.close();

	}

}
