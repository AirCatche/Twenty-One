
import java.util.Scanner;

public class Game {
    private int round = 1;
    private final Scanner scanner = new Scanner(System.in);
    private Deck deck;
    private Player user;
    private Player bot;

    public Game() {

        start();
    }

    private void start() {
        this.bot = new Bot(5000);
        this.user = new User(5000);

        System.out.println(user.getName() + " VS " + bot.getName());

        printFirstMenu();

    }

    private void printFirstMenu() {
        newRound();
        System.out.println("Press number for: \n" +
                "0 - Exit game\n" +
                "1 - dealing");

        actFirstMenu();

    }

    private void actFirstMenu() {
        boolean isDone = false;
        while (!isDone) {
            int action = scanner.nextInt();
            switch (action) {
                case 0 -> {
                    isDone = true;
                    Main.menu();
                }
                case 1 -> {
                    isDone = true;
                    dealing();
                }
                default -> isDone = false;
            }
        }
        printUserAction();
    }

    private void printUserAction() {
        System.out.println("Choose option\n" +
                "0 - over\n" +
                "1 - hit\n");

        userAction();
    }

    private void userAction() {
        boolean isDone = false;
        while (!isDone) {
            int action = scanner.nextInt();
            switch (action) {
                case 0 -> {
                    isDone = true;
                    bot.play(deck.getDeck());
                    user.over();
                    showOff();
                    defineWinner();
                }
                case 1 -> {
                    user.hit(deck.getDeck());
                    if (user.isLose()) {
                        user.over();
                        bot.over();
                        showOff();
                        defineWinner();
                        isDone = true;
                        break;
                    }
                    if (bot.getPoints() <= 17) {
                        bot.hit(deck.getDeck());
                        if (bot.isLose()) {
                            user.over();
                            bot.over();
                            showOff();
                            defineWinner();
                            isDone = true;
                            break;
                        }
                    }
                    System.out.println(user.showCards());
                    isDone = true;
                    printUserAction();
                }
                default -> isDone = false;
            }
        }
        printFirstMenu();
    }

    private void newRound() {
        System.out.println( "=======================\n" +
                            "======= ROUND "+ round + " =======\n" +
                            "=======================\n");

        user.newDealing();
        bot.newDealing();
        deck = new Deck();
        round ++;
    }
    private void showOff () {
        if (bot.isOver() && user.isOver()) {
            System.out.println( bot.showCards() + " \n" +
                                user.showCards());
        }
    }
    private void defineWinner () {
        if (user.getPoints() >= bot.getPoints()) {
            user.printWinner();
            if (user.getPoints() > 21) {
                bot.printWinner();
            }
        } else {
            if (bot.getPoints() > 21) {
                bot.printLoser();
                user.printWinner();

            } else {
                bot.printWinner();
            }
        }

    }
    private void dealing() {
        deck.shuffleDeck();
        bot.hit(deck.getDeck());
        System.out.println(bot.showCards());
        user.hit(deck.getDeck());
        bot.hit(deck.getDeck());
        user.hit(deck.getDeck());
        System.out.println(user.showCards());
    }
}


