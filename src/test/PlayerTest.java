package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.Deck;
import main.Card;
import main.Player;

public class PlayerTest {
    
    public Deck d;
    public Player p;
    public List<Card> otherHalf;
    public Card c;

    @Before
    public void setup(){
        d = new Deck();
        p = new Player("Gurnak the Terrible", d.dealHalf());
        otherHalf = d.dealHalf();
        c  = p.getTopCard();
    }

    @Test
    public void getNameTest(){
        assertEquals("Gurnak the Terrible", p.getName());
    }

    @Test
    public void getTopCardRankTest(){
        assertEquals("2", c.getRank());
    }

    @Test
    public void getTopCardValueTest(){
        assertEquals(2, c.getValue());
    }

    @Test
    public void getTopCardSuitTest(){
        assertEquals("Hearts", c.getSuit());
    }

    @Test
    public void addCardsTest(){
        assertEquals(25, p.getHandSize());
        p.addCards(otherHalf);
        assertEquals(51, p.getHandSize());
    }

    @Test
    public void getHandSizeTest(){
        assertEquals(25, p.getHandSize());
    }

    @Test
    public void hasEmptyHandFalseTest(){
        assertFalse(p.hasEmptyHand());
    }

    @Test
    public void hasEmptyHandBadWeatherTest(){
        while(!p.hasEmptyHand()){
            p.getTopCard();
        }
        assertTrue(p.hasEmptyHand());
    }
}
