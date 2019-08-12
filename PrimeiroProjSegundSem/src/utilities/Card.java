package utilities;

public class Card {

    private Naipe naipe;
    private CardValues valor;

    public Card(Naipe a,CardValues b) {
        this.naipe=a;
        this.valor=b;
    }

    @Override
    public String toString(){
        return ""+ valor + "\t" + naipe;
    }
}
