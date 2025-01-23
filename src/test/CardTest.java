package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.*;

public class CardTest {
    
    @Test
    public void testCard(){
        Card c = new Card("1", 1, "Spades");
        assertEquals(c, c);
    }
}
