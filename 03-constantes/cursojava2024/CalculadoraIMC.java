package cursojava2024;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Seu peso está normal.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
            System.out.println("Sugestão: Consulte um nutricionista para uma dieta personalizada.");
        } else {
            System.out.println("Você está obeso.");
            System.out.println("Sugestão: Consulte um nutricionista para uma dieta personalizada e acompanhamento médico.");
        }

        scanner.close();
    }
}