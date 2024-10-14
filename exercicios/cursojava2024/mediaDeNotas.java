package cursojava2024;

import java.util.Scanner;

public class mediaDeNotas {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
				
		System.out.println("me fale quanto que o seu aluno tirou na sua materia: ");
		double n1=sc.nextDouble();
		
		System.out.println("quantas provas voce falou para ele fazer: ");
		int n2=sc.nextInt();
		
		double n3= n1/n2;
		
		if (n3>5) {
			System.out.println("o seu aluno nao conseguiu passar de ano");
		}else if (n3<=6)

	}

}
