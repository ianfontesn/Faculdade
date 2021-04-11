import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {

		System.out.println("Digite as 5 tarefas mais importtantes do seu dia: ");
		
		String[] listaDeTarefas = new String[5];
		
			Scanner recebe = new Scanner(System.in);
			
		
			for	(int i = 0; i < listaDeTarefas.length; i++ ) {
				listaDeTarefas[i] = recebe.nextLine();
			}
			

				System.out.println("Suas 5 tarefas mais importantes do dia são: ");
		
					for (int i = 0; i < listaDeTarefas.length; i++) {
			
						System.out.println("[" + i + "]" + listaDeTarefas[i]);
			
						recebe.close();
			
			
			
		}
	}

}
