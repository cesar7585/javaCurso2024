package cursojava2024;

public class Carro implements Veiculo1{
//	construtor sem parametros(necessario para a linha 'new carro')
	public Carro() {
		
	}
	@Override
	public void acelerar() {
		System.out.println("o carro esta acelerando...");
	}
	@Override
	public void frear() {
		System.out.println("o carro esta freando...\n");
	}
	

}
