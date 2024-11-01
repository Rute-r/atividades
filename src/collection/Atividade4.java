package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		int numeroProcurado;

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = scanner.nextInt();

		if (numeros.contains(numeroProcurado)) {
			System.out.println("O número " + numeroProcurado + " foi encontrado!");
		} else {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		}
		scanner.close();

		// Set Integer
		// incia com 10 int
		// scanner 1 int
		// imprimir mensagem apropriada

	}

}
