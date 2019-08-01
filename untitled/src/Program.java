//Write a function that recursively returns the number of vowels in a string.

public class Program {
    public static int countVowels(String str) {
        int vowelCount=0;
        for (char c: str.toCharArray()) {
            if("aeiou".indexOf(c) != -1){
                vowelCount++;
            }
        }
        return vowelCount;

    }
    public static void main(String[] args) {
        System.out.println(countVowels("How Many Vowels Are There"));

    }
}
