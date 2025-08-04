package kyu5;

/*
* accepts two integer arrays of equal length
compares the value each member in one array to the corresponding member in the other
squares the absolute value difference between those two values
and returns the average of those squared absolute value difference between each member pair.

* */

public class MeanSquareError {

    public static void main(String[] args) {

        int a[] = {10, 20, 10, 2};
        int b[] = {10, 25, 5, -2};

        System.out.println(solution(a, b));

    }

    public static double solution(int[] arr1, int[] arr2) {

        double difference = 0;

        for(int i = 0; i < arr1.length; i++){

            difference += Math.pow(Math.abs(arr1[i] - arr2[i]), 2);

        }

        return difference / arr1.length;
    }
}
