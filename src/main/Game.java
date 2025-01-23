package main;

public class Game {
    /**
     * Runner code for the WarGame, mainly setup
     * @param args
     */
    public static void main(String[] args){
        // Create the Deck for the game and shuffle it
        Deck d = new Deck();
        d.shuffle();
        // Create 2 players for the game, and deal them both half of the shuffled Deck
        Player p1 = new Player("George", d.dealHalf());
        Player p2 = new Player("Alex", d.dealHalf());
        // Create a new Wargame between these players
        Wargame game = new Wargame(p1, p2);
        // Simulate
        game.playGame();
    }
}