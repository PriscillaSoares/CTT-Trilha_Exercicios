package semana_01_02_avaliativos.E10_calculadora;

public class TestaCalculadora {

	public static void main(String[] args) {

		System.out.println("----Calculadora----");

		System.out.println("A soma de 5 + 2 é: " + Calculadora.somar(5, 2));
		System.out.println("A subtração de 3 - 2 é: " + Calculadora.subtrair(3, 2));
		System.out.println("A multiplicação de 10 * 10 é: " + Calculadora.multiplicar(10, 10));
		System.out.println("A divisão de 10 / 2 é: " + Calculadora.dividir(10, 2));
		System.out.println("o número 3 elevado ao cubo é: " + Calculadora.potencia(3, 2));

	}
}