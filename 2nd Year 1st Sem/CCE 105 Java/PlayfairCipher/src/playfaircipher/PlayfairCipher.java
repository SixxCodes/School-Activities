/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package playfaircipher;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class PlayfairCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        says("***PLAYFAIR CIPHER***\n");
        
        say("Enter the plaintext: ");
        String plaintext = s.nextLine();

        say("Enter the key: ");
        String key = s.nextLine();

        playfair cipher = new playfair(key);

        String ciphertext = cipher.encrypt(plaintext);

        says("\n***RESULTS***");
        says("Plaintext: " + plaintext);
        says("Ciphertext: " + ciphertext);
        says("Decrypted text: " + cipher.decrypt(ciphertext));

        s.close();
        
    }
    
    static void says(String word){
        
        System.out.println(word);
        
    }
    
    static void say(String word){
        
        System.out.print(word);
        
    }
}
