package dia03;

import java.util.Scanner;

public class ImparOuPar {
	
	public static void main (String [] argrs) {
		
		Scanner in = new  Scanner (System.in); 
		
		System.out.println("Digite um número: ");
		int numero = in.nextInt(); 
		
		if (numero % 2 == 0) {
			System.out.println("É um número par"); 
		}
		else {
			System.out.println("É um número impar"); 

		}
		in.close();
		
	}

}
