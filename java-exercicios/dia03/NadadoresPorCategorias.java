package dia03;

import java.util.Scanner;

public class NadadoresPorCategorias {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = in.nextInt();
 
        if((idade >= 5) && (idade <= 7)){
            System.out.println(" O Nadador pertence a categoria - Infantil A");
        }
 
        if((idade >= 8) && (idade <= 10)){
            System.out.println("O Nadador pertence a categoria - Infantil B");
        }
 
        if((idade >= 11) && (idade <= 13)){
            System.out.println("O Nadador pertence a categoria - Juvenil A");
        }
 
        if((idade >= 14) && (idade <= 17)){
            System.out.println("O Nadador pertence a categoria - Juvenil B");
        }
 
        if(idade >= 18){
            System.out.println("O Nadador pertence a categoria - Adulto");
        } 
        else {
        	System.out.println("Não existe uma categoria para idade: " + idade + " anos");
        }
       in.close();
    }

	}

	