package dia03;

import java.util.Scanner;

/** Guardando as variavel e usando if para revelar o maior e menor entre dois n�; Continuar ou n�o programa 
 */

public class MenorOuMaior {
	public static void main (String [] args) {
		
	Scanner in = new Scanner (System.in);
		
	  int continuarPrograma = 1;

      while (continuarPrograma == 1) {
		
		
		System.out.print("--");
		System.out.print("Esse programa te mostrara maior e menor entre dois n�meros");
	    System.out.println("--");
		
		System.out.println("Digite aqui um valor: ");
	    int primeiroNumero = in.nextInt(); 

		System.out.println("Digite aqui outro valor: ");
	    int segundoNumero = in.nextInt();

		
	    if  (primeiroNumero > segundoNumero ){
	    	System.out.println("O primeiro numero digitado � maior " + primeiroNumero);	
		}
	    
	    else if  (segundoNumero > primeiroNumero ){
	    	System.out.println("O segundo numero digitado � maior " + segundoNumero);	
		}
	    else { 
	    	System.out.println("Os n�meros s�o iguais");
	    }
	    
	     if  (primeiroNumero < segundoNumero ){
	    	System.out.println("O primeiro numero digitado � menor " + primeiroNumero);	
		}
	    
	    else if  (segundoNumero < primeiroNumero ){
	    	System.out.println("O segundo numero digitado � menor " + segundoNumero);	
		}
	    else { 
	    	System.out.println("Os n�meros s�o iguais");
	    }
	    
	       System.out.println("Deseja continuar o programa s(1)/n(0)?");
        continuarPrograma = in.nextInt();
        
      }
	    in.close(); 
	    
	}

}