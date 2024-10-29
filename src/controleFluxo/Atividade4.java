package controleFluxo;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String primeira, segunda, terceira;

		System.out.println("Vertebrado ou Invertebrado? ");
		primeira = ler.nextLine().toLowerCase();

		if (primeira.equals("vertebrado")){
			System.out.println("Ave ou Mamifero? ");
			segunda = ler.nextLine().toLowerCase();

			if (segunda.equals("ave")) {
				System.out.println("Carnivoro ou Onivoro? ");
				terceira = ler.nextLine().toLowerCase();

				if (terceira.equals("carnivoro")) {
					System.out.println("Aguia");
				} else if (terceira.equals("onivoro")) {
					System.out.println("Pomba");
				}

			} else if (segunda.equals("mamifero")) {
				System.out.println("Onivoro ou Herbivoro? ");
				terceira = ler.nextLine().toLowerCase();

				if (terceira.equals("onivoro")) {
					System.out.println("Homem");
				} else if (terceira.equals("herbivoro")) {
					System.out.println("Vaca");
				}

			}

		}

		if (primeira.equals("invertebrado")) {
			System.out.println("Inseto ou Anelideo");
			segunda = ler.nextLine().toLowerCase();

			if (segunda.equals("inseto")) {
				System.out.println("Hematofago ou Herbivoro? ");
				terceira = ler.nextLine().toLowerCase();

				if (terceira.equals("hematofago")) {
					System.out.println("Pulga");
				} else if (terceira.equals("herbivoro")) {
					System.out.println("Lagarta");
				}

			} else if (segunda.equals("anelideo")) {
				System.out.println("Hematofago ou Onivoro? ");
				terceira = ler.nextLine().toLowerCase();

				if (terceira.equals("hematofago")) {
					System.out.println("Sanguessuga");
				} else if (terceira.equals("onivoro")) {
					System.out.println("Minhoca");
				}

			}
		}

		ler.close();

	}

}
