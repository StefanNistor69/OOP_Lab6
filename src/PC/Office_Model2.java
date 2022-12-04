package PC;

public class Office_Model2 extends Computer{
    private boolean Wifi;
    private int O_PC2price;

    public Office_Model2() {
        super("office", true, "Office","RTX 3050","intel i5",16,"Gold 100W");
        this.Wifi = false;
    }
    public double getO_PC2price() {

        if (Wifi == true) {
            O_PC2price += 0;
        } else if (Wifi == false) {
            O_PC2price += 0;
        }
        return O_PC2price;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + O_PC2price;
    }
    @Override
    public double getPCcost() {
        return super.getPCcost();
    }
}
