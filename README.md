# War Card Game 

By Joel Chamberlain 2025

A Personal Prograaming Project

## Explaination

The Game of War

- Cards: Class
  - Number value: 1-10, J, Q, K.
  - Suit (Spades, Clubs, Hearts, Diamonds)
- Deck: Class
  - Hold cards in a data structure (list)

- Two players: One human (user) and the program acting as a player
  - Hold cards -> Array/ List.
  - Take turns putting top card in the middle to compare.
    - Who ever has the better card, gets the card.
    - If there is a tie, go to war.
      - Put 3 face down, then reveal the fourth, who ever has the highest, wins
      - If there is another tie, repeat until there is a winner.
    - When a player runs out of cards, they lose.
- Shuffle cards -> Randomly sort array

## Functional Requirements

- "The Game" must:
  - Have a data structure to hold the cards in.
  - Shuffle the deck for fairness and repeatability.
  - Divide the cards between the two players.
  - Have logic to determine which card wins in what scenario (highest wins)
  - Have logic for a tie and going to war
  - Have a command line display for the user to "play"
    - Maybe hit the spacebar?
  - Have logic for when the game has been complete
    - Display who won, how many cards did the other have, and if the user wants to play again

