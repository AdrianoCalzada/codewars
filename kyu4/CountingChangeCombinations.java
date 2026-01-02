package kyu4;

public class CountingChangeCombinations {

    public static void main(String[] args) {

        int a = 9993;
        int b = a * 3;

        System.out.println(b % a);

    }

    // Count the amount of possible combinations of changes, given the value of the coins

    public static int countChange(final int money, final int[] coins) {

        int counter = 0;

        // Verifying if there's coins that are in the range of the money

        for (int coin : coins) {
            if (coin > money) {
                counter++;
            }

            if (counter == coins.length) {
                return 0;
            }

        }
        return 0;
    }

}
