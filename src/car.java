import java.time.Year;

public class car {

    private int ID;
    private String Type;
    private String NumberPlate;
    private int BasePrice;
    private boolean Airbag;
    private String GearType;
    private int Age;



    public car(int ID, String type, String numberPlate, int basePrice, boolean airbag, String gearType, int age) {
        this.ID = ID;
        this.Type = type;
        this.NumberPlate = numberPlate;
        this.BasePrice = basePrice;
        this.Airbag = airbag;
        this.GearType = gearType;
        this.Age = age;


    }

    int newPrice=0;


    public String toString()
    {

        if(this.Airbag==true)
            newPrice=newPrice+100;
        if(GearType.equals("automatic"))
            newPrice=newPrice+200;
        if(Age<5)
            newPrice=newPrice+50;
        String airbags;

        if(this.Airbag==true)
        {
            airbags = "has airbag";
        }
        else
            airbags= "doesn't have airbag";

        return "your car is "+this.Type+" ("+this.NumberPlate+") "+airbags +" ,gear type is "+this.GearType+" and "+this.Age+" years old\nPrice is: "+(this.BasePrice+newPrice+" TL");

    }


}
