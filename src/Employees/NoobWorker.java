package Employees;

public class NoobWorker extends Worker{

    public void NoobWorkers(){
        System.out.println("Customer was served by a new worker");

    }
    public int getSalary(){
        return 12 * 1200;
    }
    public int getShift(){
        return 120 * 12;
    }
}
