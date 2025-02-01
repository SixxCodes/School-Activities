/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excercise6;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Excercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many weeks to be computed: ");
        int weeks = s.nextInt();

        double[][] temp = new double[weeks][7];

        //butang temp for each week
        for (int w = 0; w < weeks; w++) {
            
            System.out.println("\nEnter Temperature in Week # " + (w + 1) + ":");
            
            for (int d = 0; d < 7; d++) {
                
                System.out.print("Day " + (d + 1) + ": ");
                temp[w][d] = s.nextDouble();

                //temperature range only 0-50 dapat
                while (temp[w][d] < 0 || temp[w][d] > 50) {
                    System.out.println("Invalid temperature! Temperature should be between 0 and 50.");
                    System.out.print("Day " + (d + 1) + ": ");
                    temp[w][d] = s.nextDouble();
                }
            }
        }

        //Calculate
        for (int wk = 0; wk < weeks; wk++) {
            double weekSum = 0;
            for (int day = 0; day < 7; day++) {
                weekSum += temp[wk][day];
            }

            double weekAve = weekSum / 7;

            System.out.println("\nThe average temperature for Week # " + (wk + 1) + " is: " + weekAve);
        }

        s.close();

    }
    
}
