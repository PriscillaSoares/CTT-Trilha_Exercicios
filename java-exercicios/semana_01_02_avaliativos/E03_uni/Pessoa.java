package semana_01_02_avaliativos.E03_uni;

public class Pessoa {

	private String name;
	private String trabalhoUni;
	private String dataAdimissao;
	
	public Pessoa(String name, String trabalhoUni, String dataAdmissao) {
		this.name = name;
		this.trabalhoUni = trabalhoUni;
		this.dataAdimissao = dataAdmissao;
		
	}
	
	public void dados() {
		System.out.println("A " + this.name + 
				" trabalha na universidade: " +
				this.trabalhoUni + "\nAdimitida em: " + this.dataAdimissao);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrabalhoUni() {
		return trabalhoUni;
	}
	public void setTrabalhoUni(String trabalhoUni) {
		this.trabalhoUni = trabalhoUni;
	}
	public String getDataAdimissão() {
		return dataAdimissao;
	}
	public void setDataAdimissão(String dataAdimissão) {
		this.dataAdimissao = dataAdimissão;
	}
	
	
}
