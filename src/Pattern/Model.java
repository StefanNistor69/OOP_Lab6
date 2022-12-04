package Pattern;

import Employees.ExperiencedWorker;
import Employees.NoobWorker;
import Client.Gamer;
import Client.OfficeWorker;
import PC.*;


import java.util.Random;
import java.util.Scanner;
public class Model implements ModelInterface{


    @Override
    public int randomGaming(Random rand) {
        return rand.nextInt(3) + 1;
    }

    @Override
    public int randomOffice(Random rand) {
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




    @Override
    public float Discount() {
        return 0.25F;
    }

    public int randomWorker(Random rand){
        return rand.nextInt(3 + 1);
    }
    public int randomDiscount(Random rand){
        return rand.nextInt(3 + 1);
    }

    @Override
    public double AssembleGamingPC(Gaming_Model1 g1, Gaming_Model2 g2, Gaming_Model3 g3, int randomGaming, double profit) {
        switch(randomGaming){
            case 1:
                profit += g1.getPrice();
                break;
            case 2:
                profit += g2.getPrice();
                break;
            case 3:
                profit += g3.getPrice();
                break;






        }
        return profit;

    }

    @Override
    public double AssembleOfficePC(Office_Model1 o1, Office_Model2 o2, Office_Model3 o3, int randomOffice, double profit) {
        switch(randomOffice){
            case 1:
                profit += o1.getPrice();
                break;
            case 2:
                profit += o2.getPrice();
                break;
            case 3:
                profit += o3.getPrice();
                break;
        }
        return profit;
    }

    public int Score(){

        return 0;
    }

}
