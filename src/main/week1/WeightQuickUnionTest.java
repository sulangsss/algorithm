package main.week1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sulang on 16-9-10.
 */
public class WeightQuickUnionTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void connect() throws Exception {
        IWeightQuickUnion quick = new WeightQuickUnion(5);
        Assert.assertTrue(quick.connect(0, 1));
        Assert.assertTrue(quick.connect(1, 2));
        Assert.assertTrue(quick.connect(2, 3));
        Assert.assertTrue(quick.connect(3, 4));

        //  index of connect
        Assert.assertFalse(quick.connect(-1, 1));
        Assert.assertFalse(quick.connect(0, 5));
        Assert.assertFalse(quick.connect(-1, 5));
        Assert.assertFalse(quick.connect(4, 5));

        //  connected
        Assert.assertFalse(quick.connect(0, 1));
        Assert.assertFalse(quick.connect(0, 4));
        Assert.assertFalse(quick.connect(1, 2));
        Assert.assertFalse(quick.connect(3, 4));
    }

    @Test
    public void isConnected() throws Exception {
        IWeightQuickUnion quick = new WeightQuickUnion(5);
        Assert.assertTrue(quick.connect(0, 1));
        Assert.assertTrue(quick.connect(1, 2));

        //  connect
        Assert.assertTrue(quick.isConnected(0, 1));
        Assert.assertTrue(quick.isConnected(0, 2));

        //  unconnect
        Assert.assertFalse(quick.isConnected(0, 3));

        //  index of
        Assert.assertFalse(quick.isConnected(0, 5));
        Assert.assertFalse(quick.isConnected(-1, 5));
    }

    @Test
    public void print() throws Exception {

    }

    @Test
    public void getWeight() throws Exception {
        IWeightQuickUnion quick = new WeightQuickUnion(5);

        quick.connect(0, 1);
        quick.connect(0, 2);
        quick.connect(0, 3);
//        quick.connect(0, 4);

        Assert.assertSame(quick.getUnionCount(0), 4);
        Assert.assertNotEquals(quick.getUnionCount(0), 5);
    }
}