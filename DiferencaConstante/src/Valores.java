import java.util.Scanner;

public class Valores {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Escolha uma quantidade mínima de 3 números positivos:");
		
		int q = s.nextInt();

		if(q < 3) {
			quantidadeInvalida();
		}
		
		int[] numeros = new int[q];
		
		for(int i = 0; i < q; i++) {
			System.out.print("Digite o elemento: " + (i + 1) + ": ");
			numeros[i] = s.nextInt();
			while(numeros[i] < 0) {
				numeroNegativo();
				numeros[i] = s.nextInt();
			}
		}
		
		System.out.print("Elementos digitados: ");
		System.out.print("[");
		for(int i = 0; i < q; i++) {
			System.out.print(numeros[i]);
			if(i != numeros.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		validarElementos(numeros);
	}
	
	static void quantidadeInvalida() {
		System.err.println("Quantidade de números menor do que 3! Digite pelo menos 3 números");
		System.exit(0);
	}
	
	static void numeroNegativo() {
		System.err.print("Número negativo, por favor digite um número positivo");
	
	}
	
	static void validarElementos(int[] numeros) {
		int diferenca = numeros[1] - numeros[0];
		
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] - numeros[i - 1] != diferenca) {
				System.out.println("Diferença entre todos os números não é constante.");
				System.exit(0);
			}
		}
		System.out.println("A diferença de valores entre todos os elementos é de " + diferenca);
	}
}
