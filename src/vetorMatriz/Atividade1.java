package vetorMatriz;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorNumeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, posicao = 0;
		boolean vazia = true;

		System.out.println("Digite o número que você deseja encontrar");
		numero = scanner.nextInt();

		for (int i = 0; i < vetorNumeros.length; i++) {
			if (numero == vetorNumeros[i]) {
				posicao = i;
				vazia = false;
			}
		}

		if (!vazia) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		scanner.close();

	}

}
