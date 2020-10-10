package edu.dcv.string.examples;

public class StringSampleMethods {
    public static void main(String[] args) {
        System.out.println("Hello".charAt(1)); // Was ist die ausgabe?
        System.out.println("Hello".substring(3)); // Was ist hier die Ausgabe?
        System.out.println("Hello".substring(1,4)); // Was ist hier die Ausgabe?
        System.out.println("HeLLo".contains("LL")); // was ist die Ausgabe?
        System.out.println("Hello".contains("LL")); // was ist die Ausgabe?
        System.out.println("Test Wörter sind schön".split(" ")); // was ist das Ergebnis?

        // ASCII Tabelle -- unterschiedliche Integer Werte
        System.out.println((int) 'l');
        System.out.println((int) 'L');
    }
}
