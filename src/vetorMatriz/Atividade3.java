package vetorMatriz;

public class Atividade3 {

	public static void main(String[] args) {
		int matrizNumeros[][] = { 
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};
		
		int somaPrincipal = 0, somaSecundaria = 0;

		System.out.println("Elementos da Diagonal Principal: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matrizNumeros[i][i] + " ");
			somaPrincipal += matrizNumeros[i][i];
		}

		System.out.println("\nElementos da Diagonal Secundária: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(matrizNumeros[i][2 - i] + " ");
			somaSecundaria += matrizNumeros[i][i];
		}

		System.out.println("\nSoma dos Elementos da Diagonal Principal: \n" + somaPrincipal);

		System.out.println("Soma dos Elementos da Diagonal Secundária: \n" + somaSecundaria);
	}

}
