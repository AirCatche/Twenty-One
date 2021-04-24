import java.util.*;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        System.out.println("Press number for: \n" +
                "0 - Exit\n" +
                "1 - Start new game");
        startMenu();
    }

    public static void startMenu() {
        boolean isFinished = false;
        while(!isFinished) {
            int action = scanner.nextInt();
            switch (action) {
                case 0 -> isFinished = true;
                case 1 -> {
                    new Game();
                    isFinished = true;
                }
            }
        }
    }
}
