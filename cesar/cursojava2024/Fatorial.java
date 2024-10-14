package cursojava2024;

import java.util.Scanner;

public class Fatorial {
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("qual o seu nome?!");
	    String n1=sc.nextLine();
	    
	    testes(n1);
	}
	public static void testes(String n1) {

		System.out.println("seu nome é "+ n1);
	}
}