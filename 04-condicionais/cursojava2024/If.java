package cursojava2024;

import java.util.Scanner;

public class If {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	/*conhecendo if*/
	System.out.println("voce tem mais de 18 anos? ");
	String resposta=scanner.nextLine();
	/*verificando o numero:*/
	boolean mais18 = resposta. equalsIgnoreCase("sim");
	if(mais18) {
		System.out.print("apartir dos 18 voce tem que votar.");
	}else {
		System.out.print("você nao é obrigado a votar.");
	}
}
}
