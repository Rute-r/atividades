package controleFluxo;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		float numero1, numero2;
		
		System.out.println("Digite o Primeiro numero: ");
		numero1 = ler.nextFloat();
		System.out.println("Digite o Segundo numero: ");
		numero2 = ler.nextFloat();
		
		System.out.println("\n--Escolha a operação matemática: --");
		System.out.println("--Digite 1 para Soma--");
		System.out.println("--Digite 2 para Subtração--");
		System.out.println("--Digite 3 para Multiplicação--");
		System.out.println("--Digite 4 para Divisão--");
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
		default:
			System.out.println("Digite uma operação valida");
		}		
		
		ler.close();

	}

}
