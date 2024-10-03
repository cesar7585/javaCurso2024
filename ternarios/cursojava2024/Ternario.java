package cursojava2024;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("me fale um numero: ");
		int n1=scanner.nextInt();
		String n2= (n1%2==0)?"onumero é par":"onumero é impar";
		System.out.println("o numero "+n1+" é "+n2);

	}

}
