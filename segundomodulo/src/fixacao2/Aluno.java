package fixacao2;

public class Aluno {
	
	public String nome;
	public String curso;
	public int matricula;
	public int ano;

	
	public void mostrarAtributosAlunoPorCurso() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Matr�cula: " + this.matricula);
		System.out.println("Ano: " + this.ano);
		System.out.println();
	}
	
	
	
}
