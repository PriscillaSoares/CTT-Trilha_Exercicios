package semana_01_02_avaliativos.E13_mes;

import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o mês [1-12]: ");
		int mes = scan.nextInt();

		System.out.print("Digite o ano: ");
		int ano = scan.nextInt();

		int dias = 31;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			dias--;
			System.out.println(" O Mês " + mes + " tem " + dias + " dias em " + ano);
			break;

		case 2:

			if ((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) {
				System.out.println(" O Mês tem 28 dias em " + ano);

			} else {
				System.out.println(" O Mês tem 29 dias em " + ano);
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			dias--;
			System.out.println(" O Mês " + mes + " tem 30 dias em " + ano);
			break;
		default:
			if (mes > 12 || mes < 1) {
				System.out.println("Mês inválido");

			}

		}

		scan.close();
	}
}
