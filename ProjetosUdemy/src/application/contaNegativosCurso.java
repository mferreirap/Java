package application;

import java.util.Locale;
import java.util.Scanner;

public class contaNegativosCurso {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// declarei uma variável inicial que indicará quantos números serão recebidos no
		// vetor
		System.out.println("Quantos números você irá digitar: ");
		int n = sc.nextInt();

		// validei que o número informado é maior que zero e menor que dez
		while (n <= 0 || n > 10) {
			System.out.println("Número inválido, favor informar um número inteiro maior que zero e menor que dez.");
			n = sc.nextInt();
		}

		int[] vetorNumeros = new int[n];

		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Digite um número: ");
			vetorNumeros[i] = sc.nextInt();
		}

		System.out.println("Os números negativos são: ");
		for (int i = 0; i < vetorNumeros.length; i++) {
			if (vetorNumeros[i] < 0) {
				System.out.println(vetorNumeros[i]);
			}
		}

		sc.close();

	}

}
