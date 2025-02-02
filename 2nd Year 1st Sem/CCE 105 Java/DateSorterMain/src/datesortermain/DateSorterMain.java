/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datesortermain;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class DateSorterMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        dateSorterClass sort = new dateSorterClass();
        
        says("***DATE SORTER***\n");
        say("Enter the number of dates: ");
        int n = s.nextInt();
        s.nextLine(); 

        String[] dates = new String[n];

        says("Enter " + n + " dates in YYYY-MM-DD format:");
        
        for (int i = 0; i < n; i++){
            
            say((i + 1) + ". ");
            dates[i] = s.nextLine();
            
        }
        
        says("\n***RESULTS***\n");
        says("Original array of dates:");
        sort.printArray(dates);

        sort.quickSort(dates, 0, dates.length - 1);

        says("\nSorted array of dates:");
        sort.printArray(dates);

        s.close();
        
    }

    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
