package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<Integer>();

		System.out.println("Digite 10 valores inteiros não repetidos: ");
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "° numero");
			numeros.add(scanner.nextInt());
		}

		Iterator<Integer> iNumeros = numeros.iterator();

		System.out.println("\nListar dados do Set: ");
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		scanner.close();

	}

}
