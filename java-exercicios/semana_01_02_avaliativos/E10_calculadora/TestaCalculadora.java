package semana_01_02_avaliativos.E10_calculadora;

public class TestaCalculadora {

	public static void main(String[] args) {

		System.out.println("----Calculadora----");

		System.out.println("A soma de 5 + 2 �: " + Calculadora.somar(5, 2));
		System.out.println("A subtra��o de 3 - 2 �: " + Calculadora.subtrair(3, 2));
		System.out.println("A multiplica��o de 10 * 10 �: " + Calculadora.multiplicar(10, 10));
		System.out.println("A divis�o de 10 / 2 �: " + Calculadora.dividir(10, 2));
		System.out.println("o n�mero 3 elevado ao cubo �: " + Calculadora.potencia(3, 2));

	}
}