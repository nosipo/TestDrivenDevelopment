package za.ac.mzilikazi;

import org.junit.Test;
import org.junit.Assert;
/**
 * Created by mandisi on 2017-03-18.
 */
public class testIntegers {
    integers gameScore = new integers();

    @Test
    public void testIntegers() throws Exception {
        int results = gameScore.scores(35, 15);
        Assert.assertEquals(50,results);

    }
}
