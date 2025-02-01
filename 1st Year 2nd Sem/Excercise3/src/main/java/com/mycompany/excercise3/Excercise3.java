/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excercise3;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Excercise3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter weight (lb)");
        double kg = s.nextDouble();
        
        System.out.println("Enter height (in)");
        double in = s.nextDouble();
        
        System.out.println("BMI: ");
    }
    public static double getBMI(double kg, double in) {
        return kg / (in * in) * 703;
    }
}
