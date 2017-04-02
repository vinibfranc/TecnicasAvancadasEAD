package controle;

import visao.JanelaPrincipal;

public class App {
	// método principal da aplicação
	public static void main(String[] args) {
		JanelaPrincipal janela = new JanelaPrincipal();
		Controlador controle = new Controlador(janela);
		janela.setVisible(true);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null); // centralização na janela no centro da tela
	}
}

