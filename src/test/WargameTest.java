package test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.Card;
import main.Deck;
import main.Player;
import main.Wargame;

public class WargameTest {

    public Deck d;
    public Player p1;
    public Player p2;
    public Wargame w;

    @Before
    public void setup(){
        Deck d = new Deck();
        d.shuffle();
        Player p1 = new Player("George", d.dealHalf());
        Player p2 = new Player("Alex", d.dealHalf());
        Wargame game = new Wargame(p1, p2);
        game.playGame();
    }

    @Test
    public void testtest(){
        assertEqual(p1.getName(), "George");
    }
       
}
