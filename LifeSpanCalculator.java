import java.util.Scanner;

public class LifeSpanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //constant
        final int maxAge = 100;

        System.out.println("Hey there, let's see how much longer you have to live before clocking 100:)");
        System.out.println("Enter your full name: ");
        String fullname = scanner.nextLine().trim();

        System.out.println("Enter your current age: ");
        int currentAge = scanner.nextInt();

        int remainingYears = maxAge - currentAge;

        System.out.println("=+".repeat(40));
        if(currentAge<=0){
            System.out.println("Incorrect details! Please enter correct age.");
        }else if(currentAge >= maxAge){

            System.out.println("Hello " + fullname + ", we are grateful for your " + currentAge + " years of life.");

        }else{

            System.out.println("Hello " + fullname + ", you have " + remainingYears + " years remaining before you are a century old:)");
        }
        scanner.close();
    }
}