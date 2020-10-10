package edu.dcv.string.examples;
/*
@author Tobias Mehre
 */
public class WordCountAdvanced {
    public static void main(String[] args) {
        // Aufgabe: Wie oft kommt das Wort 'Hand' vor?
        String einSatzVollerHänder= "Das ist eine Hand. Mit der Hand kann ich winken. " +
                "Freundlichen Menschen gebe ich gerne die Hand. " +
                "Im Winter trage ich Handschuhe." +
                "Gibst du mir deine Hand?";

        int wortAnzahl = 0;
        String[] worte=einSatzVollerHänder.split(" ");

        for(int i=0; i < worte.length;i++){
            String wortOhneSatzzeichen=worte[i].substring(0,worte[i].length()-1);
            if(worte[i].equals("Hand") || wortOhneSatzzeichen.equals("Hand")){
                wortAnzahl++;
            }
        }
        System.out.println("Anzahl Vorkommen 'Hand':"+wortAnzahl);
    }
}
