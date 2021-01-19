package dia02;

import java.util.Scanner;

public class AreaDoRetangulo {
	public static void main(String args[])
	{
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Esse algoritimo calcula a área de um retângulo");
	    
	    System.out.println("Por favor, digite a base do retângulo");
	    double base = scanner.nextFloat();
	    
	    System.out.println("Por favor, digite a altura do retângulo");
	    double altura = scanner.nextFloat();

	    double area = base * altura;

	    System.out.println("A área do retângulo é: " + area);
	    
	    scanner.close();
	}
}
