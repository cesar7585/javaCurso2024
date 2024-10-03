package cursojava2024;
import java.util.Scanner;

public class Parouimpar {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("me diaga um numero: ");
	int n1=scanner.nextInt();
	
	if(n1 %2==0) {
		System.out.println("o numero digitado é par");
	}else {
		System.out.println("o numero digitado é impar");
	}
	
	
}
}
