package cursojava2024;

import java.util.Arrays;


public class FiltrarValores {

	public static void main(String[] args) {
		 List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 4, 5, 6);
		 
//		 filtrando apenas os numeros pares:
		 numeros.stream().filter(n -> n%2==0).forEach(System.out::print);
		
	}

}
