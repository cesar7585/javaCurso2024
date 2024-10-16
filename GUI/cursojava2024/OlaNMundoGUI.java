package cursojava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaNMundoGUI extends JFrame {
//	configurando a tela/janela
	public OlaNMundoGUI() {
		setTitle("IMAC e IAC");// titulo do projeto
		setSize(400, 200);// tamanho da letrea
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// isso vai fechar quando alguem quiser fechar o projeto
		setLocationRelativeTo(null);// centralizando o botao

//		criando um botao
		JButton btn = new JButton("clique aqui para ver a resposta");

//		adicionar um evento escultador:
		btn.addActionListener(new ActionListener() {
			String alt = JOptionPane.showInputDialog("qual a sua altura?");
			double altura = Double.parseDouble(alt);

			String pes = JOptionPane.showInputDialog("qual o seu peso?");
			double peso = Double.parseDouble(pes);

			double resultado = peso / (altura * altura);

			@Override
			public void actionPerformed(ActionEvent e) {
//				exibe um popup com a mensagem"ola mundo"
				JOptionPane.showInputDialog(null, "o seu peso em imc é de ", resultado);

				String cin = JOptionPane.showInputDialog("qual o seu peso?");
				double cintura = Double.parseDouble(cin);

				double res = cintura / (altura * altura);

				JOptionPane.showInputDialog(null, "o seu peso em Iac é de ", res);

			}

		});

//		add botao na tela
		add(btn);

//		tornar a janela visivel
		setVisible(true);

	}

	public static void main(String[] args) {
//		chamar e executar a GUI
		new OlaNMundoGUI();
	}

}
