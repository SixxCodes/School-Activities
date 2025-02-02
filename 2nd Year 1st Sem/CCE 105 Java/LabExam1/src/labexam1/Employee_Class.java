/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labexam1;

/**
 *
 * @author USER
 */
public class Employee_Class {
    String name;
    int performanceScore;
    double salary;

    public Employee_Class(String name, int performanceScore, double salary){
        
        this.name = name;
        this.performanceScore = performanceScore;
        this.salary = salary;
        
    }

    @Override
    public String toString(){
        
        return name + ": \nScore: " + performanceScore + ", Salary: " + salary + "\n";
        
    }
}
