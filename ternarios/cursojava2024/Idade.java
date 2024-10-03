package cursojava2024;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner scanner =new Scanner (System.in);

		
		System.out.println("qual a sua idade? ");
		int n1=scanner.nextInt();
		String n2=(n1>=18)?"maior de 18 anos":"menor de 18 anos";
		System.out.println(n2);
	}

}
