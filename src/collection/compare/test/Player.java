package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private final String name;
    private final List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.draw());
    }

    public int totalSum() {
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }

        return total;
    }

    public void showHand() {
        hand.sort(null);

        System.out.println(name + "의 카드: " + hand + ", 합계: " + totalSum());
    }

    public String getName() {
        return name;
    }
}
