package semana_01_02_avaliativos.E04_tv;

public class TestarTv {

	public static void main(String[] args) {

		// Televisao phillips = new Televisao();
		Televisao Aoc = new Televisao();

		ControleRemoto controle = new ControleRemoto();
		controle.setTelevisao(Aoc);

		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentarVolume();
		controle.getTelevisao().aumentaCanal();
		controle.getTelevisao().aumentaCanal();
		System.out.println("----Volume Atual----");
		System.out.println("Volume da tv Aoc : " + controle.getTelevisao().getVolume());
		System.out.println("Canal da tv Aoc: " + controle.getTelevisao().getCanal());

		Aoc.aumentarVolume();
		Aoc.aumentaCanal();
		System.out.println("----Aumenta volume----");
		System.out.println("Volume da tv Aoc : " + controle.getTelevisao().getVolume());
		System.out.println("Canal da tv Aoc: " + controle.getTelevisao().getCanal());

		System.out.println("____Mudando Canal____");
		System.out.println("O canal atual é: " + controle.getTelevisao().trocarCanal(11));

		// Aoc.trocarCanal(5);

		imprimirTela(Aoc.trocarCanal(5));
		imprimirTela(Aoc.trocarCanal(2));

	}

	private static void imprimirTela(int trocarCanal) {
		System.out.println("O canal da Tv Aoc foi trocado para: " + trocarCanal);
		// System.out.println("O canal da Tv Phillips foi trocado para: " +
		// trocarCanal);
	}

}
