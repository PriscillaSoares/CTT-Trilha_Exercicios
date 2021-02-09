package semana_01_02_avaliativos.E02_continente;

public class TestaContinente {
	public static void main(String[] args) {

		Continente continente = new Continente("Europa/Países Nórdico");

		Pais noruega = new Pais("NOR", "Noruega", 5.385, 385.207);
		Pais suecia = new Pais("SWE", "Suécia", 10.23, 450.295);
		Pais dinamarca = new Pais("DNK", "Dinamarca", 5.806, 42.933);
		Pais filandia = new Pais("FIN", "Filândia", 5.518, 338.440);

		System.out.println("______" + continente.getNome() + "______");

		continente.addPais(filandia);
		continente.addPais(dinamarca);
		continente.addPais(suecia);
		continente.addPais(noruega);

		System.out.println("\nA dimesão total: " + continente.ContinenteDimensaoTotal());
		System.out.println("A população total do continente: " + continente.PopulacaoTotal());

		System.out.print(" é o país que têm dimensão de " + continente.maiorDimensao() + " km²,"
				+ " sendo essa a maior entre os dados no continente.");

		System.out.print(" é o país que têm dimensão de " + continente.menorDimensao() + " km²,"
				+ " sendo essa a menor entre os dados no continente.");
		System.out.print(" \nO país com população de " + continente.maiorPopulacao()
				+ " sendo essa a menor entre os dados no continente.");

	}

}
