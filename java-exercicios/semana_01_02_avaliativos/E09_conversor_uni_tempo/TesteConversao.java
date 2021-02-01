package semana_01_02_avaliativos.E09_conversor_uni_tempo;

public class TesteConversao {

	public static void main(String[] args) {

		System.out.println("\n---- Convertendo unidades de tempo ----\n");
		System.out.println(" 5 minutos são: " + ConversaoDeUnidadesDeTempo.minutosParaSegundos(5) + " segundos");
		System.out.println(" 2 horas são: " + ConversaoDeUnidadesDeTempo.horasParaMinutos(2) + " minutos");
		System.out.println(" 3 dias são: " + ConversaoDeUnidadesDeTempo.diasParaHoras(3) + " horas");
		System.out.println(" 4 semanas são: " + ConversaoDeUnidadesDeTempo.semanaParaDias(4) + " dias");
		System.out.println(" 6 meses são: " + ConversaoDeUnidadesDeTempo.mesParaDias(12) + " dias");
		System.out.println(" 10 anos são: " + ConversaoDeUnidadesDeTempo.anoParaDias(10) + " dias");

	}

}
