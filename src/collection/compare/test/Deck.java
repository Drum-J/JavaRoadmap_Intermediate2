package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public Deck() {
        initDeck();
        shuffle();
    }

    public List<Card> getCards() {
        return cards;
    }

    private void initDeck() {
        for (int i = 1; i < 14; i++) {
            for (Shape shape : Shape.values()) {
                cards.add(new Card(shape, i));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.removeFirst();
    }
}
