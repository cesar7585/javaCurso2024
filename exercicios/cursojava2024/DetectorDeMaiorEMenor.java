package cursojava2024;
import java.util.Scanner;

public class DetectorDeMaiorEMenor {
public static void main(String[] args) {
	Scanner scanner=new Scanner (System.in);
	System.out.println("me fale algum numero: ");
	int n1=scanner.nextInt();
	System.out.println("agora me fale um segundo numero: ");
	int n2=scanner.nextInt();
	System.out.println("me fale um terceiro numero: ");
	int n3= scanner.nextInt();
	
	if (n1>n2 && n2>n3) {
		System.out.println(n1+" é maior de todos ");
	}
	else if (n2>n1 && n1>n3) {
		System.out.println(n2+ " é o maior de todos");
	}
	else if(n3>n1 && n2>n1) {
		System.out.println(n3+" é o maior de todos");
		
	}
}
}
