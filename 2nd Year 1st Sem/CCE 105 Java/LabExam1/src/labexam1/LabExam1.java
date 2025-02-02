/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexam1;
import java.util.*;
/**
 *
 * @author USER
 */
public class LabExam1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Employee_Class> employees = new ArrayList<>();

        says("***EMPLOYEE RANKER***\n");
        say("How many employees do you have: ");
        int pilaEmployees = s.nextInt();
        s.nextLine(); 
        
        for (int i = 1; i <= pilaEmployees; i++){
            
            String suffix = null;
            
            suffix = switch (i){
                
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
                    
            };
            
            says("\nDetails of the " + i + suffix + " employee:");
            
            say("Name: ");
            String name = s.nextLine();
            
            say("Score: ");
            int score = s.nextInt();
            
            say("Salary: ");
            double salary = s.nextDouble();
            s.nextLine();

            employees.add(new Employee_Class(name, score, salary));
            
        }
        
        System.out.print("\nSorting");
        for (int i = 0; i < 6; i++){
            
            try{
                
                Thread.sleep(1000);
                
            }catch(InterruptedException e){
                
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted.");
                
            }
            
            System.out.print(".");
            
        }
        
        System.out.println("\nSorting complete.");

        Collections.sort(employees, new Comparator<Employee_Class>(){
            @Override
            
            public int compare(Employee_Class e1, Employee_Class e2){
                
                if (e2.performanceScore != e1.performanceScore){
                    
                    return Integer.compare(e2.performanceScore, e1.performanceScore);
                    
                }
                
                return Double.compare(e2.salary, e1.salary);
                
            }
        });

            says("\n***SORTED EMPLOYEES***");
        for (Employee_Class employee : employees){
            
            says(""+employee);
            
        }

        s.close();
        
    }
    
    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
