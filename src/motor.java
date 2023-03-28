import java.time.Year;
public class motor {

    private int ID;
    private String Type;
    private String NumberPlate;
    private int BasePrice;
    private String MotorType;

    public motor(int ID, String type, String numberPlate, int basePrice, String motorType) {
        this.ID = ID;
        this.Type = type;
        this.NumberPlate = numberPlate;
        this.BasePrice = basePrice;
        this.MotorType = motorType;
    }





        public String toString()
        {

            if(this.MotorType.equals("scooter"))
                this.BasePrice=this.BasePrice+50;
            else if(this.MotorType.equals("motorbike"))
                this.BasePrice=this.BasePrice+100;



            return "your motor is "+this.Type+" ("+this.NumberPlate+") "+" ,and motor type is "+this.MotorType+"\nPrice is: "+this.BasePrice+" TL";

        }


}
