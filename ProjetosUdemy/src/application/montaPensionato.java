package application;

import java.util.Locale;
import java.util.Scanner;

import entities.pensionato;
import entities.quarto;

public class montaPensionato {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// criação do pensionato conforme regra com 10 quartos
		pensionato[] ametista = new pensionato[10];

		// iniciar os 10 quartos do pensionato cada um com um identificador e vazios
		quarto quarto = new quarto();

		for (int i = 0; i < ametista.length; i++) {
			int numeroQuarto = i;
			quarto = new quarto(numeroQuarto, 'N');
			ametista[i] = new pensionato(quarto);

		}

		int n = sc.nextInt();
		if (n < ametista.length) {

			System.out.println("Aceito");

		}

		else {
			System.out.println("Número de quarto inválido, informar um quarto entre 0 e 9");
		}

		sc.close();

	}

}
