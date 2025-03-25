package src;

public class sortedSquares {
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] nums1 = sortedSquares(nums);
        for (int i : nums1) {
            System.out.println(i);
        }

    }
}
