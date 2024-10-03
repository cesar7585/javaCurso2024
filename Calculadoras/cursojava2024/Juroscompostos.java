package cursojava2024;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Juroscompostos {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Digit a capital inicial: ");
		double n1=scanner.nextDouble();
		
		System.out.println("qual a taxa: ");
		double n2=scanner.nextDouble();
		
		System.out.println("qunatos anos pretente investir? ");
		int n3=scanner.nextInt();
		
		double cont= n1*Math.pow(1+(n2/100), n3);
		
		Locale brasil= new Locale("pt","br");
		NumberFormat formatomoeda=NumberFormat.getCurrencyInstance(brasil);
		
		System.out.printf("investindo "+n3+" voce tera R$",formatomoeda.format(cont));
		
		scanner.close();
		
	}

}
