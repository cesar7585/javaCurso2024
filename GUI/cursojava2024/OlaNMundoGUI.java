package cursojava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaNMundoGUI extends JFrame {
//	configurando a tela/janela
	public OlaNMundoGUI() {
		setTitle("ola mundo em java");//titulo do projeto
		setSize(300,200);//tamanho da letrea
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//isso vai fechar quando alguem quiser fechar o projeto
		setLocationRelativeTo(null);//centralizando o botao
		
//		criando um botao
		JButton btn=new JButton("clique em mim!");
		
//		adicionar um evento escultador:
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent e) { 
//				exibe um popup com a mensagem"ola mundo"
				JOptionPane.showMessageDialog(null,"ola mundo");
				
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
