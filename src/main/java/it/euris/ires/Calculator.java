package it.euris.ires;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mult(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}
}
// SUT: metodo add()
// Precondizioni: deve ricevere due interi
// Postcondizioni: ci aspettiamo la somma dei due interi inseriti in input
