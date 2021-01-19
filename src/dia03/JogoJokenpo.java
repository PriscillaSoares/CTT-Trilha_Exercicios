package dia03;

import java.util.Scanner;

public class JogoJokenpo {

private static Scanner dedo;

public static void main(String args []) {
	 
	dedo = new Scanner(System.in);
	  
	 System.out.println ("O jogo começou!");
	 System.out.println("Você precisa escolher entre as opções (1 - Pedra, 2 - Papel, 3 - Tesoura)");
	 System.out.println(" ...Jokenpô...");
	 System.out.println(" Jogador1, digite sua escolha: ");
	 
	 int jogador1 = dedo.nextInt();
     System.out.println(" Jogador2 é sua vez: ");
     int jogador2 = dedo.nextInt();
     
     switch(jogador1) {
      case 1:
      System.out.println("Jogador1 escolheu Pedra");
      break;

     case 2:
      System.out.println("Jogador1 escolheu Papel");
      break;

     case 3:
      System.out.println("Jogador1 escolheu tesoura");
      break;
      default:
     System.out.println("Opção não encontrada");
   } 

   switch(jogador2) {
     case 1:
     System.out.println("Jogador2 escolheu Pedra");
     break;

     case 2:
     System.out.println("Jogador2 escolheu Papel");
     break;

     case 3:
     System.out.println("Jogador2 escolheu tesoura");
     break;
     default:
     System.out.println("Opção não encontrada");
   } 
   
   if (jogador1 == 1) {
	if (jogador2 == 1) {
	  System.out.println("Esse jogo deu empate");
	   } 
	else if (jogador2 == 2) {
	  System.out.println("Jogador2 venceu");
	   }
	else if (jogador2 == 3) {
	  System.out.println("Jogador1 um venceu");
	   }
	  }

	if (jogador1 == 2) {
	 if  (jogador2 == 1){
	   System.out.println("Jogador1 venceu ");
	   }
	 else if (jogador2 == 2) {
	   System.out.println("Essa jogada deu empate");
	   }
	 else if (jogador2 == 3) {
	   System.out.println("Jogador2 venceu");
	   }
	  }
   
	if (jogador1 == 3) {
	 if (jogador2 == 1){
	   System.out.println("Jogador2 venceu ");
	   }
	    else if (jogador2 == 2) {
	    System.out.println("Jogador1 venceu");
	   }
	    else if (jogador2 == 3) {
	    System.out.println("Essa jogada deu empate");
   
   }
	} 
   
 }

}