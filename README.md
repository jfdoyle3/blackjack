# blackjack

Create the game of Blackjack in Java.

Plan how to approach a way to create and code this game.

#### <u>1. How the Game is played:</u>

- create a card

  ​	Aces can be 1 or 11, royal cards are worth 10

- build a deck - shuffle deck

- player places bet

- deal card

- player can hit or stand 

- player continues to play until stands or going over 21 and busts

  ​     (black jack = ace and jack wins!!)

- dealer stands on 17 or better, hits on lower than 17 plays until stands or going over 21 and busts

  ​	 (black jack wins!!)

- winner with highest value wins.

- Push : Dealer ties with Player.

- issue chips betx2 if players wins.

- Player loses bet if dealer wins.

- Push: player gets bet returned.



#### <u>2. Game Objects and Methods to consider using:</u>

- Card 

  - card (value, suit): card's face value and which suit it's in.

  - .getValue : Get the face value of the card. If a royal card in play change value to 10

    

-  Deck

  - Create Deck using objCards to make 52 unique cards in Deck OR

    ​						Create a new cards  when needed keeping track for no duplicates, simulate a 52 a deck of cards.

  - .shuffle         : shuffle  deck

  - .findAce        : find if there's an Ace in play. Change Ace's value to 1 or 11 to get 21 or best possible hand on the first draw 

  - dealCards     : deals card to players

  

- Player

  - Create Player(playerName, chips)    :   Player Name, Starting chips
  - bet      : deduct initial bet from chips.  optional: (simple validation: can't under or over bet chips than current balance)
  - setChips : *private method*: set the amount of chips based on: bet, winning,  pushing.
  - getChips: get the amount of chips player currently has.

  

- Dealer/House - optional. 

  -  Creates a Deck of Cards
  - Shuffles Cards
  - Deals Cards to itself and player

  ​	

- GameRound / Table : Various names to have the a space when the game take place

  ​	

  ​	
still working on it. more info to to added.
