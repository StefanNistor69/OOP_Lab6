package Pattern;

import PC.*;
import Client.*;
import Employees.*;

public class View implements ViewInterface {
    @Override
    public void startSimulation() {
        System.out.println("Simulation started!");
    }

    @Override
    public void endSimulation() {
        System.out.println("Simulation ended!");
    }

    @Override
    public void Gamer() {
        System.out.println("a gamer showed up!");
    }

    @Override
    public void OfficeWorker() {
        System.out.println("an office worker showed up!");
    }

    @Override
    public void Statistics(double profit, double monthlyProfit, int cost, int MonthlyCost, int Score) {
        System.out.println("Final profit : " + profit);
        System.out.println("Final costs : " + cost);
        System.out.println("Monthly profit : " + monthlyProfit);
        System.out.println("Monthly costs : " + MonthlyCost);

    }

    @Override
    public void randomGamingPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomGaming, int randomWorker, int happy, int sad) {
        switch (randomGaming) {
            case 1:
                System.out.println("The customer ordered the first gaming model");
                System.out.println("The check price was: " + g1.getPrice());

                if(randomWorker == 1){
                    System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);


                }else{
                    System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
                }


                break;
            case 2:
                System.out.println("The customer ordered the second gaming model");
                System.out.println("The check price was: " + g2.getPrice());

                if(randomWorker == 1){
                    System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);

                }else{
                    System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
                }
                break;
            case 3:
                System.out.println("The customer ordered the third gaming model");
                System.out.println("The check price was: " + g3.getPrice());

                if(randomWorker == 1){
                    System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);

                }else{
                    System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
                }
                break;
        }

    }

    @Override
    public void randomOfficePC(Office_Model1 o1, Office_Model2 o2, Office_Model3 o3, int randomOffice, int randomWorker,int happy, int sad) {
        switch (randomOffice) {
            case 1:
                System.out.println("The customer ordered the first office model");
                System.out.println("The check price was: " + o1.getPrice());

                if(randomWorker == 1){
                    System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);

                }else{
                    System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
                }
                break;
            case 2:
                System.out.println("The customer ordered the second office model");
                System.out.println("The check price was: " + o2.getPrice());

                if(randomWorker == 1){
                    System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);

                }else{
                    System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
                }
                break;
            case 3:
                System.out.println("The customer ordered the third office model");
                System.out.println("The check price was: " + o3.getPrice());

                if(randomWorker == 1){
                    System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);

                }else{
                    System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
                }
                break;
        }
    }


    @Override
    public void randomTime(int randomTimeTakeWaiter) {
        if (randomTimeTakeWaiter > 15) {
            System.out.println("Waiter took too long so the customers left");
            System.out.println(randomTimeTakeWaiter + " minutes waisted");
        } else {
            if (randomTimeTakeWaiter <= 5) {
                System.out.println("Waiter came really quickly and customers were pleasantly surprised");
            }
        }
    }

    @Override
    public void Experienced(int happy) {
        System.out.println("Customer was served by an experienced worker! Satisfaction:" + happy);
    }

    @Override
    public void Noob(int sad) {
        System.out.println("Customer was consulted by a new worker! Satisfaction:" + sad);
    }
}
