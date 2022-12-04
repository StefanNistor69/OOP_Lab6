package PC;

public class Gaming_Model2 extends Computer{
    private boolean WaterCooling;
    private int PC2price;

    public Gaming_Model2() {
        super("gaming", false, "Gaming","RTX 3060","intel i5",16,"Gold 100W");
        this.WaterCooling = true;
    }
    public double getPC2price() {

        if (WaterCooling == true) {
            PC2price += 0;
        } else if (WaterCooling == false) {
            PC2price += 0;
        }
        return PC2price;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + PC2price;
    }
    @Override
    public double getPCcost() {
        return super.getPCcost();
    }
}
