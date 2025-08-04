package kyu5;

public class RgbToHex {

        public static void main(String[] args) {

            String a;

            a = rgb(-20, 275, 125);
            System.out.println(a);

        }
        public static String rgb(int r, int g, int b) {
            r = Math.min(255, Math.max(0, r));
            g = Math.min(255, Math.max(0, g));
            b = Math.min(255, Math.max(0, b));

            return String.format("%02X%02X%02X", r, g, b);
        }
}
