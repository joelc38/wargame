import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Deck

A class for holding all of the logic behind the deck of cards.
Creating and Shuffling the deck of cards for the players to begin playing the game
 */
public class Deck {
    private final List<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();

        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public List<Card> dealHalf(){
        return new ArrayList<>(cards.subList(0, cards.size() / 2));
    }

    public List<Card> getCards(){
        return this.cards;
    }
}