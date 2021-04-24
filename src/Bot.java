import java.util.List;
import java.util.Random;

public class Bot extends Player {
    private String[] names = {"VALERA", "MISHKA", "MA}{1MKA", "VOVABOSS", "XXX" };

    public Bot(double bank) {
        super(bank);
        int idx = new Random().nextInt(names.length);
        setName(names[idx]);
    }

    @Override
    public String showCards() {
        if (getCards().size() < 2) {
            return getCards().toString() + " is " + getName() + " card + one face down";
        } else {
            return getCards().toString() + " are " + getName() + " cards" + " with total points " + getPoints();
        }
    }
    @Override
    public void play (List<Card> deck) {
        while (!isOver()) {
            if (getPoints() <= 17) {
                hit(deck);
                if (getPoints() > 21) {
                    over();
                }
            }
            if (getPoints() > 17 && getPoints() <= 21) {
                over();
            }
        }
    }

    @Override
    public void hit(List<Card> cardDeck) {

        putCard(cardDeck.get((cardDeck.size()-1)));
        setPoints(cardDeck.get((cardDeck.size()-1)).getPoint());
        cardDeck.remove(cardDeck.get((cardDeck.size()-1)));

    }

    }

