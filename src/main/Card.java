package main;
import java.util.HashMap;

/*
Card

A class for holding all logic that will deal with cards
Mostly getters and setters, but will also hold the most important part:
comparing the ranks of the cards
*/
public class Card {
    private final String rank;
    private final String suit;
    private final int value;

    /**
     * Default constructor for the Card class
     * @param rank the String rank for the Card 2-A
     * @param value the integer value associated with that card 2-14
     * @param suit the suit associated with that card: Hearts, Diamonds, Spades, Clubs
     */
    public Card(String rank, int value, String suit){
        this.rank = rank;
        this.value = value;
        this.suit = suit;
    }

    public String getRank(){
        return this.rank;
    }

    public String getSuit(){
        return this.suit;
    }

    public int getValue(){
        return this.value;
    }

    /**
     * If this.value < other.value, return int < 0
     * this.value > other.value, return int > 0
     * this.value == other.value, return 0
     * @param other
     * @return the integer value of the calculation (as above)
     */
    public int compareTo(Card other){
        return Integer.compare(this.value, other.value);
    }

    /**
     * Print the representation of the card in the following style:
     *   ___  
        |1  | 
        | ♥ |
        |__1|
     */
    @Override
    public String toString(){
        HashMap<String, String> suits = new HashMap<>();
        suits.put("Hearts", "♥");
        suits.put("Diamonds", "♦");
        suits.put("Spades", "♠");
        suits.put("Clubs", "♣");

        String result;
        if(this.value == 10){
            result = "\n  ___ \n" +
                    " |" + this.rank +" | \n" + 
                    " | " + suits.get(this.suit) + " | \n" + 
                    " |_" + this.rank + "| \n";
        }else{
            result = "\n  ___ \n" +
                    " |" + this.rank +"  | \n" + 
                    " | " + suits.get(this.suit) + " | \n" + 
                    " |__" + this.rank + "| \n";
        }
        return result; 
    }
}