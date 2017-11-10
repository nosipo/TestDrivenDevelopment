package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class DivisionTest {
    division divide = new division();

    @Test
    public void testDivide() throws Exception {
        int sum = divide.divide(10,2);
        Assert.assertEquals(5, sum);

    }
}
