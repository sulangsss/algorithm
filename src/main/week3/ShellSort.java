package main.week3;

import main.libs.ObjectUtils;
import main.libs.SortUtils;

/**
 * Created by sulang on 16-9-21.
 */
public class ShellSort {
    public static void sort(Comparable[] arrays) {
        if (ObjectUtils.isEmpty(arrays)) {
            throw new IllegalArgumentException();
        }

        int interval = 1;
        //  nice condition
        while (interval < arrays.length / 3) {
//        while (interval * 3 + 1 < arrays.length) {
            interval = interval * 3 + 1;
        }
//        System.out.println(interval);
        while (interval >= 1) {
            for (int index = interval; index < arrays.length; index++) {

                for (int position = index; position >= interval; position -= interval) {
                    if (SortUtils.less(arrays[position], arrays[position - interval])) {
                        SortUtils.exchange(arrays, position, position - interval);
                    }
                }
            }
            interval /= 3;
        }
    }
}
