import java.util.Scanner;

public class BinToDec {

    public static void main(String[] args) {

        System.out.println("Digite o número binário: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        double result = binToDecimalImproved(str);

        System.out.printf("O valor decimal é %.2f\n", result);

        sc.close();

    }


    public static double binToDecimal(String bin) {

        double decimal = 0;
        int position = bin.length() - 1;

        for (int i = 0; i < bin.length(); i++) {

            double binary = bin.charAt(i) - '0';

            decimal += binary * Math.pow(2, position);

            position--;
        }

        return decimal;

    }

    public static double binToDecimal(String bin, int exponent) {

        double decimal = 0;

        for(int i = 0; i < bin.length(); i++){

            double binary = bin.charAt(i) - '0';

            decimal += binary * Math.pow(2, exponent);

            exponent--;
        }

        return decimal;

    }



    public static double binToDecimalImproved(String bin) {

        int index = bin.contains(".") ? bin.indexOf(".") : 0;

        if(index == 0){
            return binToDecimal(bin);
        }

        return binToDecimal(bin.substring(0, index)) +
                binToDecimal(bin.substring(index + 1), -1);

    }
}
