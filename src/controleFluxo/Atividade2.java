package controleFluxo;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		// ler um numero
		System.out.println("Digite um número: ");
		numero = ler.nextInt();

		// printar se é par ou impar e positivo e negativo
		if (numero % 2 == 0) {
			if (numero >= 0) {
				System.out.println("O Número " + numero +  " é par e positivo!");
			}else {
				System.out.println("O Número " + numero +  " é par e negativo!");
			}
		} else {
			if (numero >= 0) {
				System.out.println("O Número " + numero +  " é impar e positivo!");
			} else {
				System.out.println("O Número " + numero +  " é impar e negativo!");
			}
		}
		
		ler.close();
	}

}
