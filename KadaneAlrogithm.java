public class KadaneAlrogithm {
    public static int maxAbsoluteSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxEndingHere = 0;
        int minEndingHere = 0;
        int maxSoFar = 0;

        for (int num : nums) {
            // Update maxEndingHere
            maxEndingHere = Math.max(num, maxEndingHere + num);
            // Update minEndingHere
            minEndingHere = Math.min(num, minEndingHere + num);
            // Update maxSoFar
            maxSoFar = Math.max(maxSoFar, Math.max(Math.abs(maxEndingHere), Math.abs(minEndingHere)));
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, -3, 2, 3, -4};
        System.out.println(maxAbsoluteSum(nums1)); // Output: 5

        int[] nums2 = {2, -5, 1, -4, 3, -2};
        System.out.println(maxAbsoluteSum(nums2)); // Output: 8

        int[] nums3 = {-1, -2, -3};
        System.out.println(maxAbsoluteSum(nums3)); // Output: 6

        int[] nums4 = {0, 0, 0};
        System.out.println(maxAbsoluteSum(nums4)); // Output: 0
    }
}