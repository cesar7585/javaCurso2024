package java2024;

public class PagamentoCredito implements Pagamento {
	private boolean pago=false;

	@Override
	public void pagar(double valor) {
		boolean pago;
		System.out.println("pagamento realizado com sucesso"+valor);
		pago=true;
	}

	@Override
	public String obterStatus() {
		return pago?"realizado com sucesso":"pendente";
	}

}
