package dia03;

import java.util.Scanner;

class OperacaoMatematica
{
private static Scanner valor;

public static void main(String[] args) {
	valor = new Scanner(System.in);

  System.out.println("Digite a opera��o que deseja fazer (a, s, m, d)");
  String operacao = valor.next();

  System.out.println("Digite o primeiro valor");
  int valor1 = valor.nextInt();

  System.out.println("Digite o segundo valor");
  int valor2 =  valor.nextInt();


  switch(operacao) {
    case "a":
      int soma = valor1 + valor2;
      System.out.println("A soma entre os valores �: " + soma);
      break;
    case "s":
      int subtracao = valor1 - valor2;
      System.out.println("A subtra��o entre os valores �: " + subtracao);
      break;
    case "m":
      int multiplicacao = valor1 * valor2;
      System.out.println("A multiplicacao entre os valores �: " + multiplicacao);
      break;
    case "d":
      if (valor2 == 0) {
        System.out.println("N�o se pode dividir por 0");
      } else {
        double divisao = valor1 / (double) valor2;
        System.out.println("A divis�o entre os valores �: " + divisao);
      }
      break;
    default:
      System.out.println("Opera��o n�o encontrada");
  }
  
}
}
