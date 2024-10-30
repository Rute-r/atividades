package loops;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade, genero, cargo, pessoas = 0;
		int backend = 0, mulherFrontend = 0, homemMobile = 0, nBinarefull = 0;
		float total =  0;
		boolean resposta = true;

		while (resposta) {
			System.out.println("Idade: ");
			idade = scanner.nextInt();

			System.out.println("Identidade de Gênero: ");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			genero = scanner.nextInt();

			System.out.println("Pessoa Desenvolvedora: ");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			cargo = scanner.nextInt();

			if (cargo == 1) {
				backend++;
			} else if ((genero == 1 || genero == 4) && cargo == 2) {
				mulherFrontend++;
			} else if ((genero == 2 || genero == 5) && cargo == 3 && idade > 40) {
				homemMobile++;
			} else if (genero == 3 && cargo == 4 && idade < 30) {
				nBinarefull++;
			}

			System.out.println("Deseja continuar (S/N)? ");
			resposta = scanner.next().equalsIgnoreCase("s");

			pessoas++;
			total += idade;
		}

		System.out.println("Total de pessos desenvolvedoras Backend: " + backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFrontend);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+ homemMobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nBinarefull);
		System.out.println("O número total de pessoas que respondera, à pesquisa: " + pessoas);
		System.out.println("A média de idade das pessoas que respondera, à pesquisa: " + (total / pessoas));
		scanner.close();
	}
}
