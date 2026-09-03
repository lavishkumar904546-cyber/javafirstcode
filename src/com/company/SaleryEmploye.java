package com.company;
class Employe {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SaleryEmploye {
    public static void main(String[] args) {

        Employe lavlin = new Employe();

        lavlin.setName("lavlin kumar");
        System.out.println(lavlin.getName());

        lavlin.salary = 23;
        System.out.println(lavlin.getSalary());
    }
}