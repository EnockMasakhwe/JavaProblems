import java.util.Arrays;
import java.util.HashSet;

public class MergeArraysWithoutDuplicates {

    public static void main(String[] args) {

        int [] array1 = {1,1,2,3,5,8,13,21,34,55,89};
        int [] array2 = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        HashSet <Integer> allElements = new HashSet<>();
        HashSet <Integer> duplicates = new HashSet<>();
        HashSet <Integer> seen = new HashSet<>();

        for (Integer i : array1) {
            allElements.add(i);
            seen.add(i);
        }

        for (Integer j : array2) {
            if (seen.contains(j)) {
                duplicates.add(j);
            }
            allElements.add(j);
        }

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        System.out.println("Duplicates: " + duplicates);
        System.out.println("Merged array: " + allElements);

    }
}