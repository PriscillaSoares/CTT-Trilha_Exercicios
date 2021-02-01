package semana_01_02_avaliativos.E01_pais;

public class TestaPais {

	public static void main(String[] args) {
		Pais pais = new Pais("BRA", "Brasil", 211800000, 8516000);
		Pais pais2 = new Pais("Arg", "Argentina", 494900000, 2780000);

		System.out.println("Informações do " + pais.getNome());
		System.out.println("Codigo ISO: " + pais.getIso());
		System.out.println("Dimensão km2: " + pais.getDimensao());
		System.out.println("População: " + pais.getPopulacao());
		System.out.println("Informações do " + pais2.getNome());
		System.out.println("Codigo ISO: " + pais2.getIso());
		System.out.println("Dimensão km2: " + pais2.getDimensao());
		System.out.println("População: " + pais2.getPopulacao());
		System.out.println("Os paises são iguais? " + pais.verificaIgualdade(pais2));
		System.out.println("Os paises são iguais? " + pais2.verificaIgualdade(pais));
		System.out.println("Densidade populacional de " + pais.getNome() + " é " + pais.calculaDensidadePopulacional());
		System.out
				.println("Densidade populacional de " + pais2.getNome() + " é " + pais2.calculaDensidadePopulacional());
	}
}
