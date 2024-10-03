package cursojava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {

		String n1="Bem vindo ao curso de java";
		String n2=" vamos aprender sobre sstring";
		String n3="cesar matos duarte";
		
		//1-comprimento da String:
		System.out.println("comprimento da string: "+n3.length());
		
		
		//concatenar strings=juntar
		String textoCompleto=n1+n2;
				System.out.println(textoCompleto);
			String no="Cesar";
				String so="Duarte";
				
				System.out.println(no+" "+so);
		

		
//		converção de maiusculas para minuscula
		
		System.out.println("MAIUSCULAS "+n1.toLowerCase());
		
//		substituir uma parte da string
		
		String n0=n1.replace("java","vitoria");
		
		System.out.println(n0);
		
//		busca por uma substring:
		int pos=n1.indexOf("curso");
		System.out.println("posição da palavra 'curso': "+pos);
		
//		verificar se começa ou termina com 1 substring
		
		System.out.println("termina com 'java':"+n1.endsWith("java"));
		System.out.println("começa com 'bem': "+n1.startsWith("bem"));
		
		
//		dividir string
		
		String [] pala = textoCompleto.split(" ");
		System.out.println("palavra texto completo: ");
		for(String palavra : pala) {
			System.out.println(pala);
			
			
		}
//		remover epaço
		String textoComSpaços="    texto com espaços    ";
		System.out.println("texto com espaços: "+textoComSpaços.trim()+"'");
		
	}
 
}
