package semana_01_02_avaliativos.E01_pais;

public class TestaPais {

	public static void main(String[] args) {
		Pais pais = new Pais("BRA", "Brasil", 211800000, 8516000);
		Pais pais2 = new Pais("Arg", "Argentina", 494900000, 2780000);

		System.out.println("Informa��es do " + pais.getNome());
		System.out.println("Codigo ISO: " + pais.getIso());
		System.out.println("Dimens�o km2: " + pais.getDimensao());
		System.out.println("Popula��o: " + pais.getPopulacao());
		System.out.println("Informa��es do " + pais2.getNome());
		System.out.println("Codigo ISO: " + pais2.getIso());
		System.out.println("Dimens�o km2: " + pais2.getDimensao());
		System.out.println("Popula��o: " + pais2.getPopulacao());
		System.out.println("Os paises s�o iguais? " + pais.verificaIgualdade(pais2));
		System.out.println("Os paises s�o iguais? " + pais2.verificaIgualdade(pais));
		System.out.println("Densidade populacional de " + pais.getNome() + " � " + pais.calculaDensidadePopulacional());
		System.out
				.println("Densidade populacional de " + pais2.getNome() + " � " + pais2.calculaDensidadePopulacional());
	}
}
