package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			ler.useLocale(Locale.US); //Mudei a localidade para aceitar input com ponto ao inves de virgula como solicita na atividade
	        
	        float numero1, numero2, numero3, numero4, diferenca;
	        
	        System.out.println("Numero 1: ");
	        numero1 = ler.nextFloat();
	        
	        System.out.println("Numero 2: ");
	        numero2 = ler.nextFloat();
	        
	        System.out.println("Numero 3: ");
	        numero3 = ler.nextFloat();
	        
	        System.out.println("Numero 4: ");
	        numero4 = ler.nextFloat();
	        
	        diferenca = (numero1 * numero2) - (numero3 * numero4);
	        
	        System.out.printf(Locale.US, "Diferença: %.1f\n", diferenca); //garante que o resultado será com ponto como separador decimal e apenas um numero apos o ponto
	        
	        ler.close();

	}

}
