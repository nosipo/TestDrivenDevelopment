package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testArray {
    @Test
    public void testName() throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        for(int a = 0; a < list.size(); a++){
            Assert.assertNull(list.indexOf(a));
        }

    }


}
