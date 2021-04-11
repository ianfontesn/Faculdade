package fixacao2;

import java.util.Scanner;

public class Ex3Aluno {

    static Aluno alunos[] = new Aluno[20]; // VETOR PARA GUARDAR CADA INSTANCIA DE ALUNO CRIADA

    // METODO PARA CADASTRAR ALUNO

    static void cadastrar() {

        Scanner in = new Scanner(System.in);

        int posCadastro = -1;
        boolean podeCadastrar = false;

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] == null) {

                posCadastro = i;
                podeCadastrar = true;
                break;

            } else if (i == (alunos.length - 1) && alunos[i] != null) { // ULTIMA POSI��O DO ARRAY E N�O TEM ESPA�O NULL

                System.err.println("N�O H� MAIS ESPA�OS PARA CADASTRO");
                break;

            } else {

                continue;
            }

        }

        if (podeCadastrar) {

            alunos[posCadastro] = new Aluno();

            System.out.println("Nome do aluno:");
            alunos[posCadastro].nome = in.nextLine();

            System.out.println("Matricula: ");

            int auxMatricula = in.nextInt();
            boolean podeNumeroMatricula = true;

            for (int i = 0; i < alunos.length; i++) {

                if (alunos[i] != null) {

                    if (alunos[i].matricula == auxMatricula) {
                        System.err.println("Matricula existente.");
                        podeNumeroMatricula = false;
                        alunos[posCadastro] = null;

                        break;

                    } else {

                        continue;
                    }

                } else {

                    continue;

                }

            }

            if (podeNumeroMatricula) {

                alunos[posCadastro].matricula = auxMatricula;

                System.out.println("Ano de ingresso: ");
                int auxAno = in.nextInt();

                alunos[posCadastro].ano = auxAno;
                in.nextLine(); // RESETA BUFFER SCANNER

                System.out.println("Nome do curso SEM ACENTUAÇÃO: ");
                String auxCurso = in.nextLine();

                alunos[posCadastro].curso = auxCurso;

                System.out.println("CADASTRO EFETUADO COM SUCESSO.");

            }
        }

    }

    // METODO PARA VERIFICAR ALLUNOS EM DETERMINADO CURSO

    static void verificarCurso() {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o nome do curso sem acento: ");

        String curso = in.nextLine();
        boolean auxUltimaPos = false;

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] != null) {

                if (i == (alunos.length - 1)) {
                    auxUltimaPos = true;
                }

                if (alunos[i].curso.equalsIgnoreCase(curso)) {

                    alunos[i].mostrarAtributosAlunoPorCurso();

                } else if (auxUltimaPos) {

                    System.err.println("Nenhum curso com este nome encontrado. Verifique se colocou acentos ou escreveu corretamente.");

                    break;

                } else {

                    continue;

                }

            } else {

                continue;

            }

        }

    }


    // METODO REMOVER ALUNO QUE ENTROU NA FACUL ANTES DO ANO INFORMADO

    static void excluirAlunoAnteriorAnoEscolhido() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = in.nextInt();

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] != null) {

                if (alunos[i].ano < ano) {  //SE O ANO FOR MENOR, REMOVE E COLOCA NULL NO LUGAR.

                    alunos[i] = null;

                } else if (i == (alunos.length - 1) && alunos[i] == null) {  // SE ULTIMA POSI��O DO VETOR E FOR NULA IMPRIME:

                    System.out.println("REMOÇÃO COMPLETA");

                } else {

                    continue;
                }

            } else {

                continue;

            }

        }

    }

    // MAIN

    public static void main(String[] args) {

        boolean repetir = true;

        do {

            System.out.printf("\n MENU DE OPÇÕES \n"
                    + "1 - CADASTRAR ALUNO \n"
                    + "2 - VISUALIZAR NOME, MATRICULA E ANO DE ENTRADA DE TODOS OS ALUNOS DE UM DETERMINADO CURSO \n"
                    + "3 - EXCLUIR ALUNO COM ENTRADA ANTERIOR AO ANO ESCOLHIDO\n" + "4 - SAIR\n\n");

            Scanner in = new Scanner(System.in);
            int option = in.nextInt();

            switch (option) {

                case 1:

                    cadastrar();
                    break;

                case 2:

                    verificarCurso();
                    break;

                case 3:

                    excluirAlunoAnteriorAnoEscolhido();
                    break;

                case 4:
                    System.out.println("FINALIZADO.");
                    System.exit(0);

                default:

                    System.err.println("OP��O INV�LIDA");

            }


        } while (repetir);

    }
}
