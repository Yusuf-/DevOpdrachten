/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java;

import java.util.Comparator;

/**
 *
 * @author Yusuf
 */
class SalaryComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2){
        int salary1 = e1.getSalary();
        int salary2 = e2.getSalary();

        if(salary1 < salary2){
            return -1;
        }
        else if(salary1 > salary2){
            return 1;
        }
        else{
            return 0;
        }
    }
}