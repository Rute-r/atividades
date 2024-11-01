package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		int numeroProcurado, posicao;

		System.out.println("Digite o número que você deseja encontrar: ");
		numeroProcurado = scanner.nextInt();

		posicao = numeros.indexOf(numeroProcurado);

		if (posicao >= 0) {
			System.out.println("O número " + numeroProcurado + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numeroProcurado + " não foi encontrado");
		}
		scanner.close();

	}

}
