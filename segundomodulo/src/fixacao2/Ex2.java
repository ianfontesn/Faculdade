package fixacao2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Livro livros[] = new Livro[100];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Cadastro de livros. At� 100 livros. ");

		for (int i = 0; i < 100; i++) {
			
			if (livros[i] == null) {
				
				livros[i] = new Livro();
									
					System.out.print("Nome do livro: ");
					livros[i].nome = in.nextLine();
					
					System.out.print("Autor: ");
					livros[i].autor = in.nextLine();

					System.out.print("Breve descri��o: ");
					livros[i].descricao = in.nextLine();

					System.out.print("Ano: ");
					livros[i].ano = in.nextInt();
					
					System.out.print("Pre�o: ");
					livros[i].preco = in.nextDouble();
									
					System.out.printf("\nITEM CADASTRADO.\n\n"
							+ "NOVO CADASTRO: \n\n");
					in.nextLine();

				} else {
					continue;
				}

		}

		in.close();
	}

}
