import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayDoUsuario();
        int[] arrayAleatorio = criarArrayAleatorio(5);

        System.out.println("Soma do array do usuário: " + calcularSoma(arrayUsuario));
        System.out.println("Maior valor do array do usuário: " + encontrarMaiorValor(arrayUsuario));
        System.out.println("Menor valor do array do usuário: " + encontrarMenorValor(arrayUsuario));

        System.out.println("\nSoma do array aleatório: " + calcularSoma(arrayAleatorio));
        System.out.println("Maior valor do array aleatório: " + encontrarMaiorValor(arrayAleatorio));
        System.out.println("Menor valor do array aleatório: " + encontrarMenorValor(arrayAleatorio));
    }
}
