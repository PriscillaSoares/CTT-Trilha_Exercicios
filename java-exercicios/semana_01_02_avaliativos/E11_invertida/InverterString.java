package semana_01_02_avaliativos.E11_invertida;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {

		Scanner inserida = new Scanner(System.in);

		System.out.println("\n" + "--Esse programa ira inverter uma String --" + "\n");
		System.out.println("Digite aqui o que você deseja ver invertido: ");
		String palavraLer = inserida.next();
		String invertida = "";

		for (int i = palavraLer.length() - 1; i >= 0; i--) {
			invertida += palavraLer.charAt(i);
		}
		System.out.println(invertida);

		inserida.close();
	}

}
