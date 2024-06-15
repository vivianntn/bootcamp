package deck;

import java.util.Random;

public class Deck {

  private static String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
  private static String[] suits = new String[]{"DIAMOND", "CLUB", "HEART", "SPADE"};
  //Player, Deck, Card, 

  public static int length = suits.length * ranks.length;
  private Card[] cards;


    public Deck(){
      this.cards = new Card[length];
      int idx = 0;
      for (String suit : suits){
        for (String rank : ranks){
          this.cards[idx++] = new Card(suit,rank);
        }
      }
    }

    public Card[] getCards(){
      return this.cards;
    }
  }

  


