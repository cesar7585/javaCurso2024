package cursojava2024;

import java.util.Scanner;

public class SomaDETudo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("me fale um numero: ");
		int n1= sc.nextInt();
		
		int soma=0;
	for(int n2=1; n2<=n1;n2++) {
		soma+=n2;
	}
		System.out.print("a soma de todos os numero anterior a "+n1+" é "+soma);
	
				
		
	}

}
