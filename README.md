# War Card Game 

By Joel Chamberlain 2025

A personal Project

## Explanation 
War

- Cards: Class
  - Number value.
  - Suit (Spades, Clubs, Hearts, Diamonds)
- Deck: Class
  - Hold cards.

- Two players: One human (user) and the program acting as one
  - Hold cards -> Array/ List.
  - Take turns putting top card in the middle to compare.
    - Who ever has the better card, gets the card.
    - If there is a tie, go to war.
      - Put 3 face down, then reveal the fourth, who ever has the highest, wins
      - If there is another tie, repeat until there is a winner.
    - When a player runs out of cards, they lose.
- Shuffle cards -> Randomly sort array
