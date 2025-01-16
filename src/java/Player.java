
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Player
 * 
 * A class that will hold the logic for the one player of the game
 */
public class Player {
    private final String name;
    private final Queue<Card> cards;

    public Player(String name, List<Card> cards){
        this.name = name;
        this.cards = new LinkedList<>(cards);
    }

    public String getName(){
        return name;
    }

    public Card getTopCard(){
        return cards.poll();
    }

    public boolean hasEmptyHand(){
        return cards.isEmpty();
    }

}