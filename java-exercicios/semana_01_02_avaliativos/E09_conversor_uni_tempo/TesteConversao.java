package semana_01_02_avaliativos.E09_conversor_uni_tempo;

public class TesteConversao {

	public static void main(String[] args) {

		System.out.println("\n---- Convertendo unidades de tempo ----\n");
		System.out.println(" 5 minutos s�o: " + ConversaoDeUnidadesDeTempo.minutosParaSegundos(5) + " segundos");
		System.out.println(" 2 horas s�o: " + ConversaoDeUnidadesDeTempo.horasParaMinutos(2) + " minutos");
		System.out.println(" 3 dias s�o: " + ConversaoDeUnidadesDeTempo.diasParaHoras(3) + " horas");
		System.out.println(" 4 semanas s�o: " + ConversaoDeUnidadesDeTempo.semanaParaDias(4) + " dias");
		System.out.println(" 6 meses s�o: " + ConversaoDeUnidadesDeTempo.mesParaDias(12) + " dias");
		System.out.println(" 10 anos s�o: " + ConversaoDeUnidadesDeTempo.anoParaDias(10) + " dias");

	}

}
