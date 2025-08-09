package kyu4;

public class StripComments {

    public static void main(String[] args) {

        String text = "apples, pears # and bananas\n" +
                "grapes\n" +
                "bananas !apples";

        System.out.printf("%s\n", stripComments(text, new String[]{"#", "!"}));

    }

    public static String stripComments(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            for (String symbol : commentSymbols) {
                int index = line.indexOf(symbol);
                if (index != -1) {
                    line = line.substring(0, index);
                }
            }

            result.append(line.stripTrailing());

            if (i < lines.length - 1) {
                result.append("\n");
            }
        }

        return result.toString();
    }



// Impossible to solve it with Regex, need a different approach
//    public static String stripComments(String text, String[] commentSymbols) {
//
//        commentSymbols.toString();
//
//        return text.replaceAll("\\s*"+ commentSymbols + ".*$", "");
//    }
}
