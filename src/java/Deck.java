import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
Deck

A class for holding all of the logic behind the deck of cards.
Creating and Shuffling the deck of cards for the players to begin playing the game
 */
public class Deck {
    private final List<Card> cards;
    private final HashMap<String, Integer> values = new HashMap<>();
    private int currentIndex;

    /**
     * Basic constructor for the Deck of cards
     * Adds only the ranks and suits, translates the values of the ranks
     */
    public Deck(){
        this.cards = new ArrayList<>();
        this.currentIndex = 0;


        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(String rank : ranks){
            values.put(rank, cardValue(rank));
        }

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, values.get(rank), suit));
            }
        }
    }

    public int cardValue(String value){
        int res = 0;
        try{
            res = Integer.parseInt(value);
        } catch (NumberFormatException e){
            switch (value) {
                case "J":
                    res = 11;
                    break;
                case "Q":
                    res = 12;
                    break;
                case "K":
                    res = 13;
                    break;
                case "A":
                    res = 14;
                    break;
                default:
                    break;
            }
        }
        return res;
    }

    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    public List<Card> dealHalf(){
        int deckSize = cards.size();
        int halfSize = deckSize / 2;

        // Ensure we're not overstepping the bounds of the deck
        if (currentIndex + halfSize > deckSize) {
            throw new IllegalStateException("No more cards to deal!");
        }

        // Get the sublist for the half
        List<Card> half = new ArrayList<>(cards.subList(currentIndex, currentIndex + halfSize));
        
        // Advance the index
        currentIndex += halfSize;

        return half;
    }

    public List<Card> getCards(){
        return this.cards;
    }
}