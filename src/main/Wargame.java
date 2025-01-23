package main;

import java.util.ArrayList;

/**
 * Wargame
 * 
 * A class that holds the logic for the game of war and facilitates the gameplay for the players.
 * A Game of War has two players that play for cards, comparing the values of the top cards in their decks, and if
 * there is a tie, going to war!
 */
public class Wargame {
    private final Player p1;
    private final Player p2;

    public Wargame(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static boolean isGameOver(Player p1, Player p2) {
        return p1.hasEmptyHand() || p2.hasEmptyHand();
    }

    /*
     * The main function in the Class which holds most of the basic logic.
     * While both players still have cards to lose, play a round of war.
     * Flip the top card of each players' deck and compare their values to see whose is highest -> that player wins the round!
     * If the values are the same, go to War!
     * Take the top three cards off the deck of each player and compare the fourth. Compare similarly to the regular round. Go to war until there is a winner. 
     */
    public void playGame() {
        System.out.println(p1.getName() + " and " + p2.getName() + " are playing War!");

        while (!isGameOver(p1, p2)) {
            ArrayList<Card> pile = new ArrayList<>();

            Card c1 = p1.getTopCard();
            System.out.println(p1.getName() + " plays " + c1);
            Card c2 = p2.getTopCard();
            System.out.println(p2.getName() + " plays " + c2);

            pile.add(c1);
            pile.add(c2);

            int res = c1.compareTo(c2);
            if (res > 0) {
                p1.addCards(pile);
                System.out.println(p1.getName() + " wins this round!");
            } else if (res < 0) {
                p2.addCards(pile);
                System.out.println(p2.getName() + " wins this round!");
            } else {
                System.out.println("Tie! Going to war...");
                Player winner = gotoWar(pile);
                if (winner != null) {
                    winner.addCards(pile);
                }
            }

            System.out.println(p1.getName() + " has " + p1.getHandSize() + " cards, and " + p2.getName() + " has " + p2.getHandSize() + " cards");
            System.out.println();
        }

        if (!p1.hasEmptyHand()) {
            System.out.println(p1.getName() + " wins the game!");
        } else if (!p2.hasEmptyHand()) {
            System.out.println(p2.getName() + " wins the game!");
        } else {
            System.out.println("Both players have no cards, something is wrong!");
        }
    }

    /**
     * gotoWar
     * 
     * Play continuous rounds until one player wins, burn 3 cards and play the fourth. Add to the pile defined in playGame.
     * 
     * @param pile
     * @return the player who won the war.
     */
    public Player gotoWar(ArrayList<Card> pile) {
        while (true) {
            // Check if players can go to war
            if (p1.getHandSize() < 4 || p2.getHandSize() < 4) {
                System.out.println("One player cannot go to war!");
                if (p1.getHandSize() < 4) {
                    System.out.println(p2.getName() + " wins the war by default!");
                    return p2;
                } else {
                    System.out.println(p1.getName() + " wins the war by default!");
                    return p1;
                }
            }

            // Burn 3 cards (or as many as possible if fewer than 3 remain)
            for (int i = 0; i < 3; i++) {
                if (!p1.hasEmptyHand()) {
                    pile.add(p1.getTopCard());
                }
                if (!p2.hasEmptyHand()) {
                    pile.add(p2.getTopCard());
                }
            }

            // Flip the next card
            Card c1 = p1.getTopCard();
            Card c2 = p2.getTopCard();
            System.out.println(p1.getName() + " plays " + c1);
            System.out.println(p2.getName() + " plays " + c2);

            pile.add(c1);
            pile.add(c2);

            int res = c1.compareTo(c2);
            if (res > 0) {
                System.out.println(p1.getName() + " wins the war!");
                return p1;
            } else if (res < 0) {
                System.out.println(p2.getName() + " wins the war!");
                return p2;
            } else {
                System.out.println("Tie! Another round of war!");
            }
        }
    }
}
