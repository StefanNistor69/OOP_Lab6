package PC;

public class MotherBoard extends Case{
    protected String motherboardType;

    protected int mPrice;

    protected int mCost;





    public MotherBoard(String casetype, boolean Bluetooth,String motherboardType) {
        super(casetype, Bluetooth);
        this.motherboardType = motherboardType;

    }





    public double getMprice() {
        if(motherboardType == "Office") {
            mPrice = 10;
        } else if(motherboardType == "Gaming") {
            mPrice = 20;
        }
        return mPrice;
    }
    public double getMcost() {
        if(motherboardType == "Office") {
            mCost = 5;
        } else if(motherboardType == "Gaming") {
            mCost = 10;
        }
        return mCost;
    }


    @Override
    public double getPrice() {
        return super.getPrice() + (mPrice);
    }


    @Override
    public double getPCcost() {
        return super.getPCcost() + (mCost);
    }
}
