package semana_01_02_avaliativos.E02_continente;

import java.util.ArrayList;

public class Continente {

	private String nome;
	private ArrayList<Pais> paises;
	private Pais pais;

	public Continente(String nome) {
		this.nome = nome;
		this.paises = new ArrayList<>();
	}

	public void addPais(Pais pais) {
		paises.add(pais);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Pais> getPaises() {
		return paises;
	}

	public void setPaises(ArrayList<Pais> paises) {
		this.paises = paises;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public double ContinenteDimensaoTotal() {
		double dimensaoTotal = 0;
		for (Pais pais : paises) {
			dimensaoTotal += pais.getDimensao();
		}
		return dimensaoTotal;
	}

	public double PopulacaoTotal() {
		double populaoTotal = 0;

		for (Pais pais : paises) {
			populaoTotal += pais.getPopulacao();
		}
		return populaoTotal;
	}

	public double densidadeDemografica() {
		return this.PopulacaoTotal() / this.ContinenteDimensaoTotal();

	}

	public double maiorDimensao() {
		double maiorDimensao = 0;

		for (Pais pais : paises) {
			if (pais.getDimensao() > maiorDimensao) {
				maiorDimensao = pais.getDimensao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getDimensao() == maiorDimensao) {
				System.out.print("\n" + paises.get(i).getNome());
			}
		}
		return maiorDimensao;
	}

	public double menorDimensao() {
		double menorDimensao = Integer.MAX_VALUE;

		for (Pais pais : paises) {
			if (pais.getDimensao() < menorDimensao) {
				menorDimensao = pais.getDimensao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getDimensao() == menorDimensao) {
				System.out.print("\n" + paises.get(i).getNome());
			}
		}
		return menorDimensao;
	}

	public double maiorPopulacao() {
		double maiorPopulacao = 0;

		for (Pais pais : paises) {
			if (pais.getPopulacao() > maiorPopulacao) {
				maiorPopulacao = pais.getPopulacao();
			}
		}

		for (int j = 0; j < paises.size(); j++) {
			if (paises.get(j).getPopulacao() == maiorPopulacao) {
				// System.out.print("\n" + paises.get(j).getNome());
			}
		}
		return maiorPopulacao;
	}

	public double menor() {
		double menorDimensao = Integer.MAX_VALUE;

		for (Pais pais : paises) {
			if (pais.getDimensao() < menorDimensao) {
				menorDimensao = pais.getDimensao();
			}
		}

		for (int i = 0; i < paises.size(); i++) {
			if (paises.get(i).getDimensao() == menorDimensao) {
				System.out.print("\n" + paises.get(i).getNome());
			}
		}
		return menorDimensao;
	}
}
