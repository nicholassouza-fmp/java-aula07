import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int tamanho = entrada.nextInt();

        int[] numeros = new int[tamanho];

        // Preencher o array
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = entrada.nextInt();
        }

        // Calcular e mostrar a média
        double media = calcularMedia(numeros);

        System.out.println("Média: " + media);

        // Contar múltiplos de 3 e 5
        contarMultiplos(numeros);

        entrada.close();
    }

    // a) Método que calcula e retorna a média
    public static double calcularMedia(int[] numeros) {

        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {

            soma = soma + numeros[i];
        }

        return (double) soma / numeros.length;
    }

    // b) Método que conta os múltiplos comuns de 3 e 5
    public static void contarMultiplos(int[] numeros) {

        int quantidade = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 3 == 0 && numeros[i] % 5 == 0) {

                quantidade++;
            }
        }

        System.out.println(
            "Quantidade de múltiplos comuns de 3 e 5: "
            + quantidade
        );
    }
}