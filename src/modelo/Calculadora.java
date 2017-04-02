package modelo;
// classe que contém as regras de negócio da aplicação
public class Calculadora {
	// ----> Não é necessária a inclusão de atributos ou métodos específicos para esta classe, apenas o método estático

	/*
	private int num1;
	private int num2;
	private int resultado;
	
	// construtor da calculadora
	public Calculadora(int num1, int num2, int resultado) {
		this.num1 = num1;
		this.num2 = num2;
		this.resultado = resultado;
	}
	// getters e setters
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	*/

	// método que calcula a soma entre os dois números informados
	public static int somaDoisNumeros(int x, int y) {
		return x + y;
	}
}
