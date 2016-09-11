package main.libs;

/**
 * Created by sulang on 16-9-10.
 */
public class ObjectUtils {
    boolean checkIndexOf(int pos, int[] array) {
        if (null == array) {
            return true;
        }

        if (pos < 0 || pos >= array.length) {
            return true;
        }

        return false;
    }
}
