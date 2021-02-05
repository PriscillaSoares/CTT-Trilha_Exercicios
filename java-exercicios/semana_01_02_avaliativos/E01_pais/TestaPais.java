package semana_01_02_avaliativos.E01_pais;

public class TestaPais {

	public static void main(String[] args) {
		Pais Brasil = new Pais("BRA", "Brasil", 211_800000, 8_516.000);
		Pais Argentina = new Pais("ARG", "Argentina", 49_4900000, 2_780.000);
		Pais Chile = new Pais("CHL", "Chile", 187300000, 756.950);
		Pais Paraguai = new Pais("PRY", "Paraguai", 6_956_0000, 406.752);
		Pais Uruguai = new Pais("URY", " Uruguai", 3_4490000, 176.215);
		Pais Equador = new Pais("ECU", "Equador", 17_08_00000, 283.560);
		Pais Peru = new Pais("PER", "Peru", 31_99_00000, 1_285.000);
		Pais Colombia = new Pais("COL", "Colombia", 49_6500000, 1_143.000);
		Pais Bolivia = new Pais("BOL", "Bolivia", 11_35_00000, 1_099.000);

		System.out.println("Os paises são iguais? " + Brasil.verificaIgualdade(Chile));
		System.out.println("Os paises são iguais? " + Paraguai.verificaIgualdade(Uruguai));
		System.out.println(
				"Densidade populacional do " + Brasil.getNome() + " é " + Brasil.calculaDensidadePopulacional());

		Brasil.addPaisFronteiras(Bolivia);
		Brasil.addPaisFronteiras(Argentina);
		Brasil.addPaisFronteiras(Colombia);
		Brasil.addPaisFronteiras(Peru);
		Brasil.addPaisFronteiras(Paraguai);
		Brasil.addPaisFronteiras(Uruguai);

		Argentina.addPaisFronteiras(Paraguai);
		Argentina.addPaisFronteiras(Brasil);
		Argentina.addPaisFronteiras(Bolivia);
		Argentina.addPaisFronteiras(Chile);

		Equador.addPaisFronteiras(Peru);
		Equador.addPaisFronteiras(Colombia);

		Colombia.addPaisFronteiras(Equador);
		Colombia.addPaisFronteiras(Peru);
		Colombia.addPaisFronteiras(Brasil);

		System.out.println("Os paises são fronteiras entre si? " + Brasil.verificaFronteiras(Colombia));
		System.out.println("Os paises são fronteiras entre si? " + Brasil.verificaFronteiras(Equador));
		System.out.println(Equador.getPaisesFronteitasEmComum(Colombia));

	}
}
