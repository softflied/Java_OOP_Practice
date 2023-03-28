public class bus extends carrier{
    private int SeatCapacity;

    public bus(int ID, String type, String numberPlate, int basePrice, String fuelType, int seatCapacity) {
        super(ID, type, numberPlate, basePrice, fuelType);
        this.SeatCapacity = seatCapacity;
    }

    int newPrice=0;
    @Override
    public String toString() {
        if(super.getFuelType().equals("benzine"))
            newPrice = newPrice+30;
        else if (super.getFuelType().equals("diesel"))
            newPrice = newPrice+40;
        newPrice=newPrice+this.SeatCapacity*10;
        return "your carrie type is bus and "+super.toString()+"\nPrice is: "+(super.getBasePrice()+newPrice+" TL");
    }

}
