import java.util.Scanner;

public class AudiDecisionTree {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Hey " + name + ", do you have own an Audi? \n1. Yes \n2. No");
        int ownershipResponse = getValidInput(scanner, 1, 2);

        if(ownershipResponse == 1){
            System.out.println("Wow, congratulations for owning an Audi!");
        }else{
            System.out.println("Would you like to own one? \n1. Yes \n2. No");
            int interestResponse = getValidInput(scanner, 1, 2);
            if (interestResponse == 1) {
                System.out.println("Do you have money? \n1. Yes \n2. No \n3. Not for Audi");
                int moneyResponse = getValidInput(scanner, 1, 3);
                if (moneyResponse == 1) {
                    System.out.println("Go buy yourself an Audi:)");
                }else if(moneyResponse == 2){
                    System.out.println("Do you have a job? \n1. Yes \n2. No");
                    int jobResponse = getValidInput(scanner, 1, 2);
                    if (jobResponse == 1) {
                        System.out.println("Do they pay you? \n1. Yes \n2. No");
                        int payResponse = getValidInput(scanner, 1, 2);
                        if (payResponse == 1) {
                            System.out.println("Then go buy an Audi:)");
                        }else{
                            possessions(scanner);
                        }
                    }else{
                        possessions(scanner);
                    }
                }else{
                    System.out.println("Ouch, that's blasphemy!");
                }
            }else{
                System.out.println("Oups! Thank you for participating.");
            }
        }


        scanner.close();


    }

    public static int getValidInput(Scanner scanner, int min, int max){

        int input;
        while(true){
            System.out.println("Enter your choice: ");

            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            }else{
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
        }
    }

    public static void possessions(Scanner scanner){
        System.out.println("Do you have possessions? \n1. Yes \n2. No ");
        int possessionResponse = getValidInput(scanner, 1, 2);

        if (possessionResponse == 1) {
            System.out.println("Then sell them and buy yourself an Audi:)");
        }else{
            System.out.println("Do you have a kidney? \n1. Yes \n2. No");
            int kidneyResponse = getValidInput(scanner, 1, 2);

            if (kidneyResponse == 1) {
                System.out.println("Sell it and buy an Audi:)");
            }else{
                System.out.println("You're a liar! Sell it and get yourself the latest Audi:)");
            }
        }
    
    }

}