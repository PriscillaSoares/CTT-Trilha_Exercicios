package semana_01_02_avaliativos.E01_pais;

import java.util.HashSet;
import java.util.Set;

public class Pais {

	private String iso;
	private String nome;
	private double populacao;
	private double dimensao;

	private Set<Pais> limitrofes = new HashSet<Pais>();
	private Set<Pais> paisesLimitrofes;

	public Pais(String iso, String nome, double populacao, double dimensao) {
		this.iso = iso;
		this.nome = nome;
		this.populacao = populacao;
		this.dimensao = dimensao;
//		this.fronteiras = new ArrayList<>();
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

//	public ArrayList<Pais> getFronteiras() {
//		return fronteiras;
//	}
//
//	public void setFronteiras(ArrayList<Pais> fronteiras) {
//		this.fronteiras = fronteiras;
//	}

	public Set<Pais> getLimitrofes() {
		return limitrofes;
	}

	public void setLimitrofes(Set<Pais> limitrofes) {
		this.limitrofes = limitrofes;
	}

	public boolean verificaFronteiras(Pais pais) {
		return this.limitrofes.contains(pais);
	}

	public Set<Pais> getPaisesFronteitasEmComum(Pais pais) {
		Set<Pais> paisesLimitrofes = new HashSet<Pais>(this.getLimitrofes());
		paisesLimitrofes.retainAll(pais.getLimitrofes());
		return paisesLimitrofes;

	}

	public void addPaisFronteiras(Pais pais) {
		this.getLimitrofes().add(pais);

	}

	public Set<Pais> getPaisesLimitrofes() {
		return paisesLimitrofes;
	}

	public void setPaisesLimitrofes(Set<Pais> paisesLimitrofes) {
		this.paisesLimitrofes = paisesLimitrofes;
	}
}
