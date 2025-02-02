/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayparitymain;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ArrayParityMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        arrayParityClass sort = new arrayParityClass();
        
        
        say("***ARRAY PARITY REARRANGER***\n\n");
        say("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        says("Enter " + n + " elements:");
        for (int i = 0; i < n; i++){
            
            say("Array " + (i + 1) + ": ");
            arr[i] = s.nextInt();
            
        }

        says("\n***RESULTS***\n");
        says("Original array:");
        sort.printArray(arr);

        sort.rearrangeArrayByParity(arr);

        says("\nRearranged array by parity (even numbers first):");
        sort.printArray(arr);

        s.close();
        
    }

    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
