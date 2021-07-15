package it.euris.ires;

public class Main
{
    public static void main(String[] args) {

        // Precondizione: classe Calculator dev'essere istanziata
        Calculator c = new Calculator();

        // Semplice test
        int result = c.add(1, 1); // SUT

        // Postcondizione: risultato atteso
        if (result == 2) {
            System.out.println("CORRETTO");
        }
    }
}
