public class Gridtest {
// Task taken from:  https://www.w3resource.com/java-exercises/array/index.php
//    Write a Java program to print the following grid. Go to the editor
//
//    Expected Output :
//
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
//            - - - - - - - - - -
public static void main(String[] args) {
    int [][]arr = new int[10][10];
    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
            System.out.printf("%2d ", arr[i][j]);
        }
        System.out.println();
    }
}

}
