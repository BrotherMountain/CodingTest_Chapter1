package src.bigO;

import src.SearchDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TimeComplexity {
    public static int[] readData() {
        int[] intArray = null;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gudtk\\IdeaProjects\\CodingTest\\CodingTest_Chapter1\\src\\main\\resources\\DataForComplexity.txt"))) {
            String s = br.readLine();
            String[] split = s.split(",");

            intArray = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();

        } catch (IOException e) {
            System.out.println("오류 발생");
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] array = readData();
        SearchDTO bestTimeComplexity = Search.binarySearch(array, array[array.length / 2 - 1]);
        System.out.println(bestTimeComplexity);
        SearchDTO worstTimeComplexity1 = Search.binarySearch(array, array[array.length / 2 - 2]);
        SearchDTO worstTimeComplexity2 = Search.binarySearch(array, array[0]);
        System.out.println(worstTimeComplexity1);
        System.out.println(worstTimeComplexity2);

        SearchDTO searchDTO = Search.linearSearch(array, array[array.length / 2]);
        System.out.println(searchDTO);
    }
}
