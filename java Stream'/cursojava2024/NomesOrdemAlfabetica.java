package cursojava2024;

import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class NomesOrdemAlfabetica {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("cesar");
		nomes.add("laura");
		nomes.add("alice");
		nomes.add("thiago");
		
	Collections.sort(nomes, Comparator.reverseOrder());
		
		System.out.println("lista de nomes");
		for(String nome:nomes) {
			System.out.println(nome);
		}
		
	}

}
