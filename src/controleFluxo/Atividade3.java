package controleFluxo;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o Nome do doador: ");
		ler.skip("\\R?");
		nome = ler.nextLine();
		
		System.out.println("Digite a Idade do doador: ");
		idade = ler.nextInt();
		
		
		if (idade >= 18 && idade <= 69) {
			//Pergunta se é a primeira doação apenas se tiver idade para doar
			System.out.println("Primeira doação de sangue? ");
			primeiraDoacao = ler.nextBoolean();
			
			 //Se for maior de 60 anos e for a primeira doação
			if(idade >= 60 && primeiraDoacao) {
				System.out.println(nome + " não está apto para doar sangue!");
			} else {
				System.out.println(nome + " está apto para doar sangue!");
			}
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
		
		ler.close();

	}

}
