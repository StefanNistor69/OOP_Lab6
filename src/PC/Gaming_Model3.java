package PC;

public class Gaming_Model3 extends Computer{
    private boolean WaterCooling;
    private int PC3price;

    public Gaming_Model3() {
        super("gaming", true, "Gaming","RTX 3080","intel i7",16,"Platinum 120W");
        this.WaterCooling = true;
    }
    public double getPC3price() {

        if (WaterCooling == true) {
            PC3price += 0;
        } else if (WaterCooling == false) {
            PC3price += 0;
        }
        return PC3price;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + PC3price;
    }
    @Override
    public double getPCcost() {
        return super.getPCcost();
    }
}
