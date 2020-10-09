/*
Ein Buchladen hat den folgenden Montastergebnisse:
int[] businessResult = {-1, 10, 2, 5, -4, -3, -2, 0};


_ Was ist das Gesamtergebnis? (Summe der Monatsergebnisse)
_ Was ist das beste Monatsergebnis?
_ In welchem Monat war das beste Monatsergebnis?
_ Was ist das schwächste Monatsergebnis?
_ In welchem Monat war das schwächste Monatsergebnis?
_ War zwei hintereinander kommende Monate mit negativen Ergebnis?
_ Was war das längste Intervall mit negativen Ergebnis?
_ Was war das zweitbeste Ergebnis?

 */
public class MonthlyResults {
    public static void main(String[] args) {
        int[] businessResult = {-1, 10, 2, 5, -4, -3, -2, 0};

        int totalSum=0;
        int maxValue=businessResult[0];
        int maxValIdx=0;
        int minValue=businessResult[0];
        int minValIdx=0;

        int negativeFigureIntervalCount=0;
        int maxNegativeFigureIntervalCount=0;
        boolean twoNegativeInARow=false;

        for (int i=0; i < businessResult.length;i++) {
            // Summieren
            totalSum += businessResult[i];

            // negativ?
            if(businessResult[i]<0){
                negativeFigureIntervalCount++;
                if(negativeFigureIntervalCount==2){
                    twoNegativeInARow=true;
                }
            }else{
                // aktuelles Maximum merken
                if(negativeFigureIntervalCount>= maxNegativeFigureIntervalCount) {
                    maxNegativeFigureIntervalCount = negativeFigureIntervalCount;
                }

                // da nicht mehr negativ und damit das Intervall endet, muss Zähler auf 0 gesetzt werden!
                negativeFigureIntervalCount=0;
            }

            // größer als aktuelles Maxium?
            if (businessResult[i] >= maxValue) {
                maxValue = businessResult[i];
                maxValIdx = i;
            }

            // kleiner oder gleich als aktuelles Minimum?
            if (businessResult[i] <= minValue) {
                minValue = businessResult[i];
                minValIdx = i;
            }
        }

        /*
        Wir ermitteln das zweitbeste Ergebnis separat, um die Komplexität der oberen Schleife gering zu halten.
        Könnten wir das Ergebnis auch innerhalb der oberen Schleife ermitteln?
        Welche Herausforderungen könnte die kombinierte Lösung mit sich bringen?
         */
        int secondBest = businessResult[0];
        for(int i=0; i < businessResult.length; i++){

            boolean greaterOrEqualCurrentSecondBest = businessResult[i] >= secondBest;
            boolean lessThanMaxValue = businessResult[i] <= maxValue;

            // größer oder gleich bisher zweitbestes Ergebnis und kleiner als bestes Ergebnis
            if(greaterOrEqualCurrentSecondBest && lessThanMaxValue && i !=maxValIdx){
                secondBest =businessResult[i];
            }
        }

        System.out.println("Summe der Ergebnisse: " + totalSum);
        System.out.println("Bestes Monatsergebnis: " + maxValue);
        System.out.println("Monat mit bestem Ergebnis: " + (maxValIdx+1));
        System.out.println("Schlechtestes Ergebnis: " + minValue);
        System.out.println("Monat mit schlechtestem Ergebnis: " + (minValIdx+1));
        System.out.println("War zwei hintereinander kommende Monate mit negativen Ergebnis? " + twoNegativeInARow);
        System.out.println("Was war das längste Intervall mit negativen Ergebnis? " + maxNegativeFigureIntervalCount);
        System.out.println("Zweitbestes Ergebnis: " + secondBest);
    }
}
