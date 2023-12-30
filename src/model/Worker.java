package model;

public class
Worker {
    private String name;
    private double salary;// oklad
    private double bones; // prem

    public Worker(String name, double salary, double bones) {
        this.name = name;
        this.salary = salary;
        this.bones = bones;
    }

    public Worker() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBones() {
        return bones;
    }

    public void setBones(double bonus) {
        this.bones = bonus;
    }

    public double generalSalary(){
        double res = 0.0;
        res = salary+bones;
        return res;
    }
  public void  info(){
      System.out.println("имя: " +name+", оклад: " + salary + ", прем: " + bones +", итого");
  }
}
