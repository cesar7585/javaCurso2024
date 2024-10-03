package cursojava2024;

public class IfConciso {

	public static void main(String[] args) {
		int numero=50;
		/*if(numero>=10) {
			System.out.println("valor maior/igual que 10");
		}else {
			System.out.println("valor menor que 10");
		}*/
		String res= (numero >=10)? "maior que 10":"menor que 10";
		System.out.println("o numero "+numero+" é "+res);
	}

}
