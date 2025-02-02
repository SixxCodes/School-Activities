/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guipractice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author USER
 */
public class GUIPractice implements ActionListener{

    private static JFrame frame;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passLabel;
    private static  JPasswordField passText;
    private static JLabel mess;
            
    public static void main(String[] args){
        
        frame = new JFrame("Madayag GUI");
        frame.setSize(350,210);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        
        userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 50, 80, 25);
        panel.add(passLabel);
        
        passText = new JPasswordField();
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);
        
        JButton button = new JButton("LogIn");
        button.setBounds(200, 120, 100, 25);
        button.addActionListener(new GUIPractice());
        panel.add(button);
        
        mess = new JLabel("");
        mess.setBounds(200,100,70,25);
        panel.add(mess);
        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();
        says("You typed:\n" + user + ", " + password);
        
        if(user.equals("Zoida") && password.equals("zoida123")){
            mess.setText("Success!");
        }else if(user.equals("") && password.equals("")){
            mess.setText("");
            says("Hint:\nThe User should be \"Zoida\" \nThe password shoulde be \"zoida123\"");
        }else{
            mess.setText("LogIn Failed!");
            says("Hint:\nThe User should be \"Zoida\" \nThe password shoulde be \"zoida123\"");
        }
        
    }
    
    static void says(String word){
        System.out.println(word);
    }
}

