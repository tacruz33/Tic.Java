import java.util.Scanner;

public class ConversorDeMoeda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a taxa de câmbio (1 dólar para reais): ");
        double taxaCambio = scanner.nextDouble();

        System.out.print("Insira a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorConvertido = quantidadeDolares * taxaCambio;

        System.out.printf("%.2f dólares equivalem a %.2f reais%n", quantidadeDolares, valorConvertido);

        scanner.close();
    }
}
