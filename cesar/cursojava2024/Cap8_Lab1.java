package cursojava2024;

public class Cap8_Lab1 {

	public static int maiorNumero(int[] numeros) {
        
        if (numeros.length == 0) {
            return Integer.MIN_VALUE; 
        }

        int maior = numeros[0]; 

        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; 
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] meuArray = {3, 7, 2, 9, 5};
        int maior = maiorNumero(meuArray);
        System.out.println("O maior número é: " + maior);
    }

 
    
}
