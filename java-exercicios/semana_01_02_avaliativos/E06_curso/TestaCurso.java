package semana_01_02_avaliativos.E06_curso;

import java.util.Scanner;

public class TestaCurso {

	private static Professor professor;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.println("Qual curso? "); String nome = scanner.nextLine();
		 * 
		 * System.out.println("Qual o horário do curso "); String horario =
		 * scanner.nextLine();
		 * 
		 * System.out.println("Qual é o professor? "); String profNome =
		 * scanner.nextLine(); System.out.println("Qual é o departamento? "); String
		 * profDep = scanner.nextLine();
		 * System.out.println("Qual é o e-mail do professor? "); String profEmail =
		 * scanner.nextLine();
		 */

		Curso curso = new Curso("Biologia", "17:30 as 20:15", professor);
		System.out.println("Curso: " + curso.getNome() + "\nHorário do curso: " + curso.getHorario());

		Professor professor = new Professor();
		professor.setNome("Robert Sales");
		professor.setDepartamento("Cientifico");
		professor.setEmail("robert@escurso.org.br");

		curso.setProfessor(professor);

		System.out.println("Professor: " + curso.getProfessor().getNome());
		System.out.print("Departamento: " + professor.getDepartamento());
		System.out.println(" |" + " E-mail: " + professor.getEmail());

		// if (curso!= null && curso.getProfessor()!= null) {
		// System.out.println(curso.getProfessor());
		// }

//		
//		Aluno Aluno = new Aluno("Rafael" , "892575");
//		System.out.println("Aluno: " + Aluno.getNome() + "\nMatricula: " + Aluno.getMatricula());
//		Aluno Aluno1  = new Aluno("Rafael" , "892575");
//		System.out.println("Aluno: " + Aluno1.getNome() + "\nMatricula: " + Aluno1.getMatricula());
//		Aluno Aluno2 = new Aluno("Rafael" , "892575");
//		System.out.println("Aluno: " + Aluno2.getNome() + "\nMatricula: " + Aluno1.getMatricula());
//		Aluno Aluno3 = new Aluno("Rafael" , "892575");
//		System.out.println("Aluno: " + Aluno3.getNome() + "\nMatricula: " + Aluno1.getMatricula());

		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < 5; i++) {

			// scan.nextLine();

			System.out.println("Entre com o nome do aluno " + (i + 1));
			String nomeAluno = scan.nextLine();

			System.out.println("Entre com a matrículo do ano:");
			String matAluno = scan.nextLine();

			double[] notas = new double[4];

			for (int n = 0; n < 4; n++) {
				System.out.println("------------------");
				System.out.println(" Digite a nota " + (n + 1));
				notas[n] = scan.nextDouble();
			}

			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno;

			curso.setAlunos(alunos);

		}
		scan.close();

	}

}