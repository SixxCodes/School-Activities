/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tocharmethod;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ToCharMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        says("Enter any word and the program will turn it into character arrays!\n");
        String anyWord = s.nextLine();
        
        char c_a[] = toCharMethod(anyWord);
        
        says("\nResult: \n");
        
        for (int i = 0; i < c_a.length; i++) {
            says((i+1) + ": " + c_a[i]);
        }

        
        s.close();
    }
    
    public static char[] toCharMethod(String string){
        
        char charArray[] = new char[string.length()];
        
        for (int i = 0; i < string.length(); i++){
            
            charArray[i] = string.charAt(i);
            
        }

        return charArray;
        
    }
    
    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
