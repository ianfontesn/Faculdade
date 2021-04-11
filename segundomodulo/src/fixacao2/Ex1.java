package fixacao2;

public class Ex1 {

	public static void main(String[] args) {

		System.out.printf("A passagem de parametros por VALOR realiza uma CÓPIA do valor da variavel (primitiva, int, double, etc) \n"
						+ "A alteração da variavel dentro do metodo não irá afetar a variavel externa a ele, mesmo que com o mesmo nome. \n"
						+ "A passagem de paramentros por referencia, faz um apontamento do local de memoria onde está armazenado o objeto. \n"
						+ "Vetores por exemplo, serão passados por referência. \n"
						+ "A alteração de uma variavel passada por referência dentro do metodo acarretará sua mudança fora do mesmo.");

	}

}
