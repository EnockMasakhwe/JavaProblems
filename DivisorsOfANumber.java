import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivisorsOfANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("With a random whole number, let's see all its possible divisors between 0-100 :)");

        int divisor = validInput(scanner, 1, 1000000000);

        ArrayList <Integer> listOfDivisors = new ArrayList<>();

    
        for(int i = 1;i <= 100;i++){
            if (divisor % i == 0) {
                listOfDivisors.add(i);
            }
        }
        System.out.println("Divisors: " + listOfDivisors);


        
    }

    public static int validInput(Scanner scanner, int min, int max){

        int randomNumber;
        while (true) {
            System.out.println("Enter a valid number: ");
            if (scanner.hasNextInt()) {
                randomNumber = scanner.nextInt();
                if (randomNumber >= min && randomNumber <= max) {
                    return randomNumber;
                }
            }else{    
                scanner.next();
                
            }
            System.out.println("Invalid input! Please enter any whole number.");
            
        }
    }
}