import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CustomPrintArrayElements {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //get array length
        System.out.println("Enter the array length: ");
        int length = scanner.nextInt();

        //array declaration
        int [] myArray = new int[length];
        
        //get elements and add them to the array
        System.out.println("Enter " + length + " elements to be stored in the array: ");
        for (int i = 0 ;i < length;i++ ) {
            myArray[i] = scanner.nextInt();
        }

        //output the initial array
        System.out.println("Array: " + Arrays.toString(myArray));

        
        System.out.println("Elements less than five: ");
        //declared empty arraylist
        ArrayList <Integer> secondArray = new ArrayList<>();

        //check for elements less than 5, print one by one and add them in the arraylist
        for (int i = 0;i < length;i++) {
            if (myArray[i] < 5) {
                System.out.println(myArray[i]);
                secondArray.add(myArray[i]);
            }
            

        }

        //output the new array
        System.out.println("New array: " + secondArray);

        scanner.close();
    }
}