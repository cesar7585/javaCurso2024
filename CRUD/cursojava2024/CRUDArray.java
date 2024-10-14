package cursojava2024;

import java.util.Scanner;

public class CRUDArray {
//	arrays para armezenar nomes e idades
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				int opcao;
		do {
			System.out.println("\n---menu---");
			System.out.println("1. adicionar usuario");
			System.out.println("2. exibir usuarios");
			System.out.println("3. atualizar usuarios");
			System.out.println("4. deletar usuario");
			System.out.println("5. sair");
			System.out.println("escolha umna opção:");
			opcao=sc.nextInt();
			
			switch(opcao) {
			case 1:
				adcionarUsuario(sc);
					break;
					case 2:
						exibirUsuarios();
							break;
					case 3:
						atualizarUsuario(sc);
						break;
					case 4:
						deletarUsuario(sc);
						break;
					case 5:
					System.out.println("saindo do sistema...!");
					break;
					default:
						System.out.println("opção invalida!");
				}
		}
		while(opcao!=5);
		sc.close();
			}

//	criar todos os metodos
//	adicionando usuiario
	public static void adcionarUsuario(Scanner sc) {
		if (contador < nomes.length) {
//			pegando o nome do usuario
			System.out.println("digite o nome: ");
			String nome = sc.next();
//			pegando a idade
			System.out.println("digite a iadade: ");
			int idade = sc.nextInt();
//			adicionando as variaveis dentro dos arrays:
			nomes[contador] = nome;
			idades[contador] = idade;
			contador++;
			System.out.println("susuario adicionado com sucesso!");

		} else {
			System.out.println("limite de susuario atingido!");
		}
	}

//	exibir usuarios:
	public static void exibirUsuarios() {
		if (contador == 0) {
			System.out.println("nao ah usuario cadastrador!");
		} else {
			for (int i = 0; i < contador; i++) {
				System.out.println((i + 1) + ". nome:" + nomes[i] + ", idade:" + idades[i]);
			}
		}
	}
//	atualizar usuario:

	public static void atualizarUsuario(Scanner sc) {
		System.out.println("digite o numero do suario a ser atualizado: ");
		int index = sc.nextInt() - 1;

		if (index >= 0 && index < contador) {
			System.out.println("digite o novo nome: ");
			String nome = sc.next();

			System.out.println("digite a nova idade: ");
			int idade = sc.nextInt();

//			jogando o nome tudo no array
			nomes[index] = nome;
			idades[index] = idade;
			System.out.println("usuario atualizado com sucesso");

		} else {
			System.out.println("usuario nao encontrado!");
		}
	}

//	deletar usuario
	public static void deletarUsuario(Scanner sc) {

		System.out.println("digite o numero do usuario a ser apagado! ");
		int index = sc.nextInt() - 1;

		if (index >= 0 && index < contador) {
			for (int i = index; i < contador - 1; i++) {
				nomes[1] = nomes[i + 1];
				idades[i] = idades[i + 1];

			}
			nomes[contador - 1] = null;
			idades[contador - 1] = 0;

		} else {
			System.out.println("usuario nao encontrado! ");

		}

	}

}
