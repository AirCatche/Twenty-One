import java.util.List;
import java.util.Scanner;

public class User extends Player{
    Scanner scanner = new Scanner(System.in);
    //private List<Card> cards = new ArrayList<>();
    public User(double bank) {
        super(bank);
        System.out.println("Enter your name");
        setName(scanner.nextLine());
    }

    @Override
    public String showCards() {
        return getCards().toString() + " are " + getName() + " cards and TOTAL POINTS : " + getPoints();
    }

    @Override
    public void play(List<Card> deck) {
        while (isOver()) {

        }
    }

    @Override
    public void hit(List<Card> cardDeck) {
        putCard(cardDeck.get((cardDeck.size()-1)));                     //  + 1 card to user hand from end of deck
        setPoints(cardDeck.get((cardDeck.size()-1)).getPoint());        //  plus card points to user points
        cardDeck.remove(cardDeck.get((cardDeck.size()-1)));             //  remove last card from deck
    }

}
