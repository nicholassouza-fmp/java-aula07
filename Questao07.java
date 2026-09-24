public class Questao07 {

    public static void main(String[] args) {

        int[][] m = new int[3][4];

        // -----------------------------------------
        // a) Armazenar números ímpares a partir de 1
        // -----------------------------------------

        int numero = 1;

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                m[i][j] = numero;

                numero = numero + 2;
            }
        }

        System.out.println("Matriz com números ímpares:");

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + "\t");
            }

            System.out.println();
        }

        // -----------------------------------------
        // b) Preencher com números aleatórios
        // entre 10 e 50
        // -----------------------------------------

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                m[i][j] = (int) (Math.random() * 41) + 10;
            }
        }

        System.out.println("\nMatriz com números aleatórios:");

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + "\t");
            }

            System.out.println();
        }
    }
}