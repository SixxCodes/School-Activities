/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity10;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Activity10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = s.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = s.nextInt();

        //arrays para student names ug marks nila
        String[] studentNames = new String[numStudents];
        double[][] marks = new double[numStudents][numSubjects];

        //enter name ug mark para each student and each subject
        for (int i = 0; i < numStudents; i++) {
            
            s.nextLine(); // Consume newline character
            System.out.println("\nEnter student " + (i + 1) + "'s name:");
            studentNames[i] = s.nextLine();

            System.out.println("Enter marks for each subject for student " + studentNames[i] + ":");
            
            for (int j = 0; j < numSubjects; j++) {
                
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = s.nextDouble();
                
            }
        }

        //for calculate
        for (int i = 0; i < numStudents; i++) {
            
            double sum = 0;
            System.out.println("\nStudent Name: " + studentNames[i]);
            
            for (int j = 0; j < numSubjects; j++) {
                
                System.out.println("Subject " + (j + 1) + " Mark: " + marks[i][j]);
                sum += marks[i][j];
                
            }
            
            double average = sum / numSubjects;
            System.out.println("Average Mark: " + average);
            
        }

        // Calculate and print average marks for each subject
        System.out.println("\nAverage marks of all students for each subject:");
        
        for (int j = 0; j < numSubjects; j++) {
            
            double sum = 0;
            for (int i = 0; i < numStudents; i++) {
                sum += marks[i][j];
                
            }
            
            double average = sum / numStudents;
            
            System.out.println("Subject " + (j + 1) + ": " + average);
            
        }
        
    }
    
}
