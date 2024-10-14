package java2024;

public class Boleto1 implements Pagamento {
	private boolean processado = false;


	@Override
	public void pagar(double valor) {
		System.out.println("pagando com boleto R$" + valor);
		processado = true;
	}
	public void processarBoleto() {
        processado = true;
        System.out.println("Boleto processado.");
    }

	@Override
	public String obterStatus() {
		return processado ? "pagamento realizado com sucesso" : "pagamento pendente";
	}

}
