package deck;

import java.util.Arrays;

public class Card {

  private String suit;
  private String rank;

  public Card(String suit, String rank) {
    this.rank = rank;
    this.suit = suit;
  }

  public String getSuit() {
    return this.suit;
  }

  public String getRank() {
    return this.rank;
  }

  public String toString() {
    return "Card(" + "suit=" + this.suit + ", rank=" + this.rank + ")";
  }


  public static void main(String[] args) {
    Deck deck = new Deck();
    // Card[] cards = deck.getCards();
    // for (Card card: cards){
    // System.out.println(card);
    // }

    // deck.shuffle(10);
    new ShuffleManager(deck.getCards()).shuffle(20);

   for (Card card : deck.getCards()) {
      System.out.println(card);
   }
  }
}
