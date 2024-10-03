package cursojava2024;

import java.util.Scanner;

public class Cesar {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("me fale um numero: ");
		int n2=scanner.nextInt();
		
		System.out.println("me fale outro numero: ");
		int n3=scanner.nextInt();
		
		int res=0;
		
		System.out.println("quais das opções deseja? ,+,-,/,x");
		String n1=scanner.nextLine();
		
		switch(n1){
		case "+":
			res= n2+n3;
			System.out.println("o seu calculo de "+res);
			
		break;
		case "-":
			res= n2-n3;
			System.out.println("o seu calculo deu "+res);
			break;
			
		case "/":
			res= n2/n3;
			System.out.println("o seu calculo deu "+res);
			break;
			
		case "x":
			res= n2*n3;
			System.out.println("o seu calculo de "+res);
			
		default:
			System.out.println("invalido, tente de novo!");
		}
	}

}
