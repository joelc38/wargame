public class Wargame {
    private final Player p1;
    private final Player p2;

    public Wargame(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean isGameOver(Player p1, Player p2){
        // if p1 or p2 has no cards left, return true and end the game
        return false;
    }

    public void playGame(Player p1, Player p2){
        // core logic of war game
        // make a pile of cards for this round (list)
        // poll each players top card and add to pile
        // check which value is greater.
        // whoevers values is greater, wins the round and gets the cards
        // if they are equal call gotoWar
    }

    public void gotoWar(Player p1, Player p2){
        // same kind of thing as play game, but this time burn 3 cards (add to result pile), and poll the 4th and check
        // repeat until there is a winner
    }

    
}