package semana_01_02_avaliativos.E01_pais;

import java.util.ArrayList;

public class Pais {

	private String iso;
	private String nome;
	private double populacao;
	private double dimensao;
	private ArrayList<Pais> fronteiras;

	public Pais(String iso, String nome, double populacao, double dimensao) {
		this.iso = iso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
		this.fronteiras = new ArrayList<>();
	}

	public boolean verificaIgualdade(Pais pais) {
		return this.iso == pais.getIso();
	}

	public double calculaDensidadePopulacional() {
		double resultado = this.populacao / this.populacao;
		return resultado;
	}

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

	public ArrayList<Pais> getFronteiras() {
		return fronteiras;
	}

	public void setFronteiras(ArrayList<Pais> fronteiras) {
		this.fronteiras = fronteiras;
	}

}
