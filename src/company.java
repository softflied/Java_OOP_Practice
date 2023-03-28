import java.util.ArrayList;

public class company {

    private int CustomerID;
    private String CompanyName;
    private int YearOfIncorporation;

    public company(String companyName, int yearOfIncorporation) {
        CompanyName = companyName;
        YearOfIncorporation = yearOfIncorporation;
    }

    ArrayList<String> Cname= new ArrayList<String>();

    ArrayList<Integer> ID= new ArrayList<Integer>();
    ArrayList<Integer> Year= new ArrayList<Integer>();
}
