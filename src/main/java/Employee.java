/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

/**
 *
 * @author Yusuf
 */
public class Employee {
    private int id, salary;
    private String name;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int amount){
        this.salary = amount;
    }

    public void printInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public int getSalary(){
        return salary;
    }

}
