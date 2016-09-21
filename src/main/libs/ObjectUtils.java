package main.libs;

import java.util.List;

/**
 * Created by sulang on 16-9-10.
 */
public class ObjectUtils {
    public static boolean checkIndexOf(int pos, int[] array) {
        if (null == array) {
            return true;
        }

        if (pos < 0 || pos >= array.length) {
            return true;
        }

        return false;
    }

    public static boolean isEmpty(Object[] arrays) {
        return null == arrays || arrays.length == 0;
    }

    public static boolean isEmpty(List list) {
        return null == list || list.size() == 0;
    }
}
