package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-18.
 */
public class doctor {
    String name;
    String specialization;

    public doctor(String nm, String spec)
    {
        name = nm;
        specialization = spec;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }
}
