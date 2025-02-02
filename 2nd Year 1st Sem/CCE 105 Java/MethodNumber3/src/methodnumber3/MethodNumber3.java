/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodnumber3;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MethodNumber3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        says("***Substring Generator***\n"); //title

        say("Enter a string: ");
        String string = s.nextLine(); //ngayo any string

        say("\nEnter the start index: ");
        int start = s.nextInt(); //ngayo ug number nga mukuha sa start sa string

        say("Enter the end index: ");
        int end = s.nextInt(); //ngayo ug number nga mukuha sa end sa string

        String result = produceSubstring(string, start, end);
        says("\nThe substring is: " + result); //result

        s.close();
        
    }

    public static String produceSubstring(String string, int start, int end){
        
        if (string == null){    
            
            return "Invalid!";
            
        }else if(start < 0){
            
            return "Invalid!";
            
        }else if(end > string.length()){
            
            return "Invalid!";
                
        }else if(start > end){
            
            return "Invalid!";
            
        }else{

            String substring = ""; //naa ni sa gawas para magamit sa return and kani nga variable

            for (int i = start; i < end; i++){
            
                substring += string.charAt(i);
            
            }

            return substring;
        
        }
        
    }
    
     static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}

