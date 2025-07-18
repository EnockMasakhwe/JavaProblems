import java.util.Scanner;

public class AudiDecisionTree {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.println("Hey " + name + ", do you have own an Audi? \n1. Yes \n2. No");
        int ownershipResponse = scanner.nextInt();

        if(ownershipResponse == 1){
            System.out.println("Wow, congratulations for owning an Audi!");
        }else if(ownershipResponse == 2){
            System.out.println("Would you like to own one? \n1. Yes \n2. No");
            int interestResponse = scanner.nextInt();
            if (interestResponse == 1) {
                System.out.println("Do you have money? \n1. Yes \n2. No \n3. Not for Audi");
                int moneyResponse = scanner.nextInt();
                if (moneyResponse == 1) {
                    System.out.println("Go buy yourself an Audi:)");
                }else if(moneyResponse == 2){
                    System.out.println("Do you have a job? \n1. Yes \n2. No");
                    int jobResponse = scanner.nextInt();
                    if (jobResponse == 1) {
                        System.out.println("Do they pay you? \n1. Yes \n2. No");
                        int payResponse = scanner.nextInt();
                        if (payResponse == 1) {
                            System.out.println("Then go buy an Audi:)");
                        }else if (payResponse == 2) {
                            System.out.println("Do you have possessions? \n1. Yes \n2. No");
                            int possessResponse = scanner.nextInt();
                            if (possessResponse == 1) {
                                System.out.println("Sell them and buy an Audi:)");
                            }else if (possessResponse == 2) {
                                System.out.println("Do you have a kidney? \n1. Yes \n2. No");
                                int kidneyResponse = scanner.nextInt();
                                if (kidneyResponse == 1) {
                                    System.out.println("Then sell it for a handsome amount and buy an Audi:)");
                                }else if(kidneyResponse == 2){
                                    System.out.println("You're a liar!");
                                }else{
                                    System.out.println("Enter a valid response (1/2): ");
                                }
                            }else{
                                System.out.println("Enter a valid response (1/2): ");
                            }
                        }else{
                            System.out.println("Enter a valid response (1/2): ");
                        }
                    }else if(jobResponse == 2){
                        System.out.println("Do you have possessions? \n1. Yes \n2. No");
                    }else{
                        System.out.println("Enter a valid response (1/2): ");
                    }
                }else if(moneyResponse == 3){
                    System.out.println("Ouch, that's blasphemy!");
                }else{
                    System.out.println("Enter a valid response (1/2/3): ");
                }
            } else if(interestResponse == 2) {
                System.out.println("Oups! Thank you for participating.");
            }else{
                System.out.println("Enter a valid response (1/2): ");
            }
        }else{
            System.out.println("Enter a valid response (1/2): ");
        }

        scanner.close();

    }
}