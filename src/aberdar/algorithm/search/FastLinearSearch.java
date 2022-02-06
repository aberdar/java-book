package aberdar.algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastLinearSearch {

    static int search(List<Integer> list, int x) {
        int i = 0;
        int count = list.size();

        list.add(x);
        while(true) {
            if (list.get(i) == x) {
                return i < count ? i : -1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 4, 7, 9, 17));

        System.out.println(search(list, 1));
        System.out.println(search(list, 9));
    }
}
