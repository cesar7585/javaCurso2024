package cursojava2024;

import java.util.Scanner;

public class PositivosNegativos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("qual a sua idade? ");
		int num = scanner.nextInt();

		if (num < 12) {
			System.out.println("ainda é uma criança");
		} else if (num >= 12 && num <= 17) {
			System.out.println("Adolecente? ainda é jovem");
		} else if (num >= 18 && num <= 59) {
			System.out.println("Ja é adulto...coitado, tem que pagar boleto");
		} else if (num > 60) {
			System.out.println("Ja é aposentado ja, ja é um senhor de idade");
		}
	}

}
