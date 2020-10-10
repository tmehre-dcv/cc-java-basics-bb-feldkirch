package edu.dcv.string.examples;

public class CharCountExample {
    public static void main(String[] args) {
        String meinSatz= "Das ist ein Satz. Einmal mehr sage ich eines zu euch. Ein Mensch hat Hände.";
        // Aufgabe: Wie oft kommt das Satzzeichen '.' vor?

        int anzahl = 0;
        char sign = '.';
        for(int i=0; i < meinSatz.length(); i++){
            if(meinSatz.charAt(i) == sign){
                anzahl++;
            }
        }
        System.out.println("Anzahl Vorkommen '.':"+anzahl);
    }
}
