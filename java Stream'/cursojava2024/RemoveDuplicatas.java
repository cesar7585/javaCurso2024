package cursojava2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatas {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 4, 5, 6);

        // Remove duplicatas da lista
        List<Integer> semDuplicatas = numeros.stream().distinct().collect(Collectors.toList());

        // Verifica se há números pares na lista sem duplicatas
        boolean haPares = semDuplicatas.stream().anyMatch(numero -> numero % 2 == 0);

        // Imprime a mensagem sobre a existência de números pares
        if (haPares) {
            System.out.println("A lista contém números pares.");
        } else {
            System.out.println("A lista não contém números pares.");
        }

        // Imprime a lista sem duplicatas, independentemente da existência de pares
        System.out.println("Lista sem duplicatas: " + semDuplicatas);
    }
}