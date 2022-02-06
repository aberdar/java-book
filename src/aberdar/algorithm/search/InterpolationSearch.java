package aberdar.algorithm.search;

public class InterpolationSearch {

    // works with a sorted array
    static int search(int[] array, int x) {
        int low = 0;
        int high = array.length-1;

        while((array[low] < x) && (x < array[high])) {
            long delta = (long) (x - array[low]) *(high - low);
            int mid = low + (int)(delta/(array[high] - array[low]));

            if (array[mid] < x) {
                low = mid + 1;
            } else if (array[mid] > x) {
                low = mid - 1;
            } else {
                return mid;
            }
        }

        if (array[low] == x) {
            return low;
        }
        if (array[high] == x) {
            return high;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 8, 15, 24};

        System.out.println(search(array, 1));
        System.out.println(search(array, 15));
    }
}
