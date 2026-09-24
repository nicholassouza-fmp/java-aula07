import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // -----------------------------------------
        // a) Armazenar números ímpares a partir de 1
        // -----------------------------------------

        int[] v = new int[10];

        int numero = 1;

        for (int i = 0; i < v.length; i++) {

            v[i] = numero;

            numero = numero + 2;
        }

        System.out.println("Números ímpares:");

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        // -----------------------------------------
        // b) Ler notas e validar de 0 a 10
        // -----------------------------------------

        double[] notas = new double[5];

        for (int i = 0; i < notas.length; i++) {

            do {

                System.out.print("Digite a nota " + (i + 1) + ": ");
                notas[i] = entrada.nextDouble();

                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println(
                        "Nota inválida! Digite uma nota entre 0 e 10."
                    );
                }

            } while (notas[i] < 0 || notas[i] > 10);
        }

        System.out.println("\nNotas digitadas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        entrada.close();
    }
}