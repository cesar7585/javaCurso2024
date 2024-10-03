package cursojava2024;

import java.util.Scanner;
import java.util.Random;

public class GeradorAleatorio {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		Random ra=new Random();
		
		for(int i=0;i<5;i++) {
			int n1=ra.nextInt(100)+1;
		
		
		System.out.println("o numero gerado aleatoriamente "+(i+1)+":"+n1);
		

	}

}
}