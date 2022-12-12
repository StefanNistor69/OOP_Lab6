package Pattern;
import PC.*;
import Employees.*;
import Client.*;

import java.util.Random;
import java.util.Scanner;
public interface ModelInterface {
    public int randomGaming(Random rand);
    public int randomOffice(Random rand);

    public int randomAssemble(Random rand);
    Random getRandom();
    Gaming_Model1 getGaming_Model1();
    Gaming_Model2 getGaming_Model2();
    Gaming_Model3 getGaming_Model3();
    Office_Model1 getOffice_Model1();
    Office_Model2 getOffice_Model2();
    Office_Model3 getOffice_Model3();
    public int Score();
    public int randomWorker(Random rand);
    public float Discount();

    public int randomDiscount(Random rand);

    double AssembleGamingPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomGaming, double cash,Office_Model1 o1, Office_Model2 o2, Office_Model3 o3);

    public double CostPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomPrice, double cost,Office_Model1 o1, Office_Model2 o2, Office_Model3 o3);
    double AssembleOfficePC(Office_Model1 o1, Office_Model2 o2, Office_Model3 o3, int randomOffice, double profit);

    double getG1Profit(double profit);
    double getG2Profit(double profit);
    double getG3Profit(double profit);
}
