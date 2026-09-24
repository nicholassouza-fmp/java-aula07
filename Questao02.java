public class Questao02 {

    public static void main(String[] args) {

        // a) Declarar um array de inteiros
        int[] vet;

        // b) Neste momento, vet vale null

        // c) Instanciar um array com 15 posições
        vet = new int[15];

        // d) Valor de vet[5]
        System.out.println("Valor de vet[5]: " + vet[5]);

        // e) Tamanho do array
        int tam = vet.length;
        System.out.println("Tamanho do array: " + tam);

        // f) Último elemento
        System.out.println("Último elemento: " + vet[vet.length - 1]);

        // g) Índice do primeiro elemento
        System.out.println("Índice do primeiro elemento: 0");

        // h) Array para armazenar médias de 20 alunos
        double[] medias = new double[20];

        System.out.println("Array medias criado com " + medias.length + " posições.");
    }
}