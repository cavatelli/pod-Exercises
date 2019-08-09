import java.util.Scanner;
//Challenge taken from CodingBat.
public class MakeBricks {
    public static int userInput;

    public static boolean makeBrick(int small, int large){
        if(userInput % small == 0 && userInput % large == 0){
            System.out.println("You can make that with bricks");
        } else{
            System.out.println("You can't make that with bricks");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to see if it's buildable by bricks");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        makeBrick(2,5);
    }
}
