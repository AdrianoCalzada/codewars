package kyu5;

public class MDC {

    public static void main(String[] args){

        int[] a = {10, 40, 4};

        long b = mdc(a[0], a[1]);
        long[][] lst = new long[][] { {1, 2}, {1, 3}, {10, 40} };
        long[][] lst2 = new long[][] { {69, 130}, {87, 1310}, {30, 40} };

        System.out.println(convertFrac(lst2));

    }

    // Greatest common divisor and least common multiple

    public static String convertFrac(long[][] lst) {

        if(lst == null || lst.length == 0) return "";

        long[] denominators = new long[lst.length];
        StringBuilder sb = new StringBuilder();
        long mmc;

        // Verify if the list is irreducible and, if so, correct it
        for(int i = 0; i<lst.length; i++){

            long numerador = lst[i][0];
            long denominador = lst[i][1];

            long divisor = mdc((int) numerador, (int) denominador);

            if(divisor > 1){
                lst[i][0] = numerador / divisor;
                lst[i][1] = denominador / divisor;
            }

        }

        // Create a list of denominators
        for(int i = 0; i < lst.length; i++) {
           denominators[i] = lst[i][1];
        }

        mmc = mmcSeveral(denominators);

        // Apply the desired conditions
        for(int i = 0; i < lst.length; i++) {
            lst[i][0] *=  mmc / lst[i][1];
            lst[i][1] =  mmc;

            sb.append("(").append(lst[i][0]).append(",").append(lst[i][1]).append(")");
        }

        return sb.toString();
    }

    public static long mdc(long a, long b) {
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static long mmcSeveral(long[] a){

        long result = a[0];

        for(int i = 1; i < a.length; i++){
            result = mmc(result, a[i]);
        }
        return result;
    }

    public static long mmc(long a, long b){
        return a * (b / mdc(a, b));
    }
}
