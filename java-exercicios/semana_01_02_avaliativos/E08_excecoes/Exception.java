package semana_01_02_avaliativos.E08_excecoes;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Eu seu dividir!");
			System.out.println("Informe o primeiro valor: ");
			int x = scan.nextInt();
			System.out.println("Informe o segundo valor: ");
			int y = scan.nextInt();
			double r = (x / y);
			System.out.println("O resultado da soma � " + r);
			scan.close();
		} catch (ArithmeticException e) {
			System.out.println("Na divis�o um n�mero n�o � divis�vel por 0");
		}
	}

}
