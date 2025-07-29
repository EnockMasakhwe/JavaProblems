import java.util.ArrayList;

public class NewListOfEvenNumbers {

    public static void main(String[] args) {
        
        int [] originalList = {1,4,9,16,25,36,49,64,81,100};

        ArrayList <Integer> newList = new ArrayList<>();
        for (int i : originalList) {
            if (i % 2 == 0) {
                newList.add(i);
            }
        }

        System.out.println("New list of even numbers: " + newList);

    }
}