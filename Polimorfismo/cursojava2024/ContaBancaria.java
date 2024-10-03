package cursojava2024;

public class ContaBancaria {
// atributo privado
	private double saldo;

//	construtor para iniciar o saldo
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	
	public void Depositar(double valor) {
		if (valor>0) {
			saldo+=valor;
			System.out.println("Deposito de R$"+valor+" feito com sucesso");
		}else {
			System.out.println("deposito invalido!");
		}
		
	}

//		metodo publico para sacar dinheiro
	public void sacar(double saldoInicial) {
		if (saldoInicial > 0 && saldoInicial <= saldo) {
			saldo -= saldoInicial;
			System.out.println("saque de R$ " + saldoInicial + " realizado!");
		} else {
			System.out.println("saque invalido, saldo insuficiente ou valor negativo! ");
		}

	}

//metodo publico para consultar o valor
	public double getSaldo() {
		return saldo;
	}


}

