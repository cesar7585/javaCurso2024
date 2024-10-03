package cursojava2024;

import java.util.Scanner;

public class Gpt {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		        
		        System.out.println("Me fale um número: ");
		        int n2 = scanner.nextInt();
		        
		        System.out.println("Me fale outro número: ");
		        int n3 = scanner.nextInt();
		        
		        int res = 0;
		        
		        System.out.println("Quais das opções deseja? +, -, /, x");
		        String n1 = scanner.next();  // Use next() para ler o operador corretamente
		        
		        switch (n1) {
		            case "+":
		                res = n2 + n3;
		                System.out.println("O resultado do seu cálculo é : " + res);
		                break;
		            case "-":
		                res = n2 - n3;
		                System.out.println("O resultado do seu cálculo é : " + res);
		                break;
		            case "/":
		                if (n3 != 0) {
		                    res = n2 / n3;
		                    System.out.println("O resultado do seu cálculo é :"+res);
		                    break;
		              default:
		            	  System.out.println("tente de novo!");
				
		                }
			
			
			}

		}

