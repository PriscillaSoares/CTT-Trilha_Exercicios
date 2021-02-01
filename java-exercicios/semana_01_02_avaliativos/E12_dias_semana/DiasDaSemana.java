package semana_01_02_avaliativos.E12_dias_semana;

import java.util.Scanner;

public class DiasDaSemana {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("----- Dias da semana e seus n�meros correspondentes -----");

		System.out.println(" Digite um n�mero entre 1 ao 7 para saber o dia da semana: ");
		int diaSemana = scanner.nextInt();

		switch (diaSemana) {

		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Ter�a-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;

		case 5:
			System.out.println("Sexta-feira");
			break;

		case 6:
			System.out.println("S�bado");
			break;

		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Opera��o inv�lida! " + "\nO n�mero que digitou n�o corresponde a um dia da semana.");

		}

		scanner.close();
	}

}
