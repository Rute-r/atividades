package loops;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0, menor21 = 0, maior50 = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menor21 + "\nTotal de pessoas maiores de 50 anos: "
				+ maior50);
		;

		scanner.close();
	}

}