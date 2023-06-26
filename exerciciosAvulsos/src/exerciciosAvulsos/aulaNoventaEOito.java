package exerciciosAvulsos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aulaNoventaEOito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		list.add(2, "Marco"); // adiciona um elemento com posição definida na lista

		list.size(); // informa o tamanho da lista

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------");

		list.remove("Anna"); // remove o item da lista, pode usar o termo a ser removido ou a posição da
								// lista
		list.removeIf(x -> x.charAt(0) == 'M'); // remover com predicado

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("----------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("----------------------");

		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse("Não existem elementos que comecem com essa inicial");

		System.out.println(name);
	}

}
