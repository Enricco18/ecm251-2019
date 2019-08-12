package games.poker;

import utilities.Card;

import java.util.List;

public class Hand {
    private List<Card> cartas;

    public Hand(List<Card> cartas) {
        this.cartas = cartas;
    }

    public List<Card> getHand() {
        return cartas;
    }

}
