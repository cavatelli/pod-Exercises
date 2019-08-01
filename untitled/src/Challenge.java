//Create a function that takes two strings as arguments and returns the number of times the first string is found in the second string.

public class Challenge {
    public static int charCount(char c, String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(charCount('c',"cat or le chat"));
    }

}