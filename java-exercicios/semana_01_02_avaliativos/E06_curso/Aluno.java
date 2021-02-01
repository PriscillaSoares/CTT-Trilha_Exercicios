package semana_01_02_avaliativos.E06_curso;

public class Aluno {

	private String nome;
	private String matricula;
	// private double[] notas;
	double[] notas = new double[4];

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public void imprimidados() {
		System.out.println("Nome: " + this.nome + "\nTelefone: " + this.matricula + "\nNotas: " + this.notas);
	}

}
