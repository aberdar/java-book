package aberdar.algorithm.sorting;

import java.util.Arrays;

public class SortingByCounting {

    static int[] sort(int[] array) {
        int[] sortArray = new int[array.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int x : array) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        int[] counts = new int[max-min+1];
        for (int x : array) {
            counts[x-min]++;
        }

        int total = 0;
        for (int i = min; i <= max; i++) {
            int oldCount = counts[i-min];
            counts[i-min] = total;
            total += oldCount;
        }

        for (int x : array) {
            sortArray[counts[x-min]] = x;
            counts[x-min]++;
        }

        return sortArray;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 5, 3, 2};
        int[] sortArray = sort(array);

        System.out.println(Arrays.toString(sortArray));
    }
}
