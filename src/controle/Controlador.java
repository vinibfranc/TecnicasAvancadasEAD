package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visao.JanelaPrincipal;

public class Controlador implements ActionListener {
	private JanelaPrincipal jan;
	private int num1;
	private int num2;
	private int resultado;
	
	public Controlador(JanelaPrincipal j) {
		this.jan = j;
		adicionaListeners();
	}
	
	public void adicionaListeners() {
		this.jan.getMntmSair().addActionListener(this);
		this.jan.getBtnSomar().addActionListener(this);
		this.jan.getBtnLimpar().addActionListener(this);
	}
	
	public int calculaSoma() {
		num1 = Integer.parseInt(jan.getTextFieldPrimeiro().getText());
		num2 = Integer.parseInt(jan.getTextFieldSegundo().getText());
		int soma = num1 + num2;
		return soma;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("Limpar")) {
			jan.limparCampos();
		}
		
		if(e.getActionCommand().equalsIgnoreCase("Somar")) {
			try {
				resultado = calculaSoma();
				jan.getTextFieldResultado().setText(String.valueOf(resultado));
			} catch (NumberFormatException e1) {
				System.out.println("Você deve digitar dois números inteiros para realizar a soma!");
				jan.limparCampos();
			}
			
		}
		
		if(e.getActionCommand().equalsIgnoreCase("Sair")) {
			System.exit(0);
		}
		
	}
}
