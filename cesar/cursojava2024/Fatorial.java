package cursojava2024;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("me fale um numero");
		int n1 =sc.nextInt();
		
		int n9=1;
		
		if(n1<0) {
			System.out.println("o fatorial nao pode ser 0 ou menro que 0");
		}
		else {
			
			for(int i=1;i<=n1;i++) {
			int o=n9*+i;
			
			System.out.println(o);
			}
			
			
		}
		
		
		
		
		
}


	}


