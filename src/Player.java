import java.util.ArrayList;
import java.util.List;


public abstract class Player {
    private String name;
    private int points;
    private double balance;
    private boolean isOver = false;
    private List<Card> cards;
    public Player(double bank) {
        this.balance = bank;
        newDealing();
    }

    public abstract void play (List<Card> deck);
    public abstract void hit(List<Card> deck);
    public abstract String showCards();


    public void newDealing() {
        this.isOver = false;
        this.cards = new ArrayList<>();
        this.points = 0;
    }
    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public double getBalance() {
        return balance;
    }
    public String getInfo() {
        return "Name: " + name + " with balance " + this.balance;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void putCard(Card card) {
        this.cards.add(card);
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOver() {
        return isOver;
    }

    public void over() {
        isOver = true;
    }

    public boolean isLose() {
        if (getPoints() > 21) {
            return true;
        } else {
            return false;
        }
    }



    public void printWinner() {
        if (getPoints() <= 21) {
            System.out.println(" --- " + getName() + " WIN ALL $$$$$$$$$");
        } else {
            System.out.println(getName() + " OVER 21");
        }
    }
    public void printLoser() {
        System.out.println(" --- " + getName() + " lose, " + getPoints() + " is over 21");
    }



}
