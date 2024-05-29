package JavaProgrammingPractice;

//Count Vowels in a String: Develop a program that
// counts the number of vowels in a given string.
// This will help in understanding string manipulation
// and the use of loops and conditionals.

//||"y"||"u"||"i"||"o"||"a"

public class VowelsOfString {
    public static void main(String[] args) {
        System.out.println(countVowelsInString("Seyea"));
    }

    public static int countVowelsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toCharArray()[i] == 'e' ||
                    str.toCharArray()[i] == 'y' ||
                    str.toCharArray()[i] == 'u' ||
                    str.toCharArray()[i] == 'i' ||
                    str.toCharArray()[i] == 'o' ||
                    str.toCharArray()[i] == 'a') {
                count += 1;
            }
        }
        return count;
    }
}
