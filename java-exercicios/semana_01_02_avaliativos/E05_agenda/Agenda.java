package semana_01_02_avaliativos.E05_agenda;

import java.util.ArrayList;

public class Agenda {

	private String nome;
	private ArrayList<Contato> contatos;

	public Agenda(String nome) {
		this.nome = nome;
	}

	public Agenda() {
		this.contatos = new ArrayList<Contato>();
	}

	public void armazenaContato(Contato contato) {
		this.contatos.add(contato);
	}

	public void imprimiAgenda() {
		for (int indiceContato = 0; indiceContato < this.contatos.size(); indiceContato++) {
			this.contatos.get(indiceContato).imprimidados();
			System.out.println("--------------------------------------");
		}

	}

	public String imprimiNomeAgenda() {
		String NomeAgenda = "Nome = " + nome + "\n";
		return NomeAgenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
