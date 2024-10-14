package cursojava2024;

public class Bicicleta implements Veiculo1 {

	public Bicicleta() {
		
	}
	@Override
	public void acelerar() {
		System.out.println("a bicicleta esta acelerando...\n");
		
	}
	@Override
	public void frear() {
		System.out.println("a bicicleta esta freando...");
	}
}
