package edu.dcv.string.examples;

public class WordCountExample1 {
    public static void main(String[] args) {
        // Aufgabe: Wie oft kommt das Wort "ein" im folgenden Satz vor?
        String meinSatz= "Das ist ein Satz. Einmal mehr sage ich eines zu euch. Ein Mensch hat Hände.";

        // Algorithmus:
        // Zerlege die Zeichenfolge (String) in einzelne Worte
        // Vergleiche jedes Wort mit der Zeichenfolge "ein". Wenn gleich dann zaehler+1;
        // Gebe Anzahl aus.
        int wortAnzahl = 0;
        String[] worte=meinSatz.split(" ");
        for(int i=0; i < worte.length;i++){
            if(worte[i].equals("ein")){
                wortAnzahl++;
            }
        }
        System.out.println("Anzahl Vorkommen 'ein':"+wortAnzahl);
    }
}
