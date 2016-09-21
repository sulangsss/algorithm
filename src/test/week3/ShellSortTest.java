package test.week3;

import main.libs.SortUtils;
import main.model.ModelUtils;
import main.model.Personal;
import main.week3.ShellSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by sulang on 16-9-21.
 */
public class ShellSortTest {
    @Test
    public void sort() throws Exception {
        Personal[] persons = ModelUtils.getPersons(10, 10);
        ModelUtils.printPersons(persons);
        ShellSort.sort(persons);
        ModelUtils.printPersons(persons);
        Assert.assertTrue(SortUtils.isSorted(persons, true));
    }
}