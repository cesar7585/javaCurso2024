package cursojava2024;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SortearPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> no = new ArrayList<>();
		Random ra = new Random();
		String nome;

		System.out.println("digite os nomes das pessoas[ou 'sair' para encerrar]");

		while (true) {
			System.out.println("digite um nome:");
			nome = sc.nextLine();

			if (nome.equalsIgnoreCase("sair")) {
				break;

			}
			if (!nome.trim().isEmpty()) {
				no.add(nome);
			} else {
				System.out.println("nome invalido, tente novamente!");
			}

		}
//		verifica se existem nomes na lista:
		if (no.isEmpty()) {
			System.out.println("nem um nome foi inserido: ");
		} else {
//			sorteio
			int sorteio = ra.nextInt(no.size());
			String sorteado = no.get(sorteio);

//			axibe nome sorteado:
			System.out.println("A pessoa sorteada foi " + sorteado);
			sc.close();
		}

		 //kjhkjhkljhljhljhkjlhkjlhkjlhljhlj
//		teste
	}
}
