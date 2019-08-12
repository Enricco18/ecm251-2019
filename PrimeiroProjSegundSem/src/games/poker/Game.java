package games.poker;

import utilities.Card;
import utilities.Deck;

public class Game {
    Deck deck;
    Dealer dealer;
    Hand hand;

    public Game() {
        this.deck= new Deck();
        this.dealer = new Dealer();
    }

    public void play(){
        System.out.println("Cards no deck:"+ deck.showCards().size());
        hand =dealer.deal(deck);
        for (Card card:hand.getHand()){
            System.out.println(""+card);
        }
        System.out.println("Cartas na hand:"+ hand.getHand().size());
        hand = dealer.deal(deck);
        System.out.println("Cartas na hand:"+ hand.getHand().size());
        for (Card card:hand.getHand()){
            System.out.println(""+card);
        }
        System.out.println("Cards no deck:"+ deck.showCards().size());

    }


}
