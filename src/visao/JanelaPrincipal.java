package visao;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JMenu;

public class JanelaPrincipal extends JFrame {
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField textFieldResultado;
	private JTextField textFieldPrimeiro;
	private JTextField textFieldSegundo;
	private JButton btnSomar;
	private JButton btnLimpar;
	private JMenuItem mntmSair;

	public JanelaPrincipal() {
		setTitle("Prova 2 POO I");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		textFieldResultado = new JTextField();
		textFieldResultado.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldResultado.setPreferredSize(new Dimension(600, 70));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(textFieldResultado);
		textFieldResultado.setColumns(10);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPrimeiroNumero = new JLabel("Primeiro N\u00FAmero\r\n");
		lblPrimeiroNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblPrimeiroNumero);
		
		textFieldPrimeiro = new JTextField();
		textFieldPrimeiro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(textFieldPrimeiro);
		textFieldPrimeiro.setColumns(10);
		
		JLabel lblSegundoNumero = new JLabel("Segundo N\u00FAmero");
		lblSegundoNumero.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblSegundoNumero);
		
		textFieldSegundo = new JTextField();
		textFieldSegundo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(textFieldSegundo);
		textFieldSegundo.setColumns(10);
		
		panel_3 = new JPanel();
		panel_3.setMinimumSize(new Dimension(10, 7));
		panel_3.setBackground(new Color(175, 238, 238));
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSomar = new JButton("Somar");
		btnSomar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		panel_3.add(btnSomar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_3.add(btnLimpar);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmArquivo = new JMenuItem("Arquivo");
		mnMenu.add(mntmArquivo);
		
		mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public JPanel getPanel_2() {
		return panel_2;
	}

	public void setPanel_2(JPanel panel_2) {
		this.panel_2 = panel_2;
	}

	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public JTextField getTextFieldResultado() {
		return textFieldResultado;
	}

	public void setTextFieldResultado(JTextField textFieldResultado) {
		this.textFieldResultado = textFieldResultado;
	}

	public JTextField getTextFieldPrimeiro() {
		return textFieldPrimeiro;
	}

	public void setTextFieldPrimeiro(JTextField textFieldPrimeiro) {
		this.textFieldPrimeiro = textFieldPrimeiro;
	}

	public JTextField getTextFieldSegundo() {
		return textFieldSegundo;
	}

	public void setTextFieldSegundo(JTextField textFieldSegundo) {
		this.textFieldSegundo = textFieldSegundo;
	}

	public JButton getBtnSomar() {
		return btnSomar;
	}

	public void setBtnSomar(JButton btnSomar) {
		this.btnSomar = btnSomar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public void setBtnLimpar(JButton btnLimpar) {
		this.btnLimpar = btnLimpar;
	}
	
	public JMenuItem getMntmSair() {
		return mntmSair;
	}

	public void setMntmSair(JMenuItem mntmSair) {
		this.mntmSair = mntmSair;
	}

	public void limparCampos() {
		textFieldResultado.setText("");
		textFieldPrimeiro.setText("");
		textFieldSegundo.setText("");
	}

}
