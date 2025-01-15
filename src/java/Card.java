
/*
Card

A class for holding all logic that will deal with cards
Mostly getters and setters, but will also hold the most important part:
comparing the ranks of the cards
*/
public class Card {
    private final String rank;
    private final String suit;

    public Card(String value, String suit){
        this.rank = value;
        this.suit = suit;
    }

    public String getValue(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    // TODO 
    public int compareTo(Card other){
        return 0;
    }

    @Override
    public String toString(){
        return this.rank + " of " + this.suit;
    }
}