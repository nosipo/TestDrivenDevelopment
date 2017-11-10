package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testFail {
    @Test
    public void testFailure() throws Exception {
        Assert.assertTrue(!true);
        Assert.assertFalse(4>3);

    }
}
