package kyu6;

public class BitCounting {
    public static void main(String[] args) {

        int number = 1234;

        System.out.println(countBits(number));

    }

    public static int countBits(int n) {
        int count = 0;
        while(n != 0){
            if(n % 2 == 1){
                count++;
            }
            n /= 2;
        }
        return count;
    }
}
