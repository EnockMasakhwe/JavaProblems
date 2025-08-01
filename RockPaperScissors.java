import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String [] allChoices = {"rock","paper","scissors"};
        String randomChoice = allChoices[random.nextInt(3)];

        System.out.println("Hey there, let's play Rock Paper Scissors!");
        String userChoice = "";

        while (true) {
            System.out.println("\nDo you choose Rock, Paper or Scissors? ");
            try {
                userChoice = scanner.nextLine().toLowerCase();

                if ((!userChoice.equals("rock")) && (!userChoice.equals("paper")) && (!userChoice.equals("scissors"))) {
                    System.out.println("Invalid choice! Please enter rock, paper or scissors.");
                    continue;
                }

                break;
                
            } catch (Exception e) {
                System.out.println("Invalid input! Kindly enter a string.");
                scanner.nextLine();
            }
            
        }

        System.out.println("=+".repeat(40));
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer choice: " + randomChoice);

        if (userChoice.equals(randomChoice)) {
            System.out.println("It's a tie!");
        }else if((userChoice.equals("rock") && randomChoice.equals("scissors")) ||
                (userChoice.equals("paper") && randomChoice.equals("rock")) ||
                (userChoice.equals("scissors") && randomChoice.equals("paper"))){
                    System.out.println("Congratulations! You win.");

        }else{
            System.out.println("Oups! You lost.");
        }

        scanner.close();

    }

    
    
    
}