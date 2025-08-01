import java.util.Scanner;

public class EvenOddOrPrime {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Get intput
        System.out.println("Hey there, let's check out if a number is odd, even or prime:)");
        System.out.println("Enter a random number: ");
        int number = scanner.nextInt();

        //Check if odd or even
        String result = (number % 2 == 0) ? "even" : "odd" ;

        //output
        System.out.println("+=".repeat(40));
        System.out.println("The number is: " + result + ".");

        scanner.close();

    }
}