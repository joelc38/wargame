package test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.Card;
import main.Player;
import main.Wargame;
import static main.Wargame.isGameOver;

public class WargameTest {
    
    public Player p1;
    public Player p2;
    public Wargame w;

    @Before
    public void setup(){
        List<Card> l1 = new ArrayList<>();
        List<Card> l2 = new ArrayList<>();
        l1.add(new Card("2", 2, "Hearts"));
        l2.add(new Card("3", 3, "Hearts"));

        p1 = new Player("Gurnak the Terrible", l1);
        p2 = new Player("Dave", l2);
        w = new Wargame(p1, p2);
    }

    @Test
    public void isGameOverTest(){
        while(!p1.hasEmptyHand() && !p2.hasEmptyHand()){
            p1.getTopCard();
            p2.getTopCard();
        }
        assertTrue(isGameOver(p1, p2));
    }

    @Test
    public void playGameTest(){
        w.playGame();
        assertTrue(isGameOver(p1, p2));
    }

    @Test
    public void gotoWarTest(){
        
        List<Card> l1 = new ArrayList<>();
        List<Card> l2 = new ArrayList<>();
        l1.add(new Card("10", 10, "Hearts"));
        l1.add(new Card("3", 3, "Hearts"));
        l1.add(new Card("4", 4, "Spades"));
        l1.add(new Card("5", 5, "Clubs"));

        l2.add(new Card("10", 10, "Hearts"));
        l2.add(new Card("6", 6, "Hearts"));
        l2.add(new Card("7", 7, "Spades"));
        l2.add(new Card("8", 8, "Clubs"));


        Player p3 = new Player("p3", l1);
        Player p4 = new Player("p4", l2);
        Wargame w2 = new Wargame(p3, p4);

        w2.playGame();
        assertTrue(isGameOver(p3, p4));
    }

    @Test
    public void gotoWarDefaultWinTest(){
        
        List<Card> l1 = new ArrayList<>();
        List<Card> l2 = new ArrayList<>();
        l1.add(new Card("10", 10, "Hearts"));
        l1.add(new Card("3", 3, "Hearts"));
        l1.add(new Card("4", 4, "Spades"));
        l1.add(new Card("5", 5, "Clubs"));

        l2.add(new Card("10", 10, "Hearts"));


        Player p3 = new Player("p3", l1);
        Player p4 = new Player("p4", l2);
        Wargame w2 = new Wargame(p3, p4);

        w2.playGame();
        assertTrue(isGameOver(p3, p4));
    }
}

