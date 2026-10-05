import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String correctName = "Oskari";
        String answer = "";
        Scanner in = new Scanner(System.in);
        boolean playing = true;
        int guesses = 0;
        int nameStart = 0;
        int nameEnd = 1;
        while (!answer.equals(correctName) && playing) {
            System.out.println("Please, guess my name");
            answer = in.nextLine();
            if (answer.equals(correctName)) {
                guesses += 1;
                System.out.println("Congratulations!");
                System.out.println("Guesses: " + guesses);
            } else {
                guesses += 1;
                System.out.println("Do you want to quit (y/n) ?");
                String answer2 = in.nextLine();
                if (answer2.equals("n")) {
                    playing = true;
                    if (guesses > 1) {
                        System.out.println("Hint: " + correctName.substring(nameStart, nameEnd));
                        if (nameEnd < correctName.length()) {
                            nameEnd += 1;
                        }
                    }
                } else if (answer2.equals("y")) {
                    playing = false;
                    System.out.println("Game over. You guessed " + guesses + " times but didn't get the correct name.");
                }
            }
        }
    }
}
