package Pattern;
import PC.*;
import Client.*;
import Employees.*;

import java.util.Random;
import java.util.Scanner;
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

            int randomGaming = model.randomGaming(rand);
            int randomOffice = model.randomOffice(rand);
            int happy = 10;
            int sad = -10;
            double profit = 0;
            int cost = 0;
            int MothlyCost = cost/12;
            double monthlyProfit = profit/12;

            int randomEvent = rand.nextInt(3 + 1);
            int randomWorker = model.randomWorker(rand);
            int Score = model.Score();

                switch (randomEvent) {
                    case 1:
                        view.Gamer();

                        view.randomGamingPC(g1, g2, g3, randomGaming, randomWorker, happy, sad);
                        profit = model.AssembleGamingPC(g1, g2, g3, randomGaming, profit);
                        break;


                    case 2:
                        view.OfficeWorker();
                        view.randomOfficePC(o1, o2, o3, randomOffice, randomWorker, happy, sad);
                        profit = model.AssembleOfficePC(o1, o2, o3, randomOffice, profit);
                        break;
                }
                System.out.println("    ");
                if (System.currentTimeMillis() > end) {
                    view.Statistics(profit, cost, MothlyCost, (int) monthlyProfit, Score);
                    System.exit(0);
                }
            }
        }
    }

