/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity6;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Activity6 {

    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        
        System.out.print("Input your grade (A-F): ");
        char gradechoice = s.next().charAt(0); 

        switch (gradechoice){

            case 'A':

                System.out.println("Your grade is between 95-100");
                break;

            case 'B':

                System.out.println("Your grade is between 85-89");
                break;

            case 'C':

                System.out.println("Your grade is between 80-84");
                break;

            case 'D':

                System.out.println("Your grade is between 75-79");
                break;

            case 'F':

                System.out.println("Sorry, you failed.");
                break;

        }

        System.out.print("Try Again? [Y/N]: ");
        char again = s.next().charAt(0);
        if (again == 'Y' || again == 'y') 
            main(args);
        else
            System.exit(0);

    }
}
