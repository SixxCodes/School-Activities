/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medianmain;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MedianMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        medianClass sort = new medianClass();
        
        says("***Median Finder***\n");
        
        say("Enter the number of elements in the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        says("Enter the elements of the array:");
        
        for (int i = 0; i < n; i++){
            
            say("Array " + (i + 1) + ": ");
            arr[i] = s.nextInt();
            
        }

        says("\n***RESULTS***");
        says("Original array:");
        sort.printArray(arr);

        sort.quickSort(arr, 0, arr.length - 1);

        says("Sorted array:");
        sort.printArray(arr);

        double median = sort.findMedian(arr);
        says("\nMedian: " + median);

        s.close();
        
    }
    
    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
    
}
