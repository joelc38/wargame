
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Player {
    private final String name;
    private final Queue<Card> cards;

    public Player(String name, List<Card> cards){
        this.name = name;
        this.cards = new LinkedList<>(cards);
    }

}