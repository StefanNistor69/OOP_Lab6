package PC;

public class Computer extends MotherBoard{
    private String GPU;

    private String CPU;

    private int RAM;

    private String PowerSupply;

    private int GPUprice;

    private int CPUprice;

    private int RAMprice;

    private int PowerPrice;

    private int GPUcost;

    private int CPUcost;

    private int RAMcost;

    private int PowerCost;



    public Computer(String casetype,boolean Bluetooth,String motherboardType,String GPU, String CPU, int RAM, String PowerSupply) {
        super(casetype, Bluetooth,motherboardType);
        this.GPU = GPU;
        this.CPU = CPU;
        this.RAM = RAM;
        this.PowerSupply = PowerSupply;


    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    public void setPowerSupply(String PowerSupply) {
        this.PowerSupply = PowerSupply;
    }

    public double getGPUprice(){

        if(GPU == "RTX 3050"){
            GPUprice = 50;
            GPUcost = 40;
        } else if (GPU == "RTX 3060") {

            GPUprice = 70;
            GPUcost = 60;

        } else if (GPU == "RTX 3080") {
            GPUprice = 100;
            GPUcost = 80;
        }
        return GPUprice;
    }
    public double getCPUprice(){

        if(CPU == "intel i3"){
            CPUprice = 10;
            CPUcost = 5;
        } else if (CPU == "intel i5") {

            CPUprice = 30;
            CPUcost = 25;

        } else if (CPU == "intel i7") {
            CPUprice = 50;
            CPUcost = 30;
        }
        return CPUprice;
    }
    public double getRAMprice(){

        if(RAM == 8){
            RAMprice = 10;
            RAMcost = 5;
        } else if (RAM == 16) {

            RAMprice = 30;
            RAMcost = 15;

        }
        return RAMprice;
    }
    public double getPowerPrice(){

        if(PowerSupply == "Gold 100W"){
            PowerPrice = 50;
            PowerCost = 35;
        } else if (PowerSupply == "Platinum 120W") {

            PowerPrice = 70;
            PowerCost = 55;

        }
        return PowerPrice;
    }
    public double getGPUcost(){
        if(GPU == "RTX 3050"){

            GPUcost = 40;
        } else if (GPU == "RTX 3060") {


            GPUcost = 60;

        } else if (GPU == "RTX 3080") {

            GPUcost = 80;
        }
        return GPUcost;

    }
    public double getCPUcost(){

        if(CPU == "intel i3"){

            CPUcost = 5;
        } else if (CPU == "intel i5") {


            CPUcost = 25;

        } else if (CPU == "intel i7") {

            CPUcost = 30;
        }
        return CPUprice;
    }
    public double getPowerCost(){

        if(PowerSupply == "Gold 100W"){

            PowerCost = 35;
        } else if (PowerSupply == "Platinum 120W") {


            PowerCost = 55;

        }
        return PowerCost;
    }
    public double getRAMcost(){

        if(RAM == 8){

            RAMcost = 5;
        } else if (RAM == 16) {


            RAMcost = 15;

        }
        return RAMcost;
    }

    @Override
    public double getPrice() {

        return super.getPrice() + (getGPUprice()+getCPUprice()+getRAMprice()+getPowerPrice());
    }
    @Override
    public double getPCcost() {
        return super.getPCcost() + (RAMcost + GPUcost + CPUcost + PowerCost);
    }
}
