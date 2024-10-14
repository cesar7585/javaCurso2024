package java2024;

public class paypal implements Pagamento {
	private boolean pago =false;

	@Override
	public void pagar(double valor) {
		System.out.println("pago com Paypal"+valor);
		pago=true;
		
	}

	@Override
	public String obterStatus() {
		
		return pago ? "pagamento realizado com com sucesso.":"pagamento invalido";
	}

}
