package collection.compare.test;

public class CardGameMain {
    public static void main(String[] args) {
        //코드 작성
        Deck deck = new Deck();

        Player player1 = new Player("승호");
        Player player2 = new Player("DrumJ");

        for (int i = 0; i < 5; i++) {
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        Player winner = getWinner(player1, player2);
        if (winner != null) {
            System.out.println(winner.getName() + "의 승리");
        } else {
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2) {
        int compare = Integer.compare(player1.totalSum(), player2.totalSum());

        if (compare > 0) {
            return player1;
        } else if (compare < 0) {
            return player2;
        } else {
            return null;
        }
    }
}
