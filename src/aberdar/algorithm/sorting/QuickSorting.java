package aberdar.algorithm.sorting;

import java.util.Arrays;

// Time complexity from O(n log(n)) to O(n^2)
// Space complexity O(log(n))

public class QuickSorting {

    static void doSorting(int[] array, int first, int last) {
        if (first >= last) {
            return;
        }

        int i = first;
        int j = last;
        int x = array[(first+last)/2];

        while (i < j) {
            while (array[i] < x) { i++; }
            while (array[j] > x) { j--; }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;

                i++;
                j--;
            }
        }

        doSorting(array, first, j);
        doSorting(array, i, last);
    }

    static int[] sorting(int[] array) {
        int size = array.length;
        int[] items = Arrays.copyOf(array, size);
        doSorting(items, 0, size - 1);
        return items;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 6, 3, 2};
        int[] sortArray = sorting(array);
        System.out.println(Arrays.toString(sortArray));
    }
}
