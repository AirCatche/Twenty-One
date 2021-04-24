import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();

        initializeDeck();

    }

    public List<Card> getDeck() {
        return cards;
    }

    private void initializeDeck() {
        for (Suit s : Suit.values()) {
            for (Face f : Face.values()) {
                this.cards.add(new Card(f.face(), f.points(), s.sign()));
            }
        }
    }
    public void shuffleDeck() {
        for (int i =0;i<100;i++) {
            Collections.shuffle(cards);
        }
    }

}















//    private String getSuit(int cardSuit) {
//        //0-3
//        return switch (cardSuit) {
//            case 0 -> Suit.CLUB.sign();
//            case 1 -> Suit.DIAMOND.sign();
//            case 2 -> Suit.SPADE.sign();
//            case 3 -> Suit.HEART.sign();
//            default -> throw new UnsupportedOperationException(String.format("Operation %s is not supported", cardSuit));
//        };
//    }
//    private String getFace(int cardTypo) {
//         //0-12;
//        return switch (cardTypo) {
//            case 0 -> CardFace.ACE.face();
//            case 1 -> CardFace.TWO.face();
//            case 2 -> CardFace.THREE.face();
//            case 3 -> CardFace.FOUR.face();
//            case 4 -> CardFace.FIVE.face();
//            case 5 -> CardFace.SIX.face();
//            case 6 -> CardFace.SEVEN.face();
//            case 7 -> CardFace.EIGHT.face();
//            case 8 -> CardFace.NINE.face();
//            case 9 -> CardFace.TEN.face();
//            case 10 -> CardFace.JACK.face();
//            case 11 -> CardFace.QUEEN.face();
//            case 12 -> CardFace.KING.face();
//            default -> throw new UnsupportedOperationException(String.format("Operation %s is not supported", cardTypo));
//        };
//    }
//}

