package aberdar.algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    static List<Integer>[] listToBuckets(int[] array, int cBase, int i) {
        List<Integer>[] buckets = new ArrayList[cBase];

        for (int j = 0; j < buckets.length; j++) {
            buckets[j] = new ArrayList<Integer>();
        }

        int pBase = (int) Math.pow(cBase, i);
        for (int x : array) {
            // Isolated the base-digit from the number
            int digit = (x / pBase) % cBase;
            // Drop the number into the correct bucket
            buckets[digit].add(x);
        }

        return buckets;
    }

    static int[] bucketsToList(List<Integer>[] buckets) {
        List<Integer> array = new ArrayList<Integer>();

        for (List<Integer> bucket : buckets) {
            // Add the number in a bucket
            // Sequentially to the returned array
            array.addAll(bucket);
        }

        int[] result = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            result[i] = array.get(i);
        }

        return result;
    }

    static int[] sort(int[] array) {
        int cBase = 10;
        int maxVal = Arrays.stream(array).max().getAsInt();
        int i = 0;

        while (Math.pow(cBase, i) <= maxVal) {
            array = bucketsToList(listToBuckets(array, cBase, i));
            i++;
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 5, 3, 2};
        int[] sortArray = sort(array);

        System.out.println(Arrays.toString(sortArray));
    }
}
