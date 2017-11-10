package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mandisi on 2017-03-18.
 */
public class testObjectIdentity {
    private doctor doc;
    private patient depression;
    private patient anxiety;

    @Before
    public void setUp() throws Exception {
        doc = new doctor("milisa", "therapist");
        depression = new patient("Asavela","depression");
        anxiety = new patient("mandisi","anxiety");

    }

    @Test
    public void testObjectIdentity() throws Exception {
        Assert.assertSame(doc,doc);
        Assert.assertNotSame(depression,anxiety);

    }
}
