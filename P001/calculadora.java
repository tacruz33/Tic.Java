import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Criar um Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para inserir a temperatura
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        // Solicitar ao usuário escolher a unidade de origem
        System.out.println("Escolha a unidade de origem:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");

        int escolha = scanner.nextInt();

        // Realizar a conversão e exibir o resultado
        switch (escolha) {
            case 1:
                double fahrenheit = celsiusParaFahrenheit(temperatura);
                System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
                break;
            case 2:
                double celsius = fahrenheitParaCelsius(temperatura);
                System.out.println("Temperatura em Celsius: " + celsius);
                break;
            default:
                System.out.println("Escolha inválida!");
                break;
        }

        // Fechar o Scanner
        scanner.close();
    }

    // Método para converter de Celsius para Fahrenheit
    private static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter de Fahrenheit para Celsius
    private static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
 
