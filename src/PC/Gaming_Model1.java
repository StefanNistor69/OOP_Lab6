package PC;

public class Gaming_Model1 extends Computer{
    private boolean WaterCooling;
    private int PC1price;

    public Gaming_Model1() {
        super("gaming", true, "Gaming","RTX 3050","intel i5",8,"Gold 100W");
        this.WaterCooling = false;
    }
    public double getPC1price() {

        if (WaterCooling == true) {
            PC1price += 0;
        } else if (WaterCooling == false) {
            PC1price += 0;
        }
        return PC1price;
    }


    @Override
    public double getPrice() {

        return super.getPrice() + PC1price;
    }
    @Override
    public double getPCcost() {
        return super.getPCcost();
    }
}
