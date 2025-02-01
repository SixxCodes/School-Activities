/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balloonprankactivity;
import balloonprankactivity.box;
import java.util.Scanner;
import balloonprankactivity.sphere;

/**
 *
 * @author 141776
 */
public class BalloonPrankActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter length of room: ");
        double length =  s.nextDouble();
        
        System.out.print("Enter width of room: ");
        double width = s.nextDouble();
        
        System.out.print("Enter height of room: ");
        double height = s.nextDouble();
        
        System.out.print("Enter a balloon radius (inches): ");
        double balloonRadius = s.nextDouble();
        balloonRadius /= 12.0;
        
        double balloonVolume = sphere.volume(balloonRadius);
        double bedroomVolume = box.volume(length, width, height);
        
        double balloonsRequired = bedroomVolume / balloonVolume;
        System.out.printf("Using balloons of radius %.0f inches,"
                + " you will need %.0f balloons", balloonRadius*12, balloonsRequired);  

    }
    
}
