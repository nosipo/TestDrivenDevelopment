package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testObjectEquality {
    private patient depression;

    @Before
    public void setUp() throws Exception{
        depression = new patient("Fuziwe", "depression");
    }

    @Test
    public void testObjectEquality() throws Exception {
        Assert.assertEquals(depression, depression);

    }
}
