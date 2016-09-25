package main.libs;

/**
 * Created by sulang on 16-9-20.
 */
public class SortUtils {
    public static boolean less(Comparable a, Comparable b) {
        if (null == a || null == b) {
            throw new IllegalArgumentException();
        }

        return a.compareTo(b) < 0;
    }

    public static boolean lessOrEqual(Comparable a, Comparable b) {
        if (null == a || null == b) {
            throw new IllegalArgumentException();
        }

        return a.compareTo(b) <= 0;
    }

    /**
     * @param arrays
     * @param ascending
     * @return
     */
    public static boolean isSorted(Comparable[] arrays, boolean ascending) {
        if (ObjectUtils.isEmpty(arrays)) {
            return false;
        }

        boolean isSorted = true;
        for (int index = 0; index < arrays.length - 1; index++) {
            if (ascending) {
                if (!lessOrEqual(arrays[index], arrays[index + 1])) {
                    isSorted = false;
                    break;
                }
            } else {
                if (lessOrEqual(arrays[index], arrays[index + 1])) {
                    isSorted = false;
                    break;
                }
            }
        }

        return isSorted;
    }


    public static void exchange(Comparable[] arrays, int exchange_a, int exchange_b) {
        if (null == arrays) {
            throw new IllegalArgumentException();
        }

        if (exchange_a >= arrays.length || exchange_b >= arrays.length) {
            throw new IllegalArgumentException();
        }

        Comparable swap = arrays[exchange_a];
        arrays[exchange_a] = arrays[exchange_b];
        arrays[exchange_b] = swap;
    }

    public static void exchange(int[] arrays, int exchange_a, int exchange_b) {
        if (null == arrays) {
            throw new IllegalArgumentException();
        }

        if (exchange_a >= arrays.length || exchange_b >= arrays.length) {
            throw new IllegalArgumentException();
        }

        int swap = arrays[exchange_a];
        arrays[exchange_a] = arrays[exchange_b];
        arrays[exchange_b] = swap;
    }
}
