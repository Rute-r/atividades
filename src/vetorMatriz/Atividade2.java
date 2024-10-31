package vetorMatriz;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorNumeros[] = new int[10];
		int numero, soma = 0;
		float media = 0.00f;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° elemento do vetor: ");
			numero = scanner.nextInt();

			vetorNumeros[i] = numero;
			soma += vetorNumeros[i];
		}

		System.out.println("Elementos nos índices ímpares: ");
		for (int impar = 0; impar < 10; impar++) {
			if (impar % 2 != 0) {
				System.out.print(vetorNumeros[impar] + " ");
			}
		}

		System.out.println("\nElementos pares: ");
		for (int par = 0; par < 10; par++) {
			if (vetorNumeros[par] % 2 == 0) {
				System.out.print(vetorNumeros[par] + " ");
			}
		}
		System.out.println("\nSoma: \n" + soma);

		media = soma / 10f;
		System.out.printf("Media: \n%.2f", media);

		scanner.close();

	}

}
