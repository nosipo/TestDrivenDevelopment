package za.ac.mzilikazi;

/**
 * Created by mandisi on 2017-03-18.
 */
public class patient {
    String name;
    String diagnosis;

    public patient(String nm, String diagno)
    {
        name = nm;
        diagnosis = diagno;
    }

    public String getName(){return name;}

    public String getDiagnosis(){return diagnosis;}
}
