package aberdar.algorithm.search;

public class BinarySearch {

    // works with a sorted array
    static int search(int[] array, int x) {
        int i = 0;
        int j = array.length;

        while (i != j) {
            int position = (i+j)/2;
            if (x == array[position]) {
                return position;
            }
            if (x < array[position]) {
                j = position;
            } else {
                i = position + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9, 18, 19};

        System.out.println(search(array, 1));
        System.out.println(search(array, 9));
    }
}
