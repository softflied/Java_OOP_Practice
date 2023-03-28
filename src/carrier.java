public class carrier {
    private int ID;
    private String Type;
    private String NumberPlate;
    private int BasePrice;
    private String FuelType;

    public carrier(int ID, String type, String numberPlate, int basePrice, String fuelType) {
        this.ID = ID;
        this.Type = type;
        this.NumberPlate = numberPlate;
        this.BasePrice = basePrice;
        this.FuelType = fuelType;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }

    public int getBasePrice() {
        return BasePrice;
    }

    public void setBasePrice(int basePrice) {
        BasePrice = basePrice;
    }

    public String toString()
    {
        return "it's type is "+this.Type+" ("+this.NumberPlate+") "+"and it's fuel type is "+this.FuelType;
    }
}
