import java.util.ArrayList;

public class Wargame {
    private final Player p1;
    private final Player p2;

    public Wargame(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    // if p1 or p2 has no cards left, return true and end the game
    public static boolean isGameOver(Player p1, Player p2){
        if(p1.hasEmptyHand() || p2.hasEmptyHand()) return true;
        return false;
    }
    // core logic of war game
    // make a pile of cards for this round (list)
    // poll each players top card and add to pile
    // check which value is greater.
    // whoevers values is greater, wins the round and gets the cards
    // if they are equal call gotoWar
    public void playGame(){  
        System.out.println(p1.getName() + " and " + p2.getName() + " are playing War!");
        
        while(!isGameOver(this.p1, this.p2)){
            ArrayList<Card> pile = new ArrayList<>();
            
            Card c1 = p1.getTopCard();
            System.out.println(p1.getName() + " plays " + c1);
            Card c2 = p2.getTopCard();
            System.out.println(p2.getName() + " plays " + c2);

            pile.add(c1);
            pile.add(c2);

            int res = c1.compareTo(c2);
            if(res > 0){
                p1.addCards(pile);
                System.out.println(p1.getName() + " wins this round!");
            }else if(res < 0){
                p2.addCards(pile);
                System.out.println(p2.getName() + " wins this round!");
            }else{
                gotoWar();
            }
        }

        if(!p1.hasEmptyHand() && p2.hasEmptyHand()){
            System.out.println(p1.getName() + " wins the game!");
        }else if(p1.hasEmptyHand() && !p2.hasEmptyHand()){
            System.out.println(p2.getName() + " wins the game!");
        }else{
            System.out.println("Both players have no cards, something is wrong!");
        }

        return;
    }

    public void gotoWar(){
        // same kind of thing as play game, but this time burn 3 cards (add to result pile), and poll the 4th and check
        // repeat until there is a winner
        return;
    }

    
}