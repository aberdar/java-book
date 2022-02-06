package aberdar.algorithm.search;

public class LinearSearch {

    static int search(int[] array, int x) {
        int i = 0;
        int count = array.length;

        while(i < count) {
            if (array[i] == x) {
                return i;
            }
            i++;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 6, 9, 19};

        System.out.println(search(array, 20));
        System.out.println(search(array, 6));
    }
}
