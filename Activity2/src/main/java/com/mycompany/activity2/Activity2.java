/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Activity2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to Java!");
        System.out.println("What is your name?");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        System.out.println("Nice to meet you " + name + "!!!");
        
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("Ah, I see, you are " + age + " years old and " + age*365 + ("days old."));
        
        System.out.println("How tall are you in centimeters?");
        double height = scan.nextDouble();
        System.out.println("Your height in feet is " + (height*0.0328084) + ".");
    }
}
