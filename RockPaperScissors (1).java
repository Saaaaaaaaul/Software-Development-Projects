import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Choose: Rock (1), Paper (2), Scissors (3), or Exit (0)");
            int playerChoice;
            try {
                playerChoice = scanner.nextInt();
                if (playerChoice < 0 || playerChoice > 3) {
                    throw new Exception("Invalid choice. Please choose between 0 and 3.");
                }

                if (playerChoice == 0) {
                    System.out.println("Exiting the game. Final scores - Player: " + playerScore + ", Computer: " + computerScore);
                    break;
                }

                int computerChoice = random.nextInt(3) + 1; // Adjusting to match player's choice range (1-3)
                System.out.println("Computer chose: " + choiceToString(computerChoice));

                if (playerChoice == computerChoice) {
                    System.out.println("It's a draw!");
                } else if ((playerChoice == 1 && computerChoice == 3) ||
                           (playerChoice == 2 && computerChoice == 1) ||
                           (playerChoice == 3 && computerChoice == 2)) {
                    playerScore++;
                    System.out.println("You win this round!");
                } else {
                    computerScore++;
                    System.out.println("Computer wins this round!");
                    throw new Exception("You lost this round!");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Current scores - Player: " + playerScore + ", Computer: " + computerScore);
        }

        scanner.close();
    }

    private static String choiceToString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}
