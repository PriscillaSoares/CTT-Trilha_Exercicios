package dia02;

import java.util.Scanner;

public class MostrandoAntecessor {
	
	  public static void main(String args[]) { 
	      Scanner in = new Scanner (System.in);
	      
	      System.out.println("Digite aqui um n�mero inteiro para que te mostro o antecessor. " );
	      int a = in.nextInt();
	      int antecessor = a -1;
	      System.out.println(" o antecessor de " + a + " � " + antecessor );
	   
	      in.close();
	  
	}
	}


