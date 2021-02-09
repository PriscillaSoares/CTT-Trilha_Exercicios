package semana_01_02_avaliativos.E02_continente;

public class Pais {

	private String iso;
	private String nome;
	private static double populacao;
	private double dimensao;

	public Pais(String iso, String nome, double populacao, double dimensao) {
		this.iso = iso;
		this.nome = nome;
		Pais.populacao = populacao;
		this.dimensao = dimensao;
	}

	public Pais() {
	}

	public boolean verificaIgualdade(Pais pais) {
		return this.iso == pais.getIso();
	}

	public double calculaDensidadePopulacional() {
		double resultado = Pais.populacao / Pais.populacao;
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
		Pais.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}

}
