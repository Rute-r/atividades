package loops;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//pegar valor de intervalo
		Scanner scanner = new Scanner(System.in);
		int primeiroNum, segundoNum;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNum = scanner.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		segundoNum = scanner.nextInt();
		
		if (primeiroNum > segundoNum) {
			System.out.println("Intervalo inválido!");
		} else {
			for(int i = primeiroNum; i <= segundoNum; i++) {
				if(i % 5 == 0 && i % 3 == 0) {
					System.out.println(i + " é multiplo de 3 e 5");
				}
			}
		}
		
		scanner.close();

	}

}
