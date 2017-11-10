package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by mandisi on 2017-03-18.
 */
public class subtractionTest {

    subtraction subtract = new subtraction();

    @Test
    public void testSubtraction() throws Exception {
        int sum = subtract.subtract(10,2);
        Assert.assertEquals(8, sum);

    }
}
