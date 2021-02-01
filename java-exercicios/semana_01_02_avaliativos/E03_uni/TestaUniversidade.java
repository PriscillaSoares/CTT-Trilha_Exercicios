package semana_01_02_avaliativos.E03_uni;

public class TestaUniversidade {

	public static void main(String[] args) {

		Universidade universidade = new Universidade();
		// Universidade universidade1 = new Universidade ();
		// System.out.println();

		Pessoa joao = new Pessoa("Julia", "Rio de Janeiro", "05/06/1998");
		// System.out.println("" + joao);

		joao.dados();

		universidade.nomeUni();
	}
}
