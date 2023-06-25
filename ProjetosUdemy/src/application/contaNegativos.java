package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class contaNegativos {

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

		// instanciei um vetor inicializado com tamanho n
		ArrayList<Integer> vetorNumeros = new ArrayList<Integer>(n);

		// instanciei o loop que receberá os valores e atribuirá o valor ao seu lugar no
		// vetor
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vetorNumeros.add(i, sc.nextInt());

		}

		ArrayList<Integer> vetorNumerosNegativos = new ArrayList<Integer>();
		ArrayList<Integer> vetorNumerosPositivos = new ArrayList<Integer>();

		for (int j = 0; j < vetorNumeros.size(); j++) {
			if (vetorNumeros.get(j) < 0) {
				// int capacidadeAntigaVetor = vetorNumerosNegativos.size();
				// int capacidadeNovaVetor = capacidadeAntigaVetor++;
				vetorNumerosNegativos.add(vetorNumeros.get(j));
			} else {
				vetorNumerosPositivos.add(vetorNumeros.get(j));
			}
		}

		System.out.println("Os valores digitados são: " + vetorNumeros);
		System.out.println("Os valores da lista de negativos são: " + vetorNumerosNegativos);
		System.out.println("Os valores da lista de positivos são: " + vetorNumerosPositivos);

		sc.close();

	}

}
