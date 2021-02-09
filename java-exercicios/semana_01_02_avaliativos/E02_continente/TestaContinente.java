package semana_01_02_avaliativos.E02_continente;

public class TestaContinente {
	public static void main(String[] args) {

		Continente continente = new Continente("Europa/Pa�ses N�rdico");

		Pais noruega = new Pais("NOR", "Noruega", 5.385, 385.207);
		Pais suecia = new Pais("SWE", "Su�cia", 10.23, 450.295);
		Pais dinamarca = new Pais("DNK", "Dinamarca", 5.806, 42.933);
		Pais filandia = new Pais("FIN", "Fil�ndia", 5.518, 338.440);

		System.out.println("______" + continente.getNome() + "______");

		continente.addPais(filandia);
		continente.addPais(dinamarca);
		continente.addPais(suecia);
		continente.addPais(noruega);

		System.out.println("\nA dimes�o total: " + continente.ContinenteDimensaoTotal());
		System.out.println("A popula��o total do continente: " + continente.PopulacaoTotal());

		System.out.print(" � o pa�s que t�m dimens�o de " + continente.maiorDimensao() + " km�,"
				+ " sendo essa a maior entre os dados no continente.");

		System.out.print(" � o pa�s que t�m dimens�o de " + continente.menorDimensao() + " km�,"
				+ " sendo essa a menor entre os dados no continente.");
		System.out.print(" \nO pa�s com popula��o de " + continente.maiorPopulacao()
				+ " sendo essa a menor entre os dados no continente.");

	}

}
