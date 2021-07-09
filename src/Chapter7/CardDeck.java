package Chapter7;

import java.util.Arrays;

public class CardDeck {
    public static void main(String[] args) {
    int NUMBER_OF_CARDS = 52;
   int[] cardDeck = new int[NUMBER_OF_CARDS];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
     String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        for (int i = 0; i < cardDeck.length; i++)
            cardDeck[i] = i;

            for (int i = 0; i < cardDeck.length; i++) {
                int index = (int) (Math.random() * NUMBER_OF_CARDS);
                int temp = cardDeck[i];
                cardDeck[i] = cardDeck[index];
                cardDeck[index] = temp;
            }

            for (int i = 0; i < 4; i++) {
                String suit = suits[cardDeck[i] / 13];
                String rank = suits[cardDeck[i] % 13];
                System.out.println("Card number " + cardDeck[i] + ": " + rank + " of " + suit);
            }
        }
    }



