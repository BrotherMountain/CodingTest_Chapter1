package src;

public class twoSum {
    public static int[] twoSum(int[] numbers, int target) {
//        int[] ans = new int[2];
//        int i = 0, j = i + 1;
//        while (i < numbers.length) {
//            if (numbers[i] + numbers[j]== target) {
//                ans = new int[]{i + 1, j + 1};
//                break;
//            }
//            j++;
//            if (j == numbers.length) {
//                i++;
//                j = i + 1;
//            }
//        }
//        return ans;

        int i = 0, j = numbers.length-1;
        int[] ans = new int[2];
        while (i < numbers.length && j >= 0) {
            if (numbers[i] + numbers[j] == target) {
                ans = new int[]{i + 1, j + 1};
                break;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] numbers = {2, 3, 4};
//        int target = 6;

//        int[] numbers = {2, 7, 11, 15};
//        int target = 9;

//        int[] numbers = {-1,0};
//        int target =-1;

        int[] numbers = {-10,-8,-2,1,2,5,6};
        int target =0;

//        int[] numbers = {5,25,75};
//        int target =100;


        twoSum(numbers, target);
    }
}
