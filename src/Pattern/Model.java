package Pattern;

import Employees.ExperiencedWorker;
import Employees.NoobWorker;
import Client.Gamer;
import Client.OfficeWorker;
import PC.*;


import java.util.Random;

public class Model implements ModelInterface {


    @Override
    public int randomGaming(Random rand) {
        return rand.nextInt(6) + 1;
    }
    public int randomPrice(Random rand) {
        return rand.nextInt(3) + 1;
    }
    @Override
    public int randomOffice(Random rand) {
        return rand.nextInt(3) + 1;

    }

    @Override
    public int randomAssemble(Random rand) {
        return rand.nextInt(3) + 1;
    }

    public Random getRandom() {
        return new Random();
    }

    @Override
    public Gaming_Model1 getGaming_Model1() {
        return new Gaming_Model1();
    }

    @Override
    public Gaming_Model2 getGaming_Model2() {
        return new Gaming_Model2();
    }

    @Override
    public Gaming_Model3 getGaming_Model3() {
        return new Gaming_Model3();
    }

    @Override
    public Office_Model1 getOffice_Model1() {
        return new Office_Model1();
    }

    @Override
    public Office_Model2 getOffice_Model2() {
        return new Office_Model2();
    }

    @Override
    public Office_Model3 getOffice_Model3() {
        return new Office_Model3();
    }
    public ExperiencedWorker getExperience() {
        return new ExperiencedWorker();
    }
    public NoobWorker getNoob() {
        return new NoobWorker();
    }

    @Override
    public float Discount() {
        return 0.25F;
    }

    public int randomWorker(Random rand) {
        return rand.nextInt(3 + 1);
    }

    public int randomDiscount(Random rand) {
        return rand.nextInt(3 + 1);
    }

    @Override
    public double AssembleGamingPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomPrice, double cash,Office_Model1 o1, Office_Model2 o2, Office_Model3 o3) {

            switch (randomPrice) {
                case 1:

                    cash = cash + g1.getPrice() * 39874;
                    break;
                case 2:

                    cash = cash + g2.getPrice() * 34574;
                    break;
                case 3:

                    cash = cash + g3.getPrice() * 32431;
                    break;
                case 4:

                    cash += o1.getPrice()*32746;
                    break;
                case 5:

                    cash += o2.getPrice()*32431;
                    break;
                case 6:

                    cash += o3.getPrice()*36452;
                    break;
            }
            return cash;

        }
    public double CostPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomPrice, double cost,Office_Model1 o1, Office_Model2 o2, Office_Model3 o3) {

        switch (randomPrice) {
            case 1:

                cost = cost + g1.getPCcost() * 29874;
                break;
            case 2:

                cost = cost + g2.getPCcost() * 24574;
                break;
            case 3:

                cost = cost + g3.getPCcost() * 22431;
                break;
            case 4:

                cost += o1.getPCcost() *22746;
                break;
            case 5:

                cost += o2.getPCcost()*22431;
                break;
            case 6:

                cost += o3.getPCcost() *26452;
                break;
        }
        return cost;

    }



    @Override
    public double AssembleOfficePC(Office_Model1 o1, Office_Model2 o2, Office_Model3 o3, int randomOffice, double profit) {

            switch (randomOffice) {
                case 1:
                    System.out.println("PROFIT PROFIT PROFIT  PROFIT");
                    profit += o1.getPrice()*32746;
                    break;
                case 2:
                    System.out.println("PROFIT PROFIT PROFIT  PROFIT");
                    profit += o2.getPrice()*32431;
                    break;
                case 3:
                    System.out.println("PROFIT PROFIT PROFIT  PROFIT");
                    profit += o3.getPrice()*36452;
                    break;
            }
            return profit;
        }





    @Override
    public double getG1Profit(double profit) {
        profit = getGaming_Model1().getPrice();
        return profit;
    }

    @Override
    public double getG2Profit(double profit) {
        profit = getGaming_Model2().getPrice();
        return profit;
    }

    @Override
    public double getG3Profit(double profit) {
        profit = getGaming_Model3().getPrice();
        return profit;
    }

    public int Score(){

        return 0;
    }

}
