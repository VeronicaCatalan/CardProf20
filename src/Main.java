import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Deck m = new Deck();//crea mazo
        m.shuffle();// baraja

        System.out.println(m);
        //extrae 2cartas
        Card c1 = m.extractCard();
        Card c2 = m.extractCard();
        System.out.println(c1);
        System.out.println(c2);

        m.writeToFile("cards.csv");
        Deck d2 = Deck.readFromFile("cards.csv");
        System.out.println(d2);
    }
}