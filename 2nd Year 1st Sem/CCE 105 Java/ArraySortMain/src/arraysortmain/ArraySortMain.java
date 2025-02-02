/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysortmain;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ArraySortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        arraySortClass sort = new arraySortClass();
        
        says("***ARRAY LENGTH SORTER***");
            
        say("\nEnter the number of strings: ");
        int n = s.nextInt();
        s.nextLine();

        String[] arr = new String[n];

        says("Enter the strings:");
        for (int i = 0; i < n; i++){
            
            say("Array " + (i + 1) + ": ");
            arr[i] = s.nextLine();
            
        }

        says("\n***RESULTS***");
        says("\nOriginal array:");
        sort.printArray(arr);

        sort.quickSort(arr, 0, arr.length - 1);

        says("\nSorted array by length:");
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
