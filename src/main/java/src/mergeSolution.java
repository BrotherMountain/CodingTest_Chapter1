package src;

public class mergeSolution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for (int k = m + n - 1; k > 0; k--) {
            if (i < 0 || j < 0) {
                break;
            } else {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i--];
                } else {
                    nums1[k] = nums2[j--];
                }
            }
        }
        for (int k = 0; k <= j; k++) {
            nums1[k] = nums2[k];
        }
    }

    public static void main(String[] args) {
        int[] num1 = {4, 5, 6, 0, 0, 0};
        int m = 3;

        int[] num2 = {1, 2, 3};
        int n = 3;

//        int[] num1 = {0};
//        int m = 0;
//
//        int[] num2 = {1};
//        int n = 1;

//        int[] num1 = {1, 2, 3, 0, 0, 0};
//        int m = 3;
//
//        int[] num2 = {2,5,6};
//        int n = 3;

        merge(num1, m, num2, n);
    }
}
