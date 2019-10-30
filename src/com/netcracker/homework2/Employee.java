package com.netcracker.homework2;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public double raiseSalary(double percent){
        double raise = 1 + percent/100;
        return (salary * raise);
    }
    public String toString(){
        return "Employee["+"id= "+id+", name= "+getName()+", salary="+salary+"]";
    }
}
