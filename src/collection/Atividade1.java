package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "° cor: ");
			cor = scanner.next();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores: \n");
		for (String corLista : cores) {
			System.out.println(corLista);
		}

		Collections.sort(cores);

		System.out.println("\nOrdenar as cores: \n");
		for (String corOrdenada : cores) {
			System.out.println(corOrdenada);
		}

		scanner.close();
	}

}
