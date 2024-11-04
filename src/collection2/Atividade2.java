package collection2;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao;
		String livro;

		// Exibe o menu
		System.out.println("*********************************************");
		System.out.println("\t1 - Adicionar Livro na Pilha");
		System.out.println("\t2 - Listar todos os Livros");
		System.out.println("\t3 - Retirar Livro da Pilha");
		System.out.println("\t0 - Sair");
		System.out.println("*********************************************");
		System.out.println("Entre com a opção desejada: ");

		do {
			// Guarda uma opção do menu e limpa a fila do Scanner
			System.out.println("\nDigite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				// Adiciona o livro na pilha
				System.out.println("\nDigite o Nome: ");
				livro = scanner.nextLine();
				pilha.push(livro);
				System.out.println("\nPilha: \n");
				for (String titulo : pilha) {
					System.out.println(titulo);
				}
				System.out.println("\nLivro Adicionado!");
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha: \n");
					for (String titulo : pilha) {
						System.out.println(titulo);
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA pilha está vazia!");
				} else {
					String livroChamado = pilha.pop();
					System.out.println("\nPilha: \n");
					for (String titulo : pilha) {
						System.out.println(titulo);
					}
					System.out.println("\nLivro " + livroChamado + " foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nA Pilha está vazia!");
			}

		} while (opcao != 0);
		scanner.close();

	}

}
