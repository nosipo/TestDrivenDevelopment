package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testNullness {
    private patient depression;

    @Before
    public void setUp() throws Exception {
        depression = new patient("fuziwe","depression");

    }

    @Test
    public void testNullness() throws Exception {
        depression = null;
        Assert.assertNull(depression);

    }
}
