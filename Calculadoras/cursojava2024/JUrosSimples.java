package cursojava2024;

import java.util.Scanner;

public class JUrosSimples {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		System.out.println("------------------------------");
		System.out.println("  calculador de juros simples ");
		System.out.println("------------------------------");

		System.out.println("digite o capital: ");
		double cap=scanner.nextDouble();
		
		System.out.println("informe a taxa de juros(%): ");
		double tax=scanner.nextDouble();
		
		System.out.println("tempo de aplicação (em anos) ");
		int tem=scanner.nextInt();
		//calculando o juros
		double jur=(cap*tax*tem)/100;
		System.out.println("O valor dos juros são "+jur);
		
		double tot= cap+jur;
		System.out.println("o total investido + juros é de: "+tot );
		
		scanner.close();
		
		
		
		
		
	}

}
