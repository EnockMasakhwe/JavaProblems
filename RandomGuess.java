import java.util.Random;
import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hey there, welcome to this Number Guessing game!");
        System.out.println("I am thinking of a number between 1 and 100.");

        int randomNumber = random.nextInt(100) + 1;
        int userGuesses = 0;

        while (true) {
            System.out.println("Enter your guess: ");
            
            try {
                int guess = scanner.nextInt();
                userGuesses++;

                if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                }else if(guess > randomNumber){
                    System.out.println("Too high! Try again.");
                }else{
                    System.out.println("Congratulations! It took you " + userGuesses + " guesses to get the correct number.");

                    break;
                }
                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid input.");
                scanner.next();
            }

            
        }

        scanner.close();
    }

}