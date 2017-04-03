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
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
