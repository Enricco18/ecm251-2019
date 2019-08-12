package utilities;

import utilities.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> cards;


    public Deck() {
        cards = new ArrayList<Card>();
        for (Naipe naipe : Naipe.values()) {
            for (CardValues values : CardValues.values()) {
                cards.add(new Card(naipe, values));
            }

        }
    }

    public List<Card> showCards() {
        return cards;
    }

    public List<Card> getCards(int amountOfCards) {
        List<Card> cardsToReturn= new ArrayList<>();
        for (int i=0;i<amountOfCards;i++){
            cardsToReturn.add(cards.remove(new Random().nextInt(cards.size())));
        }
        return cardsToReturn;
    }

}