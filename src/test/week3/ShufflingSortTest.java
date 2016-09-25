package test.week3;

import main.model.ModelUtils;
import main.week3.ShufflingSort;
import org.junit.Test;

/**
 * Created by sulang on 16-9-25.
 */
public class ShufflingSortTest {
    @Test
    public void sort() throws Exception {
        int[] intArrays = ModelUtils.getIntArrays(10, 20);
        ModelUtils.printInt(intArrays);
        ShufflingSort.sort(intArrays);
        ModelUtils.printInt(intArrays);

        ShufflingSort.sort(intArrays);
        ModelUtils.printInt(intArrays);

        ShufflingSort.sort(intArrays);
        ModelUtils.printInt(intArrays);
    }

}