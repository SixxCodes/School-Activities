/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.excercise1;

/**
 *
 * @author USER
 */
public class Excercise1 {

    public static void main(String[] args) {
        printVerse("right foot");
        printVerse("left foot");
        printVerse("right hand");
        printVerse("left hand");
        printVerse("nose");
        printVerse("backside");
        printVerse("head");
        printVerse("wholself");
        
    } 
    /**
     * @param bodyPart, a String.
     */
    public static void printVerse(String bodyPart) {
        System.out.println("You put your " + bodyPart + " in, \n" 
            + "you put your " + bodyPart + " out; \n"
            + "you put your " + bodyPart + " in, \n"
            + "and you shake it all about. \n"
            + "You do the Hokey Pokey, \n"
            + "and you turn yourself around. \n"
            + "That's what it's all about! \n");    }
}
