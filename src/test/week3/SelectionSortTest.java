package test.week3;

import main.libs.SortUtils;
import main.libs.StdRandom;
import main.model.Personal;
import main.week3.SelectionSort;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sulang on 16-9-20.
 */
public class SelectionSortTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void sortArray() throws Exception {
        int size = 100;
        Personal[] personals = new Personal[size];
        for (int index = 0; index < size; index++) {
            personals[index] = new Personal(StdRandom.uniform(100));
        }

        for (int index = 0; index < personals.length; index++) {
            System.out.print(personals[index].getAge() + ",");
        }

        SelectionSort.sort(personals);
        System.out.println("");
        for (int index = 0; index < personals.length; index++) {
            System.out.print(personals[index].getAge() + ",");
        }

        Assert.assertTrue(SortUtils.isSorted(personals, true));
    }

    @Test
    public void softList() throws Exception {
    }

}