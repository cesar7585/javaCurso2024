package cursojava2024;

import java.util.Scanner;

public class Taxi {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		
		System.out.println("Quantos km você rodou? ");
		double n1=sc.nextDouble();
		
		double n2= n1*2+10;
		
		System.out.println("O passageiro tem que pagar "+n2+" a taxa ja foi somada.");
		
		
	}

}
