package java2024;

import java.util.ArrayList;
import java.util.Scanner;

public class Final {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Pagamento> pagamentos = new ArrayList<>();

	Pagamento cartaoCredito = new PagamentoCredito();
	Pagamento boleto = new Boleto1();
	Pagamento paypal = new paypal();
	
	pagamentos.add(cartaoCredito);
	pagamentos.add(boleto);
	pagamentos.add(paypal);

	// Simulando pagamentos
	cartaoCredito.pagar(100.00);
	boleto.pagar(200.00);
	paypal.pagar(150.00);
	

	// Processando boleto manualmente
	if (boleto instanceof Boleto1) {
		((Boleto1) boleto).processarBoleto();
	}

	// Exibindo status de todos os pagamentos
	for (Pagamento pagamento : pagamentos) {
		System.out.println("Status: " + pagamento.obterStatus());
	}
}
}