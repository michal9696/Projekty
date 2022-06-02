package Pakiet1;

class Worker {
    private double salary;
    private String name;
    private String surname;
    public Worker(){}
    public void setSalary(double salary){
        this.salary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public Worker(double salary,String name,String surname){
        this.salary=salary;
        this.name=name;
        this.surname=surname;
    }
}

public class TworzenieObiektow {
    public static void main(String [] args){
        Worker wor=new Worker();
        Worker wor2=new Worker(10000,"Michal","Francuz");
        wor2.setSalary(15000.15);
        wor2.setName("Michael");
        wor2.setSurname("French");
        System.out.println(wor2.getSalary()+"\n"+wor2.getName()+"\n"+wor2.getSurname());
    }
}
