package main.week3;

import main.libs.SortUtils;
import main.libs.StdRandom;

/**
 * Created by sulang on 16-9-25.
 */
public class ShufflingSort {
    public static void sort(int[] arrays) {
        for (int index = 0; index < arrays.length; index++) {
            SortUtils.exchange(arrays, StdRandom.uniform(0, index + 1), index);
        }
    }
}
