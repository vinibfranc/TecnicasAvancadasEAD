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

// classe de interface gráfica da aplicação
public class JanelaPrincipal extends JFrame {
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField txtResultado;
	private JTextField txtPrimeiroNum;
	private JTextField txtSegundoNum;
	private JButton btnSomar;
	private JButton btnLimpar;
	private JMenuItem mntmSair;

	public JanelaPrincipal() {
		setTitle("Revisão do Ano Passado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 250);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		// hierarquia de menus da aplicação
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		mntmSair = new JMenuItem("Sair");
		mnMenu.add(mntmSair);
		
		// primeiro painel contém o textField do resultado da soma
		panel_1 = new JPanel();
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		txtResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtResultado.setPreferredSize(new Dimension(600, 70));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.add(txtResultado);
		txtResultado.setColumns(10);
		
		// segundo painel contém os números a serem somados
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		getContentPane().add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPrimeiroNum = new JLabel("Primeiro N\u00FAmero\r\n");
		lblPrimeiroNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblPrimeiroNum);
		
		txtPrimeiroNum = new JTextField();
		txtPrimeiroNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(txtPrimeiroNum);
		txtPrimeiroNum.setColumns(10);
		
		JLabel lblSegundoNum = new JLabel("Segundo N\u00FAmero");
		lblSegundoNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblSegundoNum);
		
		txtSegundoNum = new JTextField();
		txtSegundoNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(txtSegundoNum);
		txtSegundoNum.setColumns(10);
		
		// terceiro painel contém os botões de somar e limpar
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
	}
	// métodos getters necessários para o gerenciamento do controlador
	public JTextField getTxtResultado() {
		return txtResultado;
	}

	public JTextField getTxtPrimeiroNum() {
		return txtPrimeiroNum;
	}

	public JTextField getTxtSegundoNum() {
		return txtSegundoNum;
	}

	public JButton getBtnSomar() {
		return btnSomar;
	}

	public JButton getBtnLimpar() {
		return btnLimpar;
	}

	public JMenuItem getMntmSair() {
		return mntmSair;
	}
	// método de limpeza dos campos
	public void limparCampos() {
		txtResultado.setText("");
		txtPrimeiroNum.setText("");
		txtSegundoNum.setText("");
	}

}
