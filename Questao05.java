public class Questao05 {

    public static void main(String[] args) {

        int[][] mat = {
            {13, 45, 12, 19},
            {67, -5, 88, 37},
            {11, 43, 13, 0},
            {64, 52, 29, 18},
            {71, 14, 19, 62}
        };

        // a) Quantidade de linhas
        System.out.println("Quantidade de linhas: " + mat.length);

        // b) Quantidade de colunas
        System.out.println("Quantidade de colunas: " + mat[0].length);

        // c) Onde está o valor 19
        System.out.println("Primeiro 19: mat[0][3]");
        System.out.println("Segundo 19: mat[4][2]");

        // d) mat[1][1]
        System.out.println("mat[1][1]: " + mat[1][1]);

        // e) mat[2][0] + 1
        System.out.println("mat[2][0] + 1: " + (mat[2][0] + 1));

        // f) mat[3+1][3-1]
        System.out.println(
            "mat[3+1][3-1]: " + mat[3 + 1][3 - 1]
        );

        // g) x = 2
        int x = 2;

        System.out.println("mat[x][x]: " + mat[x][x]);

        // h) mat[x+1][x]
        System.out.println(
            "mat[x+1][x]: " + mat[x + 1][x]
        );

        // i) mat[x][x] + 1
        System.out.println(
            "mat[x][x] + 1: " + (mat[x][x] + 1)
        );

        // j) mat.length
        System.out.println(
            "mat.length: " + mat.length
        );

        // k) mat[mat.length-1][1]
        System.out.println(
            "mat[mat.length-1][1]: "
            + mat[mat.length - 1][1]
        );

        // l) Quantidade total de números
        int quantidade = mat.length * mat[0].length;

        System.out.println(
            "Quantidade de números: " + quantidade
        );
    }
}