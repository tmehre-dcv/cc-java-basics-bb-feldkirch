/*
    Die folgende Top Ten Liste der Twitter Accounts ist etwas durcheinander geraten
    (Quelle: https://en.wikipedia.org/wiki/List_of_most-followed_Twitter_accounts)

	@ArianaGrande	Ariana Grande	77	Musician and actress	 USA
	@ladygaga	Lady Gaga	82	Musician and actress	 USA
	@katyperry	Katy Perry	109	Musician	 USA
	@taylorswift13	Taylor Swift	87	Musician	 USA
	@BarackObama	Barack Obama	123	Former U.S. president	 USA
	@realDonaldTrump	Donald Trump	87	Current U.S. president	 US
	@justinbieber	Justin Bieber	113	Musician	 CAN
	@rihanna	Rihanna	99	Musician and businesswoman	 BAR
	@Cristiano	Cristiano Ronaldo	88	Footballer	 POR
	@TheEllenShow	Ellen DeGeneres	80	Comedian and television hostess

Aufgaben
-   Bilde die Daten mit Hilfe von Arrays in deinem Programm ab.
    Tipp:
    Das erste enthält die Anzahl Follower an der richtigen Position.
    Das zweite den Accountnamen (beginnt mit @)

Berechne anschließend die folgenden Werte
- Durchschnittliche Anzahl Follower der Top Ten Liste
- Höchste Anzahl Follower
- Anzahl Follower unter 100 Mio.
- Geringste Anzahl Follower
- Anzahl Accounts mit 80-99 Mio Follower
 */
public class TwitterStats {
    public static void main(String[] args) {
        int[] follower={77,82,109,87,123,87,113,99,88,80};

        int sumFollower=0;
        int maxFollower=follower[0];
        int minFollower=follower[0];

        int lt100MioFollowerCount=0;
        int range8099FollowerCount=0;
        int i=0;
        while(i < follower.length){
            sumFollower +=follower[i];

            if(follower[i]<= minFollower){
                minFollower=follower[i];
            }

            if(follower[i] >= maxFollower){
                maxFollower=follower[i];
            }

            if(follower[i]<100){
                lt100MioFollowerCount++;
            }
            if(follower[i] >= 80 && follower[i]<=99){
                range8099FollowerCount++;
            }

            i++;
        }

        System.out.println("Durchschnittliche Anzahl Follower der Top Ten Liste: "+ (float) sumFollower/follower.length);
        System.out.println("Höchste Anzahl Follower: "+ maxFollower);
        System.out.println("Anzahl Follower unter 100 Mio.: "+ lt100MioFollowerCount);
        System.out.println("Geringste Anzahl Follower: "+ minFollower);
        System.out.println("Anzahl Accounts mit 80-99 Mio Follower: "+ range8099FollowerCount);
    }


}
