package cursojava2024;

public class main {

	public static void main(String[] args) {
//criaçao de uma conta bancaria de uma conta com mil
		ContaBancaria conta = new ContaBancaria(1000.00);

//exibindo saldo inicial
		System.out.println("saldoinicial: " + conta.getSaldo());

//		realizando um deposito de 500
		conta.sacar(2);
		System.out.println("saldo: " + conta.getSaldo());
		
		conta.Depositar(90);
		System.out.println("deposito de R$"+conta.getSaldo());
	}
}
