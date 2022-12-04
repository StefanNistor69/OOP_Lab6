package Pattern;

import PC.*;
import Client.*;


public interface ViewInterface {
    void startSimulation();
    void endSimulation();
    void Gamer();
    void OfficeWorker();
    void Statistics(double profit, double monthlyProfit, int cost, int MonthlyCost, int Score);
    void randomGamingPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomGaming, int randomWorker, int happy, int sad);
    void randomOfficePC(Office_Model1 o1, Office_Model2 o2, Office_Model3 o3, int randomOffice, int randomWorker, int happy, int sad);
    void randomTime(int randomTimeTakeWaiter);
    void Experienced(int happy);
    void Noob(int sad);

}
