package stringPractice;

public class stringsDuplicate {
  /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }
        }

        return result;
    }

}
