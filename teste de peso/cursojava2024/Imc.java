package cursojava2024;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Quanto você pesa? (fale em kilos) ");
            double peso = sc.nextDouble();

            System.out.println("Quanto de altura você tem? ");
            double altura = sc.nextDouble();

            
            if (peso <= 0 || altura <= 0) {
                System.out.println("O cálculo não pode ser realizado com números negativos, tente novamente!");
                continue; 
            }

            
            double imc = peso / (altura * altura);

            
            
            if (imc < 18.5) {
                System.out.println("Abaixo do peso!");
            } else if (imc < 25) {
                System.out.println("Peso normal, parabéns!");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            } else {
                System.out.println("Obesidade, cuidado!");
            }

            
            System.out.println("Deseja calcular o IMC novamente? (s/n)");
            char continuar = sc.next().charAt(0);

            if (continuar != 's' && continuar != 'S') {
                break; 
            }
        }

        sc.close();
    }
}