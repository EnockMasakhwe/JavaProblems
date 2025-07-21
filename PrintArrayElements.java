import java.util.ArrayList;
import java.util.Arrays;

public class PrintArrayElements {

    public static void main(String[] args) {
        
        int [] myArray = {1,1,2,3,5,8,13,21,34,55,89};
        //Print out the initial array elements
        System.out.println("Array elements: " + Arrays.toString(myArray));
        System.out.println("Elements less than 5: ");

        //Declaration of an ArrayList elements < 5 will be added(saves memory) 
        ArrayList <Integer> secondArray = new ArrayList<>();
        //Loop through printing the elements<5 one by one and add them to the list
        for(int i = 0; i < myArray.length; i++){
            if (myArray[i] < 5) {
                System.out.println(myArray[i]);
                secondArray.add(myArray[i]);
                
            }
        }
        //Print the new arraylist
        System.out.println("Array of elements less than 5: " + secondArray);
    }
}