package main.week3;

import main.libs.ObjectUtils;
import main.libs.SortUtils;

import java.util.List;

/**
 * Created by sulang on 16-9-20.
 */
public class SelectionSort {

    public static <T extends Comparable<? super T>> void sort(T[] arrays) {
        if (ObjectUtils.isEmpty(arrays)) {
            throw new IllegalArgumentException();
        }

        int mimPos;
        for (int index = 0; index < arrays.length; index++) {
            mimPos = index;
            // TODO: 16-9-20 从当前列表找出最小的数
            for (int curPos = index + 1; curPos < arrays.length; curPos++) {
                if (SortUtils.less(arrays[curPos], arrays[mimPos])) {
                    mimPos = curPos;
                }
            }
            SortUtils.exchange(arrays, index, mimPos);
        }
    }

    public static <T extends Comparable<? super T>> void sort(List<T> list) {
        if (ObjectUtils.isEmpty(list)) {
            throw new IllegalArgumentException();
        }

        int mimPos;
        for (int index = 0; index < list.size(); index++) {
            mimPos = index;
            // TODO: 16-9-20 从当前列表找出最小的数
            for (int curPos = index + 1; curPos < list.size(); curPos++) {
                if (SortUtils.less(list.get(index), list.get(mimPos))) {
                    mimPos = curPos;
                }
            }
        }
    }
}
