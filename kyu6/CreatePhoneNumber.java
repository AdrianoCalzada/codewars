package kyu6;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String s = createPhoneNumber(nums);

        System.out.println(s);

    }

    public static String createPhoneNumber(int[] nums) {
        String s = String.format("(%d%d%d) %d%d%d-%d%d%d%d", nums[0], nums[1],
                nums[2], nums[3], nums[4], nums[5], nums[6], nums[7], nums[8], nums[9]);
        return s;
    }
}
