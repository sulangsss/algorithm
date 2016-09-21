package main.week3;

import main.libs.ObjectUtils;
import main.libs.SortUtils;

/**
 * Created by sulang on 16-9-20.
 */
public class InsertSort {
    public static void sort(Comparable[] arrays) {
        if (ObjectUtils.isEmpty(arrays)) {
            return;
        }

        // TODO: 16-9-20 第一个元素默认有序
        for (int sortedIndex = 1; sortedIndex < arrays.length; sortedIndex++) {

            // TODO: 16-9-20 从第二个元素开始
            for (int index = sortedIndex; index > 0; index--) {
                if (SortUtils.less(arrays[index], arrays[index - 1])) {
                    // TODO: 16-9-20 左边元素大于右边元素，则交换
                    SortUtils.exchange(arrays, index - 1, index);
                } else {
                    // TODO: 16-9-20 此时右边元素大于左边元素，则停止；
                    break;
                }
            }
        }
    }
}
