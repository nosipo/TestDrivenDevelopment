package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testTruth {
    private patient depression;

    @Before
    public void setUp() throws Exception {
        depression = new patient("fuziwe","depression");

    }

    @Test
    public void testTruth() throws Exception {
        Assert.assertTrue(true);
        Assert.assertTrue(depression.getName().equalsIgnoreCase(depression.getName()));

    }
}
