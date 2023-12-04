import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors extends GameConstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Rock-Paper-Scissors game!");
        System.out.println("Available options: [r]rock, [p]paper, [s]scissors");

        System.out.print("Enter your choice: ");

        String playerChoice = scanner.nextLine().toLowerCase();

        if (playerChoice.equals("s") || playerChoice.equals("p") || playerChoice.equals("r") || playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {

            if (playerChoice.equals("r") || playerChoice.equals("rock")) {
                playerChoice = getROCK();
            } else if (playerChoice.equals("p") || playerChoice.equals("paper")) {
                playerChoice = getPAPER();
            } else {
                playerChoice = getSCISSORS();
            }

            System.out.println("You chose: " + playerChoice);
        } else {
            System.out.println("Invalid choice. Please choose either [r]rock, [p]paper, or [s]scissors.");
        }

        String[] options = {"Rock", "Paper", "Scissors"};

        Random random = new Random();
        int randomIndex = random.nextInt(3);

        String computerChoice = options[randomIndex];
        System.out.println("Computer chose: " + computerChoice);

        if((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("Scissors") && computerChoice.equals("Paper")))
        {
            System.out.println("YOU WIN!!! ");
        } else if ((playerChoice.equals("Rock") && computerChoice.equals("Paper")) ||
                   (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) ||
                    (playerChoice.equals("Scissors") && computerChoice.equals("Rock")))
        {
            System.out.println("You lose this game! ");
        } else {
            System.out.println("This game was a draw! ");
        }
    }
}
