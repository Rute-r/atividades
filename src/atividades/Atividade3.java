package atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			ler.useLocale(Locale.US); //Mudei a localidade para aceitar input com ponto ao inves de virgula como solicita na atividade
	        
	        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	        
	        System.out.println("Salário Bruto: ");
	        salarioBruto = ler.nextFloat();
	        
	        System.out.println("Adicional Noturno: ");
	        adicionalNoturno = ler.nextFloat();
	        
	        System.out.println("Horas Extras: ");
	        horasExtras = ler.nextFloat();
	        
	        System.out.println("Descontos: ");
	        descontos = ler.nextFloat();
	        
	        salarioLiquido = (salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos);
	   
	        System.out.printf(Locale.US, "Salário Líquido: %.2f\n", salarioLiquido); //garante que o resultado será com ponto como separador decimal e apenas um numero apos o ponto
	        
	        ler.close();

	}

}
