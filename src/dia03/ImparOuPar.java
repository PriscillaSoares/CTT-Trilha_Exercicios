package dia03;

import java.util.Scanner;

public class ImparOuPar {
	
	public static void main (String [] argrs) {
		
		Scanner in = new  Scanner (System.in); 
		
		System.out.println("Digite um n�mero: ");
		int numero = in.nextInt(); 
		
		if (numero % 2 == 0) {
			System.out.println("� um n�mero par"); 
		}
		else {
			System.out.println("� um n�mero impar"); 

		}
		in.close();
		
	}

}
