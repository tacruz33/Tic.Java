package mediaponderada;

import java.util.Scanner;

class MediaPonderada {
	
	 float nota1, nota2, nota3;
	 float peso1=2, peso2=3, peso3=5;
	
	public void Calculo() {
		
		int calculonotas = (int) ((int)(nota1*peso1)+(nota2*peso2)+(nota3+peso3));
		int calculopesos = (int) (peso1+peso2+peso3);
		int ponderada= calculonotas/calculopesos;
		System.out.println("A Média pondera é: " + ponderada);
							
}
	
class main {
	
	public main(int[] args) {
    	
   
    Scanner entrada= new Scanner(System.in);
    		
    System.out.print("Digite a primeira nota :");
    int nota1 =  entrada.nextInt();
    System.out.print("Digite a segunda nota :");
    int nota2 =  entrada.nextInt();
    System.out.print("Digite a terceira nota :");
    int nota3 =  entrada.nextInt();
    }
    	
   
    
    MediaPonderada.Calculo();
    }
}


















