/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caesarcipher;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter text to encrypt: ");
        String plainText = s.nextLine();
        String encryptedText = encrypt(plainText);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);

        s.close();
        
    }
    
    public static String encrypt(String plainText){
        
        StringBuilder encryptedText = new StringBuilder();
        plainText = plainText.toUpperCase();

        for (char ch : plainText.toCharArray()){
            
            if (ch >= 'A' && ch <= 'Z'){
                
                int number = ch - 'A' + 1;
                encryptedText.append(number).append(" ");
                
            }else if (ch == ' '){
                
                encryptedText.append("0 "); 
                
            }
        }

        return encryptedText.toString().trim();
        
    }
  
    public static String decrypt(String encryptedText){
        
        StringBuilder decryptedText = new StringBuilder();
        String[] numbers = encryptedText.split(" ");

        for (String number : numbers){
            
            if (number.equals("0")){
                
                decryptedText.append(" ");
                
            }else{
                
                int num = Integer.parseInt(number);
                char ch = (char) ('A' + num - 1);
                decryptedText.append(ch);
                
            }
        }

        return decryptedText.toString();
        
    }
    
}
