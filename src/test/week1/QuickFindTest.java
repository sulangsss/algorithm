package test.week1;

import main.week1.IQuickFind;
import main.week1.QuickFind;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sulang on 16-9-5.
 */
public class QuickFindTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test(expected = RuntimeException.class)
    public void testCreate() {
        IQuickFind quickFind = new QuickFind(0);
    }

    @Test
    public void testConnect() {
        QuickFind union = new QuickFind(5);
        Assert.assertTrue(union.connect(0, 1));
        Assert.assertTrue(union.connect(1, 2));
        Assert.assertTrue(union.connect(2, 3));
        Assert.assertTrue(union.connect(3, 4));

        Assert.assertFalse(union.connect(0, 1));
        Assert.assertFalse(union.connect(1, 0));

        Assert.assertFalse(union.connect(1, 2));
        Assert.assertFalse(union.connect(2, 1));

        Assert.assertFalse(union.connect(2, 3));
        Assert.assertFalse(union.connect(3, 2));

        Assert.assertFalse(union.connect(3, 4));
        Assert.assertFalse(union.connect(4, 3));
    }

    @Test
    public void testIsConnect() {
        IQuickFind union = new QuickFind(5);
        Assert.assertTrue(union.connect(0, 1));
        Assert.assertTrue(union.connect(1, 2));
        Assert.assertTrue(union.connect(2, 3));
        Assert.assertTrue(union.connect(3, 4));

        Assert.assertTrue(union.isConnected(0, 4));
        Assert.assertTrue(union.isConnected(4, 0));

        Assert.assertTrue(union.isConnected(1, 3));
        Assert.assertTrue(union.isConnected(3, 1));
    }

    @Test
    public void testPrint() {
        IQuickFind union = new QuickFind(5);
        union.print();
    }
}