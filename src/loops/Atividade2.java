package loops;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "° número: ");
			numero = scanner.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Total de números pares: " + par + "\nTotal de  números ímpares: " + impar);

		scanner.close();
	}

}
