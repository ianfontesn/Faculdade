package trabalho_olimpiadas;

import java.util.Scanner;

/**
 * @author Isabella Souza, Luiz Felipe
 */


public class PassaBolinha_IanIsabellaLuiz {

    private static int passarBolinha(int[][] Matrix, boolean[][] MatrixBandeiras, int posicaoAlunoOrigemLinha, int posicaoAlunoOrigemColuna, int posicaoAlunoAtualLinha, int posicaoAlunoAtualColuna, int bandeirasLevantadas, int N) {

        MatrixBandeiras[posicaoAlunoAtualLinha][posicaoAlunoAtualColuna] = true;
        int alunoAtual = Matrix[posicaoAlunoAtualLinha][posicaoAlunoAtualColuna];
        //olhando para o aluno Norte
        if ((posicaoAlunoAtualLinha - 1) >= 0) {
            int alunoNorte = Matrix[posicaoAlunoAtualLinha - 1][posicaoAlunoAtualColuna];
            if (alunoNorte >= alunoAtual && !MatrixBandeiras[posicaoAlunoAtualLinha - 1][posicaoAlunoAtualColuna]) {
                bandeirasLevantadas = passarBolinha(Matrix, MatrixBandeiras, posicaoAlunoAtualLinha, posicaoAlunoAtualColuna, posicaoAlunoAtualLinha - 1, posicaoAlunoAtualColuna, bandeirasLevantadas, N);
            }
        }

        //olhando para o aluno Leste
        if (posicaoAlunoAtualColuna + 1 < N) {
            int alunoLeste = Matrix[posicaoAlunoAtualLinha][posicaoAlunoAtualColuna + 1];
            if (alunoLeste >= alunoAtual && !MatrixBandeiras[posicaoAlunoAtualLinha][posicaoAlunoAtualColuna + 1]) {
                bandeirasLevantadas = passarBolinha(Matrix, MatrixBandeiras, posicaoAlunoAtualLinha, posicaoAlunoAtualColuna, posicaoAlunoAtualLinha, posicaoAlunoAtualColuna + 1, bandeirasLevantadas, N);
            }
        }

        //olhando para o aluno Sul
        if (posicaoAlunoAtualLinha + 1 < N) {
            int alunoSul = Matrix[posicaoAlunoAtualLinha + 1][posicaoAlunoAtualColuna];
            if (alunoSul >= alunoAtual && !MatrixBandeiras[posicaoAlunoAtualLinha + 1][posicaoAlunoAtualColuna]) {
                bandeirasLevantadas = passarBolinha(Matrix, MatrixBandeiras, posicaoAlunoAtualLinha, posicaoAlunoAtualColuna, posicaoAlunoAtualLinha + 1, posicaoAlunoAtualColuna, bandeirasLevantadas, N);
            }
        }

        //olhando para o aluno Oeste
        if (posicaoAlunoAtualColuna - 1 >= 0) {
            int alunoOeste = Matrix[posicaoAlunoAtualLinha][posicaoAlunoAtualColuna - 1];
            if (alunoOeste >= alunoAtual && !MatrixBandeiras[posicaoAlunoAtualLinha][posicaoAlunoAtualColuna - 1]) {
                bandeirasLevantadas = passarBolinha(Matrix, MatrixBandeiras, posicaoAlunoAtualLinha, posicaoAlunoAtualColuna, posicaoAlunoAtualLinha, posicaoAlunoAtualColuna - 1, bandeirasLevantadas, N);
            }
        }

        return bandeirasLevantadas + 1;
    }

    public static void main(String[] args) {
        int posicaoAlunoLinha, posicaoAlunoColuna;

        int bandeirasLevantadas = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor N das linhas: ");
        int N = teclado.nextInt();
        teclado.nextLine();
        int[][] Matrix = new int[N][N];
        boolean[][] MatrixBandeiras = new boolean[N][N];

        System.out.println("Digite a posição do aluno que recebe a bolinha, no formato (linha coluna): ");
        String[] posicaoAluno = teclado.nextLine().split(" ");

        posicaoAlunoLinha = Integer.parseInt(posicaoAluno[0]);
        posicaoAlunoColuna = Integer.parseInt(posicaoAluno[1]);

        // Popula a matriz
        for (int i = 0; i < N; i++) {
            System.out.println("Digite a disposiçao dos alunos na linha: ");
            String[] linha = teclado.nextLine().split(" ");
            for (int j = 0; j < N; j++) {
                Matrix[i][j] = Integer.parseInt(linha[j]);
            }
        }
        // na primeira chamada a origem é o professor, assumimos a posicao -1 -1 para ele
        bandeirasLevantadas = passarBolinha(Matrix, MatrixBandeiras, -1, -1, posicaoAlunoLinha - 1, posicaoAlunoColuna - 1, bandeirasLevantadas, N);

        System.out.println(bandeirasLevantadas);

    }

}
