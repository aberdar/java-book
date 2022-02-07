package aberdar.algorithm.sorting;

import java.util.Arrays;

public class MergeSorting {

    static void merge(int[] left, int[] right, int[] result) {
        int l = 0;
        int r = 0;
        int i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                result[i] = left[l];
                l++;
            } else {
                result[i] = right[r];
                r++;
            }
            i++;
        }

        System.arraycopy(left, l, result, i, left.length - l);
        System.arraycopy(right, r, result, i, right.length - r);
    }

    static void doSort(int[] array) {
        int size = array.length;
        if (size == 1) {
            return;
        }

        int sLeft = size / 2;
        int[] left = Arrays.copyOf(array, sLeft);
        int[] right = Arrays.copyOfRange(array, sLeft, size);

        doSort(left);
        doSort(right);

        merge(left, right, array);
    }

    static int[] sort(int[] array) {
        int[] sortArray = Arrays.copyOf(array, array.length);
        doSort(sortArray);
        return sortArray;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 5, 3, 2};
        int[] sortArray = sort(array);

        System.out.println(Arrays.toString(sortArray));
    }
}
