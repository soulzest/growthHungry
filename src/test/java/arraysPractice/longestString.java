package arraysPractice;

public class longestString {
    public static void main(String[] args) {
        String[] names = {"Sayahat", "Sa", "Say", "Saya"};
        String longestName = "";
        String shortest = names[0];
        int maxLength = names[0].length();
        int minLength = names[0].length();

        for (String each : names) {
            if (each.length() > longestName.length()) {
                longestName = each;
                maxLength = longestName.length();
            }

            if (each.length() < shortest.length()) {
                shortest = each;
                minLength = shortest.length();
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Shortest name: " + shortest);
        System.out.println("Shortest length name: " + minLength);
        System.out.println("Longest length name: " + maxLength);

        System.out.println("=======");

        //which string has max length and min length

        String longestString = "";
        String shortestString = "";
        for (String each:names){
//            if(each.length()>longestString.length()){
//                longestString = each;
//            }

            if(each.length() == minLength){
                longestString += each;
            }
        }
        System.out.println("Longest String: " + longestString);

    }
}