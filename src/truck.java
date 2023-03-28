public class truck extends carrier {


    private int TonnageCapacity;

    public truck(int ID, String type, String numberPlate, int basePrice, String fuelType, int tonnageCapacity) {
        super(ID, type, numberPlate, basePrice, fuelType);
        this.TonnageCapacity = tonnageCapacity;
    }
    int newPrice=0;


    @Override
    public String toString() {
        if(super.getFuelType().equals("benzine"))
            newPrice = newPrice+30;
        else if (super.getFuelType().equals("diesel"))
            newPrice = newPrice+40;
        newPrice=newPrice+this.TonnageCapacity*100;


        return "your carrie type is truck and "+super.toString()+"\nPrice is: "+(super.getBasePrice()+newPrice+" TL");
    }
}
