/*
        Satz: ImWinter;trage_ich Handschuhe.
        Wie viele Worte enthält die Zeichenfolge (Wort im Sinne durch Leerzeichen getrennt).

        Tipps: Worte lassen sich erkennen, wenn

        - sie von Leerzeichen umgeben sind

        - mit einem Großbuchstaben anfangen

        1.) Satz sauber strukturieren (Leerzeichen an der richtigen Stelle einfügen, falsche Zeichen ersetzen)

        2.) Worte ermitteln

        3.) Worte zählen
*/
public class SentenceAnalysis {

    public static final String WHITESPACE = " ";
    public static final char WHITE_SPACE_CHAR = ' ';

    public static void main(String[] args) {
        String sentence="ImWinter;trage_ich Handschuhe.";
        String normalized = normalizeString(sentence);
        print(normalized);
        String[] words = normalized.split(WHITESPACE);
        for(int idx=0; idx < words.length;idx++){
            print(words[idx]);
        }
        print("Anzahl Worte im Satz: " + words.length);
    }


    /*
    remove special chars and add whitespace before capital letters if character at position before is not whitespace.
     */
    public static String normalizeString(String sentence) {
        String onlyValidChars= sentence.replaceAll("[;_]"," ");
        int buffer=100; // etwas mehr Platz im neuen Array vorsehen
        char[] target = new char[sentence.length()+buffer];
        int offset=0;
        for(int idx=0; idx < onlyValidChars.length();idx++){
            if(idx > 0 && isCapitalLetter(onlyValidChars, idx) && sentence.charAt(idx - 1) != WHITE_SPACE_CHAR){
                target[idx]=WHITE_SPACE_CHAR;
                target[idx+1]=onlyValidChars.charAt(idx);
                offset++;
            }else {
                target[idx+offset] = onlyValidChars.charAt(idx);
            }
        }
        return String.valueOf(target);
    }

    /*
        see ASCI Table for classification of capital letters
        https://www.torsten-horn.de/techdocs/ascii.htm
     */
    public static boolean isCapitalLetter(String string, int characterIndex) {
        return string.charAt(characterIndex) >= 65 && string.charAt(characterIndex) <= 90;
    }

    public static void print(String normalized) {
        System.out.println(normalized);
    }
}
