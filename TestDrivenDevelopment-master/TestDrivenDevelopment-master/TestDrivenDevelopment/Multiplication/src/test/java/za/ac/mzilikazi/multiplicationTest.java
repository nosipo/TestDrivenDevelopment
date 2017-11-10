package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class multiplicationTest {
    Multiplication multiply = new Multiplication();

    @Test
    public void testMultiply() throws Exception {
        int sum = multiply.multiply(5,2);
        Assert.assertEquals(10, sum);

    }
}
