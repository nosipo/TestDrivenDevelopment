package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testNonNullness {
    private doctor doc;

    @Before
    public void setUp() throws Exception {
        doc = new doctor("Linamandla","gaenecologist");

    }

    @Test
    public void testNonNullness() throws Exception {
        Assert.assertNotNull(doc);

    }
}
