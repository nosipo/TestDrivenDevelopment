package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class AdditionTest {
    addition add = new addition();

    @Test
    public void testAdd() throws Exception {
        int sum = add.add(2,5);
        Assert.assertEquals(7,sum);

    }
}
