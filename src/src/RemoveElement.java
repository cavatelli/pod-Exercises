import java.util.Arrays;

public class RemoveElement {
    //Exercise taken from: https://www.w3resource.com/java-exercises/array/index.php

    //7. Write a Java program to remove a specific element from an array.

    public static void main(String[] args) {
        int[] myArray = {4, 8, 15, 16, 23, 42, 49};

        System.out.println("Original Array : " + Arrays.toString(myArray));

        int removeIndex = 1;

        for (int i = removeIndex; i < myArray.length - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
        System.out.println("After removing the second element: " + Arrays.toString(myArray));
    }
}
