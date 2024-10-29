package controleFluxo;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int operacao;
		float saldo = 1000.00f, valor;

		System.out.println("\n--Escolha uma operação: --");
		System.out.println("--Digite 1 para Saldo--");
		System.out.println("--Digite 2 para Saque--");
		System.out.println("--Digite 3 para Deposito--");
		operacao = ler.nextInt();

		switch (operacao) {
		case 1:
			System.out.printf("Operação - Saldo\nSaldo: R$ %.2f", saldo);
			break;
		case 2:
			System.out.println("Valor: ");
			valor = ler.nextFloat();
			if (saldo < valor) {
				System.out.println("Operação - Saque\nSaldo insuficiente!");
			} else {
				System.out.printf("Operação - Saque\nNovo Saldo: R$ %.2f", (saldo - valor));
			}
			break;
		case 3:
			System.out.println("Valor: ");
			valor = ler.nextFloat();
			System.out.printf("Operação - Deposito\nNovo Saldo: R$ %.2f", (saldo + valor));
			break;
		default:
			System.out.println("Digite uma operação valida!");
		}

		ler.close();

	}

}
