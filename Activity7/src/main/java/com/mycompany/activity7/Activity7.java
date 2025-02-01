/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity7;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Activity7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
   
        System.out.print("Enter 1st number: ");
        int pers = s.nextInt();
   
        System.out.print("Enter 2nd number: ");
        int sekan = s.nextInt();
   
        System.out.print("Enter 3rd number: ");
        int turd = s.nextInt();
   
        //greatest
        if (pers > sekan)
          if (pers > turd)
            System.out.println("The greatest is: " + pers);
   
        if (sekan > pers)
          if (sekan > turd)
            System.out.println("The greatest is: " + sekan);
   
        if (turd > pers)
          if (turd > sekan)
            System.out.println("The greatest is: " + turd);
        
        
        //lowest
        if (pers < sekan)
          if (pers < turd)
            System.out.println("The lowest is: " + pers);
   
        if (sekan < pers)
          if (sekan < turd)
            System.out.println("The lowest is: " + sekan);
   
        if (turd < pers)
          if (turd < sekan)
            System.out.println("The lowest is: " + turd);
    }
}
