package Employees;

public class ExperiencedWorker extends Worker{
    public void Experienced(){
        System.out.println("Customer was served by an experienced worker");
    }

    public int getSalary(){
        return  12 * 2400;

    }
    public int getShift(){
        return 240 * 12;
    }
}
