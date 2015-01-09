/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

/**
 *
 * @author Yusuf
 */
public class Driver {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = (int) (Math.random()*100+1);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;
    String name;

    public static void main(String[] args){
       /* Employee e1, e2, e3, e4;
        e1 = new Employee(1, "Jane", 34500);
        e2 = new Employee(2, "John", 32500);
        e3 = new Employee(3, "Steve", 37550);
        e4 = new Employee(4, "Stacy", 39500);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Collections.sort(employees, new SalaryComparator());

        for(Employee as: employees){
            as.printInfo();
        }*/




    }
}
