package semana_01_02_avaliativos.E14_primo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numDiv = 0;

		System.out.println("\n____N�meros Primos ou n�o____");
		System.out.println("\nDigite um n�mero: ");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				numDiv++;

			}

		}
		if (numDiv == 2) {
			System.out.println(" O n�mero � um n� primo! ");
		} else {
			System.out.println("O n�mero n�o � um n� primo! ");
		}

		scan.close();
	}

}
