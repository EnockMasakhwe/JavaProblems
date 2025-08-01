import java.util.Scanner;

public class PrimeNumChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Prime Number Checker=====");
        
        while (true) {
            boolean isPrime = true;
            System.out.println("Enter a positive integer: ");
            
            try {
                int number = scanner.nextInt();

                if (number <= 1) {
                    isPrime = false;
                }else{
                    for(int i = 2;i <= number/2;i++){
                        if (number % i == 0) {
                            isPrime = false;
                            break;
                        }
            
                    }
                }

                if (isPrime) {
                    System.out.println("The number is prime.");
                }else{
                    System.out.println("The number is not prime.");
                    break;
                }

                
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid positive integer.");
                scanner.next();
            }   
        }

        scanner.close();    
        
    }
}