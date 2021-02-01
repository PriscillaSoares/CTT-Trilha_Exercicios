package semana_01_02_avaliativos.E14_primo;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numDiv = 0;

		System.out.println("\n____Números Primos ou não____");
		System.out.println("\nDigite um número: ");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				numDiv++;

			}

		}
		if (numDiv == 2) {
			System.out.println(" O número é um nº primo! ");
		} else {
			System.out.println("O número não é um nº primo! ");
		}

		scan.close();
	}

}
