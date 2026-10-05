import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String correctName = "Oskari";
        String answer = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Please, guess my name");
        answer = in.nextLine();
        if (answer.equals(correctName)) {
            System.out.println("Congratulations!");
        }
    }
}
