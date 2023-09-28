import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escolha uma quantidade mínima de 3 números positivos, para verificar se a diferença entre eles é a mesma: ");
		
		int q = s.nextInt();

		int[] numeros = new int[q];
		
		for(int i = 0; i < q; i++) {
			System.out.print("Digite o elemento: " + (i + 1) + ": ");
			numeros[i] = s.nextInt();
		}
	}
}
