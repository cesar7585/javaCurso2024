package cursojava2024;

import java.util.Scanner;

public class Voto {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("quantos anos voce tem? ");
	int resposta= scanner.nextInt();
	System.out.println("homem ou mulher?");
	String respost = scanner.nextLine();
	boolean ou = respost.equalsIgnoreCase("mulher");
	if(resposta>=18 ) {
		System.out.println("voce ja tem que votar ");
	}else if (resposta<= 16){
		System.out.println("");
	}
}
}
