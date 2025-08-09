package kyu4;

import java.util.Map;
import java.util.HashMap;

public class ParseIntReloaded {

    public static void main(String[] args) {

        System.out.println(parseInt("two million one hundred sixty four")); // 2000164
        System.out.println(parseInt("one hundred twenty three thousand four hundred fifty six")); // 123456
        System.out.println(parseInt("seven hundred eighty three thousand nine hundred nineteen")); // 783919
        System.out.println(parseInt("ninety nine")); // 99


    }

    public static int parseInt(String numStr) {

        final Map<String, Integer> number = Map.ofEntries(
                Map.entry("zero", 0),
                Map.entry("one", 1),
                Map.entry("two", 2),
                Map.entry("three", 3),
                Map.entry("four", 4),
                Map.entry("five", 5),
                Map.entry("six", 6),
                Map.entry("seven", 7),
                Map.entry("eight", 8),
                Map.entry("nine", 9),
                Map.entry("ten", 10),
                Map.entry("eleven", 11),
                Map.entry("twelve", 12),
                Map.entry("thirteen", 13),
                Map.entry("fourteen", 14),
                Map.entry("fifteen", 15),
                Map.entry("sixteen", 16),
                Map.entry("seventeen", 17),
                Map.entry("eighteen", 18),
                Map.entry("nineteen", 19),
                Map.entry("twenty", 20),
                Map.entry("thirty", 30),
                Map.entry("forty", 40),
                Map.entry("fifty", 50),
                Map.entry("sixty", 60),
                Map.entry("seventy", 70),
                Map.entry("eighty", 80),
                Map.entry("ninety", 90),
                Map.entry("hundred", 100),
                Map.entry("thousand", 1_000),
                Map.entry("million", 1_000_000)
        );

        // Now we read the numStr and convert to integers
        String[] literal = numStr.split("[\\s-]+");
        int result = 0;
        int current = 0;

        for (String word : literal) {
            if (word.equals("hundred")) {
                current *= 100;
            } else if (word.equals("thousand")) {
                result += current * 1000;
                current = 0;
            } else if (word.equals("million")) {
                result += current * 1_000_000;
                current = 0;
            } else {
                Integer val = number.get(word);
                if (val == null) {
                    // Palavra desconhecida, ignorar
                    continue;
                }
                current += val;
            }
        }

        result += current;

        return result;
    }
}
