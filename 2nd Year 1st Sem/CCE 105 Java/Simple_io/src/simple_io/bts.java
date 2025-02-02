/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simple_io;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class bts {
    private String name;
    private int idNumber;
    private int yearLevel;

    //constructor
    public bts(String name, int idNumber, int yearLevel){
        
        this.name = name;
        this.idNumber = idNumber;
        this.yearLevel = yearLevel;
        
    }
    
    public static bts himoStudent(){
        
        Scanner scanner = new Scanner(System.in);

        say("Enter student's name: ");
        String name = scanner.nextLine();

        say("Enter student's ID number: ");
        int idNumber = scanner.nextInt();

        say("Enter student's year level: ");
        int yearLevel = scanner.nextInt();
        scanner.nextLine(); 
        say("\n");
        
        return new bts(name, idNumber, yearLevel);
        
    }
    
    public String getYearLevelAsString(){
        
        String sumpayYear;
        switch (yearLevel){
            case 1: sumpayYear = "st"; break;
            case 2: sumpayYear = "nd"; break;
            case 3: sumpayYear = "rd"; break;
            default: sumpayYear = "th"; break;
            
        }
        
        return yearLevel + sumpayYear + " year";
        
    }
    
    public String toString(){
        
        return "Name: " + name + "\n" +
               "ID Number: " + idNumber + "\n" +
               "Year Level: " + getYearLevelAsString() + "\n";
        
    }
    
    static void say(String word){
        System.out.print(word);
    }
    
}
