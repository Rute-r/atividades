package collection2;

import java.util.LinkedList;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String> fila = new LinkedList<String>();
		int opcao;
		String nome;

		// Exibe o menu
		System.out.println("*********************************************");
		System.out.println("\t1 - Adicionar Cliente na Fila");
		System.out.println("\t2 - Listar todos os Clientes");
		System.out.println("\t3 - Retirar Cliente da Fila");
		System.out.println("\t0 - Sair");
		System.out.println("*********************************************");

		do {
			// Guarda uma opção do menu e limpa a fila do Scanner
			System.out.println("\nDigite uma opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				// Adiciona o nome na lista
				System.out.println("\nDigite o Nome: ");
				nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				if (fila.isEmpty()) {
					// Avisa se a fila estiver vazia
					System.out.println("A fila está vazia.");
				} else {
					// Imprime todos os nomes na Lista
					System.out.println("\nFila: \n");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					// Avisa se a fila estiver vazia
					System.out.println("\nA fila está vazia!");
				} else {
					// Remove o primeiro nome da fila
					String clienteChamado = fila.remove();
					System.out.println("Cliente " + clienteChamado + " foi chamade!");
				}
				break;
			case 0:
				// Finaliza o programa quando digitado 0
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				// Informa que o numero digitado é invalido
				System.out.println("\nValor invalido");
			}
		} while (opcao != 0);
		scanner.close();
	}

}
