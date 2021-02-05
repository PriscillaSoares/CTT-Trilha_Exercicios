package semana_01_02_avaliativos.E15_ordenando;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenandoNumeros {

	public static void main(String[] args) {

		// String number = null;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma sequencia de números aleatórios separados por vírgula: ");
		String number = in.nextLine();

		String array[] = number.split(",");

		int[] numeros = new int[number.length()];
		System.out.println("Sequencia não ordenada: " + number);

		for (int i = 0; i < array.length; i++) {
			numeros[i] = Integer.parseInt(array[i]);
		}

		System.out.print("Sequencia ordenada: ");

		Arrays.sort(numeros);

		for (int num : numeros) {
			System.out.print(num);
		}

		in.close();
	}

}
