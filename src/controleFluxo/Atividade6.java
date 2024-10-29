package controleFluxo;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		float salario, porcentagem;
		String nome, cargo;
		
		System.out.println("Nome do Colaborador: ");
		ler.skip("\\R?");
		nome = ler.nextLine();
		
		System.out.println("\n--Digite 1 para Gerente--");
		System.out.println("--Digite 2 para Vendedor--");
		System.out.println("--Digite 3 para Supervisor--");
		System.out.println("--Digite 4 para Motorista--");
		System.out.println("--Digite 5 para Estoquista--");
		System.out.println("--Digite 6 para Tecnico de TI--");
		opcao = ler.nextInt();
		
		System.out.println("Digite o Salario com virgula: ");
		salario = ler.nextFloat();
		
		switch(opcao) {
		case 1:
			cargo = "Gerente";
			porcentagem = 10.00f;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + (salario + (salario * porcentagem / 100)));
			break;
		case 2:
			cargo = "Vendedor";
			porcentagem = 7;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + (salario + (salario * porcentagem / 100)));
			break;
		case 3:
			cargo = "Supervisor";
			porcentagem = 9;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + (salario + (salario * porcentagem / 100)));
			break;
		case 4:
			cargo = "Motorista";
			porcentagem = 6;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + (salario + (salario * porcentagem / 100)));
			break;
		case 5:
			cargo = "Estoquista";
			porcentagem = 5;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + (salario + (salario * porcentagem / 100)));
			break;
		case 6:
			cargo = "Tecnico de TI";
			porcentagem = 8;
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cargo);
			System.out.println("Salário: " + (salario + (salario * porcentagem / 100)));
			break;
		default:
			System.out.println("Digite um valor valido");
		}		
		
		ler.close();

	}

}
