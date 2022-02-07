package aberdar.algorithm.sorting;

import java.util.Arrays;

public class BubbleSorting {

    static int[] sort(int[] array) {
        int size = array.length;
        int[] sortArray = Arrays.copyOf(array, size);

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sortArray[j] < sortArray[i]) {
                    int tmp = sortArray[j];
                    sortArray[j] = sortArray[i];
                    sortArray[i] = tmp;
                }
            }
        }

        return sortArray;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 5, 3, 2};
        int[] sortArray = sort(array);

        System.out.println(Arrays.toString(sortArray));
    }
}
