package loops;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero; 
		float multiplos3 = 0, contador = 0;

		do {
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();

			if (numero % 3 == 0 && numero != 0) {
				multiplos3 += numero;
				contador++;
			}
		} while (numero != 0);

		System.out.println("A média de todos os números múltiplos de 3 é: " + (multiplos3 / contador));
		scanner.close();

	}

}
