package Pattern;
import PC.*;

import Employees.*;

import java.util.Random;

public class Controller implements ControllerInterface {
    ViewInterface view = new View();
    Model model = new Model();

    @Override
    public void display() {
        view.startSimulation();
        long start = System.currentTimeMillis();
        long end = start + 12 * 1000;



        while (true) {

            Random rand = model.getRandom();
            Gaming_Model1 g1 = model.getGaming_Model1();
            Gaming_Model2 g2 = model.getGaming_Model2();
            Gaming_Model3 g3 = model.getGaming_Model3();
            Office_Model1 o1 = model.getOffice_Model1();
            Office_Model2 o2 = model.getOffice_Model2();
            Office_Model3 o3 = model.getOffice_Model3();
            ExperiencedWorker ex = model.getExperience();
            NoobWorker noobs = model.getNoob();
            int randomGaming = model.randomGaming(rand);
            int randomPrice = model.randomPrice(rand);

            int happy = 10;
            int sad = -10;
            double profit = 0;
            double cash = 0;
            double cost = 0;




            int randomWorker = model.randomWorker(rand);
            int Score = model.Score();



            view.randomGamingPC(g1, g2, g3, randomGaming, randomWorker, happy, sad,o1,o2,o3,profit);
            cash = cash + model.AssembleGamingPC(g1, g2, g3, randomPrice, cash,o1,o2,o3);
            cost = cost + model.CostPC(g1,g2,g3,randomPrice,cost,o1,o2,o3);
            System.out.println("    ");
                if (System.currentTimeMillis() > end) {
                    int monthlyProfit = (int) (cash/24);
                    double MonthlyCost = cost/24;
                    view.Statistics(cash, (int) cost, (int) MonthlyCost,  monthlyProfit, Score);
                    System.exit(0);
                }
            }
        }
    }

