import java.util.Scanner;

public class EvenOddOrPrime {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey there, let's check out if a number is odd, even or prime:)");
        System.out.println("Enter a random number: ");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "even" : "odd" ;

        System.out.println("+=".repeat(40));
        System.out.println("The number is: " + result + ".");

    }
}