package src.bigO;

import src.SearchDTO;

public class Search {
    public static SearchDTO linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return new SearchDTO(arr[i],i, i);
            }
        }
        return new SearchDTO(target,-1, arr.length);
    }

    public static SearchDTO binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;
        while (left <= right) {
            count++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return new SearchDTO(arr[mid],mid, count);
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return new SearchDTO(target,-1, count);
    }
}
