package controle;

import visao.JanelaPrincipal;

public class App {
	
	public static void main(String[] args) {
		JanelaPrincipal jan = new JanelaPrincipal();
		Controlador controle = new Controlador(jan);
		jan.setVisible(true);
		jan.setResizable(false);
		jan.setLocationRelativeTo(null);

	}
}

