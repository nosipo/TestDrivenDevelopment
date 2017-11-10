package za.ac.mzilikazi;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testFloatingPoint {
    floatingPoint dueAmount = new floatingPoint();

    @Test
    public void testFloats() throws Exception {
        float results = dueAmount.paymentDue(300.0f, 15.2f);
        Assert.assertEquals(315.2f, results,0.0f);

    }
}
