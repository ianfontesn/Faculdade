import java.util.Scanner;
public class ex5liveVetor{
   public static void main(String[] args){
	
	   int quantidadeDeFichas = 0;
	   double maisAlto = -999.0;
	   double maisBaixo = 999.0; 
	   double mediaGeralDasAlturas = 0.00;
	   double mediaAlturaHomens = 0.00;
	   double mediaAlturaMulheres = 0.00;
	   int quantidadeHomem = 0;
	   int quantidadeMulher = 0;
	   String nomeDoMaisAlto = "";
	   String nomeDoMaisBaixo = "";
	   
	   	Scanner recebe = new Scanner(System.in);

//declara quantos alunos serão cadastrados
	   		System.out.print("Digite a quantidade de pessoas a ser cadastrada: ");	 
	   			quantidadeDeFichas = recebe.nextInt();
	   			recebe.nextLine();
//vetores usados
	   			
	   double alturaMulher[] = new double[quantidadeDeFichas];
	   double alturaHomem[] = new double[quantidadeDeFichas];	
	   int sexoDoAluno[] = new int[quantidadeDeFichas];
	   double alturaDaPessoa[] = new double[quantidadeDeFichas];
	   String nomeDoAluno[] = new String[quantidadeDeFichas];
	   
//RECEBENDO DADOS DAS FICHAS(NOME, ALTURA E SEXO)
	   
	   	for (int i = 0; i < quantidadeDeFichas; i++) {
	   		System.out.print("Digite o nome da pessoa: ");
	   			nomeDoAluno[i] = recebe.next();
	   		System.out.print("Digite a altura da pessoa utilizando virgula (ex: 1,69): ");
	   			alturaDaPessoa[i] = recebe.nextDouble();
	   		
//atualiza mais alto e mais baixo	   	
	   			
	   		if (alturaDaPessoa[i] > maisAlto) {
	   			maisAlto = alturaDaPessoa[i];
	   			nomeDoMaisAlto = nomeDoAluno[i];
	   		} else if (alturaDaPessoa[i] < maisBaixo) { 		
	   			maisBaixo = alturaDaPessoa[i];
	   			nomeDoMaisBaixo = nomeDoAluno[i];
	   		} 		
	   
// recebe codigo do sexo da pessoa, mas só aceita, 1 ou 2
	   		
		do  { 
	   		System.out.print("Digite o codigo referente ao sexo\n[1] HOMEM || [2] MULHER: ");
	   			sexoDoAluno[i] = recebe.nextInt();
			} while (sexoDoAluno[i] < 1 || sexoDoAluno[i] > 2);
		

	   	} recebe.close();
	   	
//separando homem de mulher (alturas), e contando quantos homens e mulheres tem!
	   	
	   	
	   	for (int i = 0; i < quantidadeDeFichas; i++) {
	   		if(sexoDoAluno[i] == 1) {
	   			alturaHomem[i] = alturaDaPessoa[i];
	   			quantidadeHomem++;
	   			
	   		} else if (sexoDoAluno[i] == 2) {
	   			alturaMulher[i] = alturaDaPessoa[i];
	   			quantidadeMulher++;
	   		}
	   	}
	   	
//obtendo a media das alturas de homem, e de mulher
	   	
	   	for (int i = 0; i < quantidadeDeFichas; i++) {
	   		mediaAlturaHomens += alturaHomem[i];
	   	}
	   		mediaAlturaHomens = mediaAlturaHomens / quantidadeHomem;
	   		
	   	for (int i = 0; i < quantidadeDeFichas; i++) {
	   		mediaAlturaMulheres += alturaMulher[i];
	   	} 
	   		mediaAlturaMulheres = mediaAlturaMulheres / quantidadeMulher;
	   		

//calculando media geral de alturas (homem, mulher e entre todos)
	   		
	   	for (int i = 0; i < quantidadeDeFichas; i++) {
	   		mediaGeralDasAlturas = mediaGeralDasAlturas + alturaDaPessoa[i];
	   	}
	   	mediaGeralDasAlturas = (mediaGeralDasAlturas / quantidadeDeFichas);
	   	
	   	System.out.printf("\nMedia geral: %.2f metros \n", mediaGeralDasAlturas);
	   	System.out.printf("Media entre homens: %.2f metros \n", mediaAlturaHomens);
	   	System.out.printf("Media entre mulheres: %.2f metros \n", mediaAlturaMulheres);
	   	System.out.printf("Aluno(a) mais alto(a): " + nomeDoMaisAlto +  ", %.2f metros \n", maisAlto);
	   	System.out.printf("Aluno(a) mais baixo(a): " + nomeDoMaisBaixo +  ", %.2f metros \n\n", maisBaixo);

//calculando mulher acima da media homem
   		
	   	System.out.println("Mulheres com altura acima da média dos homens: ");
   		
	   	for (int i = 0; i < quantidadeDeFichas; i++) {
   			if (alturaMulher[i] > mediaAlturaHomens && alturaMulher[i] > 0) {
   				System.out.println(nomeDoAluno[i] + ", " + alturaMulher[i]);   				
   			}	
   		}
//calculando homem abaixo da media mulher
	   	
	   	System.out.println("Homens com altura abaixo da média das Mulheres: ");

	 	for (int i = 0; i < quantidadeDeFichas; i++) {

   			if (alturaHomem[i] < mediaAlturaMulheres && alturaHomem[i] > 0) {
   				System.out.println(nomeDoAluno[i] + ", " + alturaHomem[i]);
   			}
	 	}
	   	
//exibindo fichas
	   	
	   	for (int i = 0; i < (quantidadeDeFichas); i++ ) {
	   		System.out.println("Ficha [" + (i+1) + "]: " + nomeDoAluno[i] + ", " + alturaDaPessoa[i] + " metros, sexo: " + sexoDoAluno[i]) ;
	   	}
	   		
   }
}