package dia02;

import java.util.Scanner;

public class TotalDeVotos {
	public static double calculaPercentualX(double tDeElei, double totalX) {

	      double percentual = totalX * 100 / tDeElei;
	      return percentual;

	    }

	    public static void main(String args[])
	    {

	        Scanner in = new Scanner(System.in);

	        System.out.println("Digite o total de votos");
	        int totalVotos = in.nextInt();
	        System.out.println("Digite o total de votos em branco");
	        int totalVotosBrancos = in.nextInt();
	        System.out.println("Digite o total de votos nulos");
	        int totalVotosNulos = in.nextInt();
	        System.out.println("Digite o total de votos validos");
	        int totalVotosValidos = in.nextInt();

	        System.out.println("A quantidade total de votos é: " + totalVotos);

	        System.out.println("A quantidade total de votos em branco é: " + totalVotosBrancos);

	        System.out.println("A quantidade total de votos nulos é: " + totalVotosNulos);

	        System.out.println("A quantidade total de votos validos é: " + totalVotosValidos);

	        double percentualVotosBrancos = TotalDeVotos.calculaPercentualX(totalVotos, totalVotosBrancos);

	        double percentualVotosNulos = TotalDeVotos.calculaPercentualX(totalVotos, totalVotosNulos);

	        double percentualVotosValidos = TotalDeVotos.calculaPercentualX(totalVotos, totalVotosValidos);

	        System.out.println("_______________________________________________");

	        System.out.println("O percentual total de votos em branco é: " + String.format("%.2f", percentualVotosBrancos));

	        System.out.println("O percentual total de votos nulos é: " + String.format("%.2f", percentualVotosNulos));

	        System.out.println("O percentual total de votos validos é: " + String.format("%.2f", percentualVotosValidos));

	        in.close();

	        
	    }
	}


