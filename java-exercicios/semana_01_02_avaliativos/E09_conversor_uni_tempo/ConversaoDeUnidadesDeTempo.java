package semana_01_02_avaliativos.E09_conversor_uni_tempo;

public class ConversaoDeUnidadesDeTempo {

	/*
	 * 1 minuto = 60 segundos 1 hora = 60 minutos 1 dia = 24 horas 1 semana = 7 dias
	 * 1 mês = 30 dias 1 ano = 365 dias
	 */

	public static int minutosParaSegundos(int min) {
		return min * 60;

	}

	public static int horasParaMinutos(int hrs) {
		return hrs * 60;
	}

	public static int diasParaHoras(int dias) {
		return dias * 24;
	}

	public static int semanaParaDias(int sem) {
		return sem * 7;
	}

	public static int mesParaDias(int mes) {
		return mes * 30;
	}

	public static int anoParaDias(int ano) {
		return ano * 365;
	}

}
