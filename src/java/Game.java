public class Game {
    public static void main(String[] args){
        Deck d = new Deck();
        d.shuffle();

        Player p1 = new Player("George", d.dealHalf());
        Player p2 = new Player("Alex", d.dealHalf());

        Wargame game = new Wargame(p1, p2);
        
        game.playGame();
    }
}