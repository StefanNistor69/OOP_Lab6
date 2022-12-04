package PC;

public class Office_Model3 extends Computer{
    private boolean Wifi;
    private int O_PC3price;

    public Office_Model3() {
        super("office", true, "Office","RTX 3050","intel i7",16,"Platinum 120W");
        this.Wifi = true;
    }
    public double getO_PC3price() {

        if (Wifi == true) {
            O_PC3price += 0;
        } else if (Wifi == false) {
            O_PC3price += 0;
        }
        return O_PC3price;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + O_PC3price;
    }
    @Override
    public double getPCcost() {
        return super.getPCcost();
    }
}
