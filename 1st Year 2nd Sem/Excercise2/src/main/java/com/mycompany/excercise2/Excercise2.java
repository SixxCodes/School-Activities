/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excercise2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Excercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mass (kg): ");
        double mass = scanner.nextDouble();

        double energy = massToEnergy(mass);

        System.out.println("Energy (Joules): " + energy);
    }

    private static double massToEnergy(double mass) {
        // Speed of light in m/s
        double speedOfLight = 3.0e8;

        return mass * Math.pow(speedOfLight, 2);    }
}
