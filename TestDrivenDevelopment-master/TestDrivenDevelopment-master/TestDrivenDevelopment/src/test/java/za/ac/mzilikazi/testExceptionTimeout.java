package za.ac.mzilikazi;

import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testExceptionTimeout {

    @Test(timeout = 11)
    public void testException() throws Exception {
        while (true){
            System.out.close();
        }

    }
}
