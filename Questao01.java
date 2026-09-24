public class Questao01 {

    public static void main(String[] args) {

        // Criar o array a e atribuir valores
        int[] a = {507, -15, 147, 2194, 300, 27, 888, -110, 0, 675};

        // a) Qual é o índice do terceiro elemento?
        int i = 2;
        System.out.println("Índice " + i + " contém o elemento " + a[i]);

        // b) Qual é o conteúdo do terceiro elemento?
        System.out.println("Terceiro elemento do array: " + a[2]);

        // c) Índice do primeiro elemento
        System.out.println("Índice do primeiro elemento: 0");

        // d) Conteúdo do primeiro elemento
        System.out.println("Conteúdo do primeiro elemento: " + a[0]);

        // e) Índice onde está armazenado o valor 888
        System.out.println("Índice do valor 888: 6");

        // f) Valor de a[5]
        System.out.println("Valor de a[5]: " + a[5]);

        // g) Valor de a[5] + 2
        System.out.println("Valor de a[5] + 2: " + (a[5] + 2));

        // h) Valor de a[5 + 2]
        System.out.println("Valor de a[5 + 2]: " + a[5 + 2]);

        // i) a[x] + a[y] + 1
        int x = 2;
        int y = 4;

        System.out.println("a[x] + a[y] + 1: " + (a[x] + a[y] + 1));

        // j) a[x + y + 1]
        System.out.println("a[x + y + 1]: " + a[x + y + 1]);

        // k) Tamanho do array
        System.out.println("Tamanho do array: " + a.length);

        // l) Último elemento
        System.out.println("Último elemento: " + a[a.length - 1]);
    }
}