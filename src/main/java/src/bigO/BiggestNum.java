package src.bigO;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class BiggestNum {
    public static int[] generateRandomIntArray(int size) {
        Random rd = new Random();

        if (size == 0) {
            size = rd.nextInt(10) + 1;
        }

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = rd.nextInt(101);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = generateRandomIntArray(5);
        System.out.println(Arrays.toString(array));

        int maxNum = 0;
        int maxNumToStream = Arrays.stream(array).max().getAsInt();

        for (int item : array) {
            if (maxNum <= item) {
                maxNum = item;
            }
        }

        System.out.println(maxNum);
        System.out.println(maxNumToStream);
    }
}
