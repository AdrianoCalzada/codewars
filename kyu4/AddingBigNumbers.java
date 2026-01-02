package kyu4;

public class AddingBigNumbers {

    // Sum of Big integers

    public static void main(String[] args) {

        String a = add("63829983432984289347293874", "90938498237058927340892374089");
        System.out.printf("%s", a);

    }

    public static String add(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carry = 0;

        // The biggest number goes first to ease the operation
        if(b.length() > a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        // Summing like handwritten

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }

        sb.reverse();

        if(sb.charAt(0) - '0' == 0){
            sb.replace(0, 1, "");
        }

        return sb.toString();
    }
}
