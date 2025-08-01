import java.util.Scanner;

public class PrimeNumChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Prime Number Checker=====");
        int number = -1;
        
        while (true) {
        
            System.out.println("Enter a positive integer: ");
            
            try {
                number = scanner.nextInt();

                if (number > 0) {
                    break;
                }else{
                    System.out.println("Please enter a number greater than 0.");
                }
   
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid positive integer.");
                scanner.next();
            }
        }

        boolean isPrime = true;
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
                }


        scanner.close();    
        
    }
}