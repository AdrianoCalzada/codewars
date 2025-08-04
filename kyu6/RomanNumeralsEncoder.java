package kyu6;

/*Create a function taking a positive integer between 1 and 3999 (both included) as its parameter and
returning a string containing the Roman Numeral representation of that integer.
Modern Roman numerals are written by expressing each digit separately starting with the leftmost digit
and skipping any digit with a value of zero. There cannot be more than 3 identical symbols in a row.
* */

import java.util.Map;

public class RomanNumeralsEncoder {

    public static void main(String[] args) {
        int value = 8439283;
        System.out.println(value);

        System.out.printf("%s", solution(value));
    }

    public static String solution(int n) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                result.append(symbols[i]);
                n -= values[i];
            }
        }

        return result.toString();
    }
}
