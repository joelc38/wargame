package test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import main.*;

public class CardTest {
    
    @Test
    public void testGetRank(){
        Card c = new Card("1", 1, "Spades");
        assertEquals("1", c.getRank());
    }

    @Test
    public void testGetSuit(){
        Card c = new Card("1", 1, "Spades");
        assertEquals("Spades", c.getSuit());
    }

    @Test
    public void testGetValue(){
        Card c = new Card("1", 1, "Spades");
        assertEquals(1, c.getValue());
    }

    @Test
    public void testCompareToGoodWeather(){
        Card c1 = new Card("1", 1, "Spades");
        Card c2 = new Card("1", 1, "Spades");

        assertEquals(0, c1.compareTo(c2));
    }

    @Test
    public void testCompareToBadWeather(){
        Card c1 = new Card("1", 1, "Spades");
        Card c2 = new Card("2", 2, "Spades");

        assertNotEquals(0, c1.compareTo(c2));
    }

    @Test
    public void testToString(){
        Card c = new Card("1", 1, "Spades");
        String result = "\n  ___ \n" +
                        " |1  | \n" + 
                        " | ♠ | \n" + 
                        " |__1| \n";

        assertEquals(result, c.toString());
    }

    @Test
    public void testTenToString(){
        Card c = new Card("10", 10, "Spades");
        String result = "\n  ___ \n" +
                        " |10 | \n" + 
                        " | ♠ | \n" + 
                        " |_10| \n";

        assertEquals(result, c.toString());
    }
}
