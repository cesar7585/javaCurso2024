package cursojava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
		Carros carro1=new Carros ("Toyota", "Corolla", 2000,4);
		Carros carro2 = new Carros("Ford mustang", "Biscayne", 1968, 2);
		Carros carro3 = new Carros("Hyuga 180sx", "BMW E60", 2005, 4);
		
		//Exibindo o carro
		
		System.out.println("\nDetalhes do Carro 1");
		carro1.exibirDetalhes();
		
		
		
		System.out.println("\nDetalhes do Carro 2");
		carro2.exibirDetalhes();
		
		
		System.out.println("\nDetalhes do Carro 3");
		carro3.exibirDetalhes();
		
		Moto moto1 = new Moto("Miata", "Nissan S13", 1991,true);
		Moto moto2 = new Moto("Ford mustang", "Biscayne", 1968,false );
		Moto moto3 = new Moto("Hyuga 180sx", "BMW E60", 2005,true );
		
		System.out.println("------------------------");
		System.out.println("---------motos----------");
		System.out.println("------------------------");
		
		System.out.println("\nDetalhes do moto 1");
		moto1.exibirDetalhes();
		
		
		
		System.out.println("\nDetalhes do moto 2");
		moto2.exibirDetalhes();
		
		
		System.out.println("\nDetalhes do moto 3");
		moto3.exibirDetalhes();
		
		
		
	}

}
