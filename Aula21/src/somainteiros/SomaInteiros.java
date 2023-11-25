package somainteiros;

import java.util.Scanner;

public class SomaInteiros {
    private int x;
    private int y;

    public void soma(int x, int y) {
    	this.x=x;
    	this.y=y;
        System.out.println("A soma desses números é: " + (x + y));
    }
}

class Main {
    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int x = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        int y = entrada.nextInt();

        SomaInteiros somaInteiros = new SomaInteiros();
       
        somaInteiros.soma(x,y);
    }
}
