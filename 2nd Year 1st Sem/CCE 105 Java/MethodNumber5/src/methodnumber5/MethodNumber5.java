/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodnumber5;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MethodNumber5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String userArray[] = fordaArray(s);

        System.out.println("\nContents of all the entered array:");
        fordaPrintArray(userArray);

        s.close();
        
    }
    
    public static void fordaPrintArray(String[] array) {
        
        if (array == null){
            
            says("The array is null.");
            
            return;
            
        }

        // Print each element of the array
        for (int i = 0; i < array.length; i++){
            
            says((i+1) + ": " + array[i]);
            
        }
    }

    public static String[] fordaArray(Scanner scanner){
        
        say("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        scanner.nextLine();
        
        String[] array = new String[size];
        
        says("Enter " + size + " strings:");
        
        for (int i = 0; i < size; i++){
            
            array[i] = scanner.nextLine();
            
        }
        
        return array;
        
    }

    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
