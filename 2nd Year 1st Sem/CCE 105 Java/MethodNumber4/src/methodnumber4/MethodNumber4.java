/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodnumber4;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MethodNumber4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        says("***Array Equality Checker***\n");

        says("1st array:");
        int[] a1 = arrayMethods(s);

        says("\n2nd array:");
        int[] a2 = arrayMethods(s);

        boolean result = equalOrNot(a1, a2);
        
        if (result==true){
            
        says("\nThe two arrays are equal!");
        
        }else{
            
            says("\nThe two arrays are not equal!");
            
        }
        
        s.close();
    }

    public static boolean equalOrNot(int[] array1, int[] array2) {
        
        if (array1 == null && array2 == null) {
            return true;
        }

        if (array1 == null || array2 == null) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
        
    }

    public static int[] arrayMethods(Scanner scanner){
        
        say("Enter how many elements should be in the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        
            
            
        says("\nEnter " + size + " integers:");
        
        
        for (int z = 0; z < size; z++){
            
            array[z] = scanner.nextInt();
            
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
    
