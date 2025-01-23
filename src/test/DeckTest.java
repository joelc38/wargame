package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.*;
import main.Deck;

public class DeckTest {
    
    @Test
    public void cardValueJTest(){
        Deck d = new Deck();
        String value = "J";
        assertEquals(11, d.cardValue(value));
    }

    @Test
    public void cardValueQTest(){
        Deck d = new Deck();
        String value = "Q";
        assertEquals(12, d.cardValue(value));
    }

    @Test
    public void cardValueKTest(){
        Deck d = new Deck();
        String value = "K";
        assertEquals(13, d.cardValue(value));
    }

    @Test
    public void cardValueATest(){
        Deck d = new Deck();
        String value = "A";
        assertEquals(14, d.cardValue(value));
    }

    @Test
    public void cardValueNumericTest(){
        Deck d = new Deck();
        String value = "9";
        assertEquals(9, d.cardValue(value));
    }

    @Test
    public void shuffleTest(){
        Deck d1 = new Deck();
        Deck d2 = new Deck();
        
        assertEquals(d1.getCards().remove(0).getRank(), d2.getCards().remove(0).getRank());

        d1.shuffle();

        assertNotEquals(d1.getCards().remove(0).getRank(), d2.getCards().remove(0).getRank());
    }

}
