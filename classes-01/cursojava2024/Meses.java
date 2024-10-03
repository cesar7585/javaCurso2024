package cursojava2024;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
			
			System.out.println("em que mes voce esta? ");
		String n1=sc.nextLine();
		
		
		switch(n1) {
			case "janeiro":
			case "março":
			case"maio":
			case"julho":
			case"agosto":
			case"outubro":
			case"dezembro":
				System.out.println("o mes em que voce esta tem 31 dias");
				
			case "abril":
			case"junho":
			case "setembro":
			case"novembro":
				System.out.println("o mes em que voce esta tem 30 dias, aproveite");
				
			case "fevereiro":
				System.out.println("o mes em que voce esta tem 28 ou 29 dias ");
			
			default:
				System.out.println("");
			
			
			
			
			
		}

	}

}
