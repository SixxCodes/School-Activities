/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package balloonprankactivity;

/**
 *
 * @author USER
 */
public class box {
    private double myLength, myWidth, myHeight;
    public box(double length, double width, double height) {
        myLength = length;
        myWidth = width;
        myHeight = height;
    }
    
    public double volume() {return myLength * myWidth * myHeight; }
    
    public double getLength() {return myLength; }
    public double getWidth() {return myWidth; }
    public double getHeight() {return myHeight; }
    
    public static double volume(double length, double width, double height) {
        return length * width * height;

    }
}
