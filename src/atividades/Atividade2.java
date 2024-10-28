package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US); //Mudei a localidade para aceitar input com ponto ao inves de virgula como solicita na atividade
        
        float nota1, nota2, nota3, nota4, media;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextFloat();
        
        System.out.println("Digite a quarta nota: ");
        nota4 = ler.nextFloat();
        
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf(Locale.US, "Média final: %.1f\n", media); //garante que o resultado será com ponto como separador decimal e apenas um numero apos o ponto
        
        ler.close();

	}

}
