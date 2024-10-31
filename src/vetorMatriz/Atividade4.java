package vetorMatriz;

public class Atividade4 {

	public static void main(String[] args) {
		float matrizNotas[][] = { { 4.0f, 5.0f, 7.0f, 3.0f }, { 2.5f, 6.5f, 4.7f, 8.0f }, { 10.0f, 8.5f, 9.5f, 8.0f },
				{ 9.0f, 6.5f, 7.6f, 8.2f }, { 5.0f, 5.0f, 5.0f, 6.3f }, { 7.0f, 8.0f, 9.0f, 8.5f },
				{ 5.5f, 3.5f, 2.5f, 1.0f }, { 8.0f, 9.0f, 10.0f, 9.5f }, { 5.6f, 5.8f, 6.5f, 7.0f },
				{ 7.5f, 8.5f, 9.5f, 10.0f } };
		float soma = 0.0f, media = 0.0f;
		
		for(int i = 0; i < 10; i++) {
			soma = 0.0f;
			for (int j = 0; j < 4; j++) {
				soma += matrizNotas[i][j];
			}
			media = soma / 4.0f;
			System.out.printf("%.1f | ", media);
		}

	}

}
