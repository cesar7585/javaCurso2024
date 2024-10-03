package cursojava2024;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("me fale um numero: ");
		int n1=scanner.nextInt();
		
		System.out.println("agora fale onde devo parar: ");
		int n2=scanner.nextInt();
		
		int cont=1;
		while(cont<=n2) {
			int res=n1*cont;
			System.out.println(n1+" x "+cont+"="+res);
			cont++;
		}
	}

}
