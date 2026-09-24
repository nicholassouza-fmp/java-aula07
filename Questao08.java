import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linhas = entrada.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        int colunas = entrada.nextInt();

        int[][] m = new int[linhas][colunas];

        // Preencher a matriz
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                System.out.print(
                    "Digite o valor da posição [" + i + "][" + j + "]: "
                );

                m[i][j] = entrada.nextInt();
            }
        }

        // a) Calcular a média dos números
        int soma = 0;
        int quantidade = 0;

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                soma = soma + m[i][j];

                quantidade++;
            }
        }

        double media = (double) soma / quantidade;

        System.out.println("\nMédia: " + media);

        // c) Contar múltiplos comuns de 3 e 5
        int quantidadeMultiplos = 0;

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] % 3 == 0 && m[i][j] % 5 == 0) {

                    quantidadeMultiplos++;
                }
            }
        }

        System.out.println(
            "Quantidade de múltiplos comuns de 3 e 5: "
            + quantidadeMultiplos
        );

        entrada.close();
    }
}