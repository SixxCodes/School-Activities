/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package closestpairmain;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ClosestPairMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        closestPairClass sort = new closestPairClass();

        say("***CLOSEST PAIR FINDER***");
        say("\n\nEnter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        says("Enter " + n + " elements:");
        for (int i = 0; i < n; i++){
            
            say("Array " + (i + 1) + ": ");
            arr[i] = s.nextInt();
            
        }

        says("\n***RESULTS***");
        says("\nOriginal array:");
        sort.printArray(arr);

        sort.quickSort(arr, 0, arr.length - 1);

        says("\nSorted array:");
        sort.printArray(arr);

        sort.findClosestPair(arr);

        s.close();
    }

    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
