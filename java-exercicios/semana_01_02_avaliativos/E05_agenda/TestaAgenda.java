package semana_01_02_avaliativos.E05_agenda;

public class TestaAgenda {

	public static void main(String[] args) {

		// System.out.println("\n" +"_______Minha Agenda De Contatos_______" + "\n");

		Agenda agenda = new Agenda();
		agenda.setNome("\n" + "   --- Minha Agenda De Contatos ---   " + "\n");
		System.out.println("Agenda: " + "\n" + agenda.getNome());
		Contato c1 = new Contato("João Maurol", "(11) 42568-4526", "seujoao@email.com.br");
		Contato c2 = new Contato("Manoel Oliveira", "(21) 95869-7869", "seumanu@bol.com.br");
		Contato c3 = new Contato("Manu Gonti ", "(14) 85974-894", "manu@email.com.br");
		Contato c4 = new Contato("Estephany Abrão", "(11) 95885-2526", "iste@email.com.br");
		Contato c5 = new Contato("Ludmilla Feitosa", "(61) 4289-1920", "luudfei@email.com.br");
		Contato c6 = new Contato("Francine Lopis", "(91) 98628-3599", "frapis@email.com.br");
		Contato c7 = new Contato("Gardenia Felippo", "+ 51(358) 689-5948", "deniafeli@email.com");
		Contato c8 = new Contato("Juana Andrade", "(41) 95685-5556", "jujuand@gmail.com.br");
		Contato c9 = new Contato("Felix Feliz", "+ 51(388) 869-8459", "fefelix@email.com");

		agenda.armazenaContato(c1);
		agenda.armazenaContato(c2);
		agenda.armazenaContato(c3);
		agenda.armazenaContato(c4);
		agenda.armazenaContato(c5);
		agenda.armazenaContato(c6);
		agenda.armazenaContato(c7);
		agenda.armazenaContato(c8);
		agenda.armazenaContato(c9);

		agenda.imprimiAgenda();

		agenda.imprimiNomeAgenda();

	}
}
