package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US); //Mudei a localidade para aceitar input com ponto ao inves de virgula como solicita na atividade
        
        float salario, abono, novoSalario;
        
        System.out.println("Digite o Salário: ");
        salario = ler.nextFloat();
        
        System.out.println("Digite o Abono: ");
        abono = ler.nextFloat();
        
        novoSalario = salario + abono;
        
        System.out.println("Novo Salário: " + novoSalario);
        
        ler.close();

	}

}
