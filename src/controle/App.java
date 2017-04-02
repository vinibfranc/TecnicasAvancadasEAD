package controle;

import java.awt.EventQueue;
import visao.JanelaPrincipal;

public class App {
	// método principal da aplicação
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal janela = new JanelaPrincipal();
					Controlador controle = new Controlador(janela);
					
					// ----> As seguintes funções podem ser postas no construtor de JanelPrincipal

					/*janela.setVisible(true);
					janela.getTxtPrimeiroNum().grabFocus(); // ajusta o foco para o textField do primeiro número
					janela.setResizable(false);
					janela.setLocationRelativeTo(null); // centralização na janela no centro da tela*/
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}