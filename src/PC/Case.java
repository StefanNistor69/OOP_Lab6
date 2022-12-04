package PC;

public class Case {
    private String casetype;

    private boolean Bluetooth;


    private double price;

    private double cost;

    public Case(String casetype, boolean Bluetooth) {
        this.casetype = casetype;
        this.Bluetooth = Bluetooth;

    }

    public void setcasetype(String casetype) {
        this.casetype = casetype;
    }
    public void setBluetooth(boolean Bluetooth) {
        this.Bluetooth = Bluetooth;
    }




    public double getPCcost(){
        if (casetype == "office" ) {
            cost = 5;
        }

        else if (casetype == "gaming") {
            cost = 10;
        }
        if(Bluetooth){

            cost = 5;
        } else{
            cost = 0;
        }
        return cost;
    }
    public double getPrice() {
        if (casetype == "office" ) {
            price = 10;
        }

        else if (casetype == "gaming") {
            price = 20;
        }
        if(Bluetooth){

            price = 10;
        } else{
            price = 0;
        }


        return price;
    }
}
