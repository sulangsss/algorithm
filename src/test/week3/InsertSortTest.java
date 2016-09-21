package test.week3;

import main.libs.SortUtils;
import main.model.ModelUtils;
import main.model.Personal;
import main.week3.InsertSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sulang on 16-9-20.
 */
public class InsertSortTest {
    @Test
    public void sort() throws Exception {
        Personal[] persons = ModelUtils.getPersons(50, 100);
        ModelUtils.printPersons(persons);
        InsertSort.sort(persons);
        Assert.assertTrue(SortUtils.isSorted(persons, true));
        ModelUtils.printPersons(persons);
    }
}