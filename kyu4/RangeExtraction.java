package kyu4;

public class RangeExtraction {

    public static void main(String[] args) {

        int[] a = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};

//        for(int i : a)
//            System.out.println(i);

        System.out.printf(rangeExtraction(a));

    }

    /* O array de inteiros será sempre ordenado.
    * Vou ter que usar string build para construir o retorno.
    *
    * */

    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < arr.length) {
            int start = arr[i];
            int end = start;

            while (i + 1 < arr.length && arr[i + 1] == arr[i] + 1) {
                i++;
                end = arr[i];
            }

            if (result.length() > 0) {
                result.append(",");
            }

            if (end - start >= 2) {
                result.append(start).append("-").append(end);
            } else if (end - start == 1) {
                result.append(start).append(",").append(end);
            } else {
                result.append(start);
            }

            i++;
        }

        return result.toString();
    }

}
