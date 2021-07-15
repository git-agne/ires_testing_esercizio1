package it.euris.ires;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// Precondizione: classe Calculator dev'essere istanziata
		Calculator c = new Calculator();

		// Semplice test
		int result = c.add(1,1); // SUT

		// Postcondizione: risultato atteso
		if(result == 2) {
			System.out.println("CORRETTO");
		}
	}
	// Si può fare test parametrico:
	void addTest(int a, int b, int c) {
		// int c è il risultato atteso
	}
}
// SUT: metodo add()
// Precondizioni: deve ricevere due interi
// Postcondizioni: ci aspettiamo la somma dei due interi inseriti in input
