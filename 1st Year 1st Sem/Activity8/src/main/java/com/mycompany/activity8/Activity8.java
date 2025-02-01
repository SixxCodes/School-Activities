/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity8;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Activity8 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        //mangayo ug pila ka loop
        System.out.print("Enter Loop Value: ");
        int loop = s.nextInt();
        System.out.print("\n");
        
        //array nga ang length is nakadependde sa gihatag nga loop
        int[] nums = new int[loop];
        
        //loop para sa pa-input ug numbers
        for (int index = 0; index<loop; index++){
            
            System.out.print("Enter number #" + (index  + 1) + ": ");
            nums[index] = s.nextInt();
        }
        
        //para sa sum and avg
        int sum = 0;
        double average = 0;
        
        for (int num : nums){
            
            sum += num;
            average = (double) sum / loop;
            
        }
        
        System.out.println();
        System.out.println("The sum of inputted value is: " + sum );
        System.out.println("The average is: " + average );    }
}
