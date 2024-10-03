package cursojava2024;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println(" digite uma palavra: ");
		String n1=sc.nextLine();
		
		//converte a palavra para minuscula para ignorar a difereça de caixa
		n1=n1.toLowerCase();
		
		//remove espaços em branco
		n1=n1.replaceAll("\\s+","");
		
		String inver=new StringBuilder(n1).reverse().toString();
		
		if (n1.equals(inver)) {
			System.out.println("a palavra "+n1+" é polindromo ;)");
		}else {
			System.out.println("a palavra "+n1+" não é polindromo.");
		}
		
	}

}
