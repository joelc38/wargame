# War Card Game 

```
 ___   ___   ___   ___   ___   ___   ___   ___   ___   ___   ___   ___   ___
|1  | |2  | |3  | |4  | |5  | |6  | |7  | |8  | |9  | |10 | |J  | |Q  | |K  |
| ♥ | | ♦ | | ♠ | | ♣ | | ♥ | | ♦ | | ♠ | | ♣ | | ♥ | | ♦ | | ♠ | | ♣ | | ♥ |
|__1| |__2| |__3| |__4| |__5| |__6| |__7| |__8| |__9| |_10| |__J| |__Q| |__K|
```

By Joel Chamberlain 2025

A Personal Prograaming Project

Inspired by: https://www.youtube.com/watch?v=zX4u3SudI-0&t=715s
Card art inspired by: https://inventwithpython.com/bigbookpython/project4.html

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

## Specification

- Implementation in Java

### Classes

- Game
  - One game per running of the program
  - One deck per game
  - This can hold the state of the game as well
    - Whether the game is still going or is over
- Card
  - Number value: 1-10, J, Q, K.
  - Suit (Spades, Clubs, Hearts, Diamonds)
- Deck
  - Hold cards in a data structure (list) or stack
  - This will be where the players get their cards from initially
- Hand
  - Another list of cards that will be dealt to the user by a setup method, taking from the deck
  - Cannot be over a certain value, since we need both hands to be initially equally sized

### Methods

- Display Screen
  - A method for displaying what the current screen looks like
  - May start out initially just card values printed, but may be upgraded to have ascii art for cards
  - Multiple screens
    - Startup
    - Exit/ Play again
    - Cards being shuffled
    - Cards being dealt
    - Cards being flipped
      - Displaying result of the "fight" comparison
      - Going to war!
- Shuffle Deck
  - A method for shuffling the deck after it has been created.
  - Will be called by the game (or runner)
- Deal Hand
  - A method for taking the now shuffled deck and handing out half of the cards to each player
- Flipping Cards
  - Logic for taking those two top cards and comparing them
  - Determine if we need to go to war
- Go to war
- Setup?
  - Maybe we could have a method that will do the following
    - Create Deck
    - Shuffle Deck
    - Deal Hand

