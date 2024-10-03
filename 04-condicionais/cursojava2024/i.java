package cursojava2024;

import java.util.Scanner;

public class i {
public static void main(String[] args) {
	try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("quantos anos voce tem?\n");
		int idade =scanner.nextInt();
		
		if (idade>=18){
			System.out.println("você é obrigado a votar!");
		}else if(idade>=16 && idade<18){
			System.out.println("você pode votar se quiser");
		}
		else if (idade<16) {
			System.out.println("você ainda nao pode votar");
		}
	}	
}
}
