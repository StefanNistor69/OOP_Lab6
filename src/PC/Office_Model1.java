package PC;

public class Office_Model1 extends Computer{
    private boolean Wifi;
    private int O_PC1price;

    public Office_Model1() {
        super("office", true, "Office","RTX 3050","intel i3",8,"Gold 100W");
        this.Wifi = false;
    }
    public double getO_PC1price() {

        if (Wifi == true) {
            O_PC1price += 0;
        } else if (Wifi == false) {
            O_PC1price += 0;
        }
        return O_PC1price;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + O_PC1price;
    }
    @Override
    public double getPCcost() {
        return super.getPCcost();
    }
}
