/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity3;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Activity3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter value 1:");
        int value1 = input.nextInt ();
        System.out.println("Enter value 2:");
        int value2 = input.nextInt ();
        
        int sum = value1 + value2;
        System.out.println("The sum is " + sum + ".");
        
        int diff = value1 - value2;
        System.out.println("The difference is " + diff + ".");
        
        int product = value1 * value2;
        System.out.println("The product is " + product + ".");
        
        int quotient = value1 / value2;
        System.out.println("The quotient is " + quotient + ".");
        
        int average = value1 + value2 /2;
        System.out.println("The average is " + average + ".");
    }
}
