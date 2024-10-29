package controleFluxo;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner ler  = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o número A: ");
		a = ler.nextInt();
		
		System.out.println("Digite o número B: ");
		b = ler.nextInt();
		
		System.out.println("Digite o número C: ");
		c = ler.nextInt();
		// imprimir na tela se a soma de a e b eh maior, menor ou igual a c
		if ((a + b) == c) {
			System.out.println("A Soma de A + B é Igual a C");
		} else if ((a + b) > c) {
			System.out.println("A Soma de A + B é Maior que C");
		}else {
			System.out.println("A Soma de A + B é Menor que C");
		}
		
		ler.close();

	}

}
