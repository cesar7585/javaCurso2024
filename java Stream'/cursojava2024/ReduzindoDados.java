package cursojava2024;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ReduzindoDados {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>numeros=new ArrayList<>();
		do {
		System.out.println("digite um numero (ou'sair'para finalizar): ");
		String input=sc.nextLine();
		
		
		if(input.equalsIgnoreCase("sair")) {
			break;
		}
		try {
			int numero=Integer.parseInt(input);
			numeros.add(numero);
		}catch(NumberFormatException e) {
			System.out.println("entrada invalida, digite apenas numeros.");
		}
		
		
		}while(true);
		
		
		int soma= numeros.stream().reduce(0,(total,numero)->total+numero);
		System.out.println("a soma dos numeros digitados é: "+soma);
		

	}

}
