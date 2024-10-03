package cursojava2024;
import java.util.Scanner;

public class DivisaoporTres {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("me fale um numero: ");
	int n1=scanner.nextInt();
	if(n1%3==0 && n1%5==0) {
		System.out.println("é possivel dividir o numero por 3 e 5");
	}else {
		System.out.println("o numero não é dividido por 3 e 5");
	}
}
}
