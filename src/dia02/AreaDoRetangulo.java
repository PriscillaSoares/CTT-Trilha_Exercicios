package dia02;

import java.util.Scanner;

public class AreaDoRetangulo {
	public static void main(String args[])
	{
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Esse algoritimo calcula a �rea de um ret�ngulo");
	    
	    System.out.println("Por favor, digite a base do ret�ngulo");
	    double base = scanner.nextFloat();
	    
	    System.out.println("Por favor, digite a altura do ret�ngulo");
	    double altura = scanner.nextFloat();

	    double area = base * altura;

	    System.out.println("A �rea do ret�ngulo �: " + area);
	    
	    scanner.close();
	}
}
