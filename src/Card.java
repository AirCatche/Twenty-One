public class Card {
    private final String face;
    private final int point;
    private final String suit;

    public Card(String cardFace, int point, String suit) {
        this.face = cardFace;
        this.suit = suit;
        this.point = point;
    }

    public String getFace() {
        return face;
    }

    public int getPoint() {
        return point;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return " " +
                face +
                 suit;
    }
}
