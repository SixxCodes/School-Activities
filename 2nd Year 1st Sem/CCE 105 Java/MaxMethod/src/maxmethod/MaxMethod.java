/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxmethod;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MaxMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        says("Enter 2 numbers to compare which is the maximum number! \n");
        
        say("Enter 1st number: ");
        int n1 = s.nextInt();
        
        say("Enter 2nd number: ");
        int n2 = s.nextInt();
        
        int max = whereMax(n1, n2);
        
        says("\nThe maximum number between " + n1 + " and " + n2 + " is " + max + "!");
        
        s.close();
        
    }
    
    public static int whereMax(int n1, int n2){
        
        if (n1 > n2){
            
            return n1;
            
        }else{
            
            return n2;
          
        }
    }
    
    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
    
    
}
