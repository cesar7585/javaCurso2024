package cursojava2024;

public class ClasseComMetodos {

//	metodo 01: calcukla a soma de 2 numeros:
	public int soma(int a, int b, int c) {
		return a + b + c;
	}

//	metodo 02: verificar se um numero é par
	public boolean ehPar(int numero, int c) {
		return numero % 2 == 0;
	}

	public int sc(int b) {
		return b / 10;
	}

//	metodo 03: inversao
	public String inversao(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}
//   metodo 04:calculo de fatorial
	public int fator(int numero) {
		if (numero == 0 || numero == 1) {
			return 1;
		}

		return numero * fator(numero - 1);
	}

	public static void main(String[] args) {
//		instanciando a clase:
		ClasseComMetodos util = new ClasseComMetodos();

//		chamando os metodos:
		System.out.println("o fatorial de 5 é  " + util.fator(5));

		System.out.println(util.soma(3,5,9));
		
		System.out.println(util.ehPar(3,5));
		
		System.out.println(util.sc(10));
		
		System.out.println(util.inversao("cesar"));
		
		
		
	}

}
