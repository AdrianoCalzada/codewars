package kyu5;

/*Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters then it should replace the
missing second character of the final pair with an underscore ('_').
 */

public class SplitStrings {

    public static void main(String[] args) {
        String a = "abcdasdq";
        String c = "Put4ri4";
        String[] b = solution(a);
        String[] d = solution(c);

        for(String s : d) System.out.println(s);
    }

    public static String[] solution(String s) {
        if(s.isEmpty()) return new String[0];
        else {
            String padded = s.length() % 2 == 0 ? s : s + "_";
            return padded.split("(?<=\\G..)");
        }
    }
}
