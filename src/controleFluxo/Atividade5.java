package controleFluxo;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao, quantidade;
		float valor;
		String produto;
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para escolher Cachorro Quente--");
		System.out.println("--Digite 2 para escolher X-Salada--");
		System.out.println("--Digite 3 para escolher X-Bacon--");
		System.out.println("--Digite 4 para escolher Bauru--");
		System.out.println("--Digite 5 para escolher Refrigerante--");
		System.out.println("--Digite 6 para escolher Suco de laranja--");
		opcao = ler.nextInt();
		
		System.out.println("Quantidade");
		quantidade = ler.nextInt();
		
		switch(opcao) {
		case 1:
			produto = "Cachorro Quente";
			valor = 10.00f;
			System.out.println("Produto: " + produto);
			System.out.println("R$ " + (valor * quantidade));
			break;
		case 2:
			produto = "X-Salada";
			valor = 15.00f;
			System.out.println("Produto: " + produto);
			System.out.println("R$ " + (valor * quantidade));
			break;
		case 3:
			produto = "X-Bacon";
			valor = 18.00f;
			System.out.println("Produto: " + produto);
			System.out.println("R$ " + (valor * quantidade));
			break;
		case 4:
			produto = "Bauru";
			valor = 12.00f;
			System.out.println("Produto: " + produto);
			System.out.println("R$ " + (valor * quantidade));
			break;
		case 5:
			produto = "Refrigerante";
			valor = 8.00f;
			System.out.println("Produto: " + produto);
			System.out.println("R$ " + (valor * quantidade));
			break;
		case 6:
			produto = "Suco de laranja";
			valor = 13.00f;
			System.out.println("Produto: " + produto);
			System.out.println("R$ " + (valor * quantidade));
			break;
		default:
			System.out.println("Digite um valor valido");
		}		
		
		ler.close();
	}

}
