/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercise7;

/**
 *
 * @author USER
 */
public class Excercise7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array string
        String[] my_array = {"bcd","abd","jude","bcd","aiu","gzw","aiu"};

        for (int i = 0; i < my_array.length-1; i++){
            
            for (int j = i + 1; j < my_array.length; j++){
                
                if ((my_array[i].equals(my_array[j])) && (i != j)) {
                    
                    System.out.println("Duplicate Element is : " + my_array[j]);
                    
                }    
                
            }
            
        }
        
    }
    
}