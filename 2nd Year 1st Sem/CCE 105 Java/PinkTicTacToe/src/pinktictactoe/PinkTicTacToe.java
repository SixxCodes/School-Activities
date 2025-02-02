/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pinktictactoe;
import javax.swing.*;
import java.awt.*;    //para sa gui chuchu
import java.awt.event.*; //para sa pag tuplok tuplok
/**
 *
 * @author USER
 */
public class PinkTicTacToe {

    //global variables
    private static final int sukod = 3; //size sa board
    private static JButton[][] buttons = new JButton[sukod][sukod]; //2d array for buttons, nakabase sa size var
    
    private static boolean whoTurn = true; //para ma-track ka kinsang turn
    
    private static JLabel turnLabel; //label kakinsang turn
    private static JLabel xDaogs; //label wins sa x
    private static JLabel oDaogs; //label wins sa o
    private static int xWins = 0; //ihap wins sa x
    private static int oWins = 0; //ihap wins sa o
    
    private static JPanel cards; // Panel card
    private static JPanel menuPanel; // Panel main menu
    private static JPanel gamePanel; // Panel Tic Tac Toe game
    
    /*
    to dos:
    1. main
    2. menu panel
    3. game panel
    4. action listeners
    */

    public static void main(String[] args){
        
        JFrame frame = new JFrame("Tiktaktu ni Maddy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        cards = new JPanel(new CardLayout());

        menuPanel = createMenuPanel();
        cards.add(menuPanel, "Menu");

        gamePanel = createGamePanel();
        cards.add(gamePanel, "Game");

        frame.add(cards, BorderLayout.CENTER);
        frame.setVisible(true);
        
    }

    private static JPanel createMenuPanel(){
        
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new BorderLayout());
        menuPanel.setBackground(Color.PINK);

        JButton playButton = new JButton("Play");
        playButton.addActionListener(e -> showGamePanel());
        playButton.setFont(new Font("Helvetica", Font.BOLD, 60)); //font
        playButton.setBackground(Color.PINK);
        menuPanel.add(playButton, BorderLayout.CENTER);

        JButton quitButton = new JButton("Quit");
        quitButton.setFont(new Font("Helvetica", Font.PLAIN, 25)); //font
        quitButton.setBackground(Color.PINK);
        quitButton.addActionListener(e -> System.exit(0));
        menuPanel.add(quitButton, BorderLayout.SOUTH);

        return menuPanel;
        
    }

    private static JPanel createGamePanel(){
        
        JPanel gamePanel = new JPanel(new BorderLayout());

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(sukod, sukod));

        //add buttons sa grid
        for (int i = 0; i < sukod; i++){
            
            for (int j = 0; j < sukod; j++){
                
                buttons[i][j] = new JButton(); //new button
                buttons[i][j].setFont(new Font("Helvetica", Font.BOLD, 60)); //font
                buttons[i][j].setBackground(Color.PINK);
                buttons[i][j].addActionListener(new ButtonClickListener());
                gridPanel.add(buttons[i][j]);
                
            }
        }

        //labels: turns
        turnLabel = new JLabel("X's Turn", SwingConstants.CENTER);//label
        turnLabel.setFont(new Font("Arial", Font.PLAIN, 20));//font
        turnLabel.setOpaque(true);
        turnLabel.setBackground(Color.LIGHT_GRAY);//kulur

        //labels: wins ni x
        xDaogs = new JLabel("X Wins: 0", SwingConstants.LEFT);//label
        xDaogs.setFont(new Font("Arial", Font.PLAIN, 18));//font
        xDaogs.setOpaque(true);
        xDaogs.setBackground(Color.LIGHT_GRAY);//kulur

        //labels: wins ni o
        oDaogs = new JLabel("O Wins: 0", SwingConstants.RIGHT);//label
        oDaogs.setFont(new Font("Arial", Font.PLAIN, 18));//font
        oDaogs.setOpaque(true);
        oDaogs.setBackground(Color.LIGHT_GRAY);//kulur

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(turnLabel, BorderLayout.NORTH);
        topPanel.add(xDaogs, BorderLayout.WEST);
        topPanel.add(oDaogs, BorderLayout.EAST);

        gamePanel.add(topPanel, BorderLayout.NORTH);
        gamePanel.add(gridPanel, BorderLayout.CENTER);

        return gamePanel; // Return the game panel
        
    }

    private static void showGamePanel(){
        
        CardLayout cl = (CardLayout) cards.getLayout();
        cl.show(cards, "Game");
        
    }

    //buttons
    static class ButtonClickListener implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            JButton buttonClicked = (JButton) e.getSource();

            if (!buttonClicked.getText().equals("")){
                
                return;
                
            }

            buttonClicked.setText(whoTurn ? "X" : "O");
            whoTurn = !whoTurn;
            updateTurnLabel();

            //win/draw ni sya
            if (checkForWin()){
                
                String winner = whoTurn ? "O" : "X";
                JOptionPane.showMessageDialog(null, winner + " wins!");
                
                if (winner.equals("X")){
                    
                    //x++
                    xWins++;
                    xDaogs.setText("X Wins: " + xWins);
                    
                }else{
                    
                    //o++
                    oWins++;
                    oDaogs.setText("O Wins: " + oWins);
                    
                }
                
                resetBoard();//reset para new
                
            }else if(tabla()){
                
                //pag tabla
                JOptionPane.showMessageDialog(null, "It's a draw!");
                resetBoard();//reset
                
            }
        }

        private void updateTurnLabel(){
            
            turnLabel.setText((whoTurn ? "X's Turn" : "O's Turn"));
            
        }

        //sa mismong game, check ug naa nay nadaog
        private boolean checkForWin(){
            
            //check if naay straight ug higda nga linya
            for (int i = 0; i < sukod; i++){
                
                if (buttons[i][0].getText().equals(buttons[i][1].getText()) &&
                    buttons[i][1].getText().equals(buttons[i][2].getText()) &&
                    !buttons[i][0].getText().equals(""))//conditions ni tanan
                    {
                    
                    return true;
                    
                }
                
                if (buttons[0][i].getText().equals(buttons[1][i].getText()) &&
                    buttons[1][i].getText().equals(buttons[2][i].getText()) &&
                    !buttons[0][i].getText().equals(""))//conditions ni tanan
                    {
                    
                    return true;
                    
                }
            }

            //slant
            if (buttons[0][0].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][2].getText()) &&
                !buttons[0][0].getText().equals(""))//conditions ni tanan
                {
                
                return true;
                
            }
            
            if (buttons[0][2].getText().equals(buttons[1][1].getText()) &&
                buttons[1][1].getText().equals(buttons[2][0].getText()) &&
                !buttons[0][2].getText().equals(""))//conditions ni tanan
                {
                
                return true;
                
            }

            return false;
            
        }

        //tabla
        private boolean tabla(){
            
            for (int i = 0; i < sukod; i++){
                
                for (int j = 0; j < sukod; j++){
                    
                    if (buttons[i][j].getText().equals("")){
                        
                        return false;
                        
                    }
                }
            }
            
            return true;
            
        }

        //reset para new game
        private void resetBoard(){
            
            for (int i = 0; i < sukod; i++){
                
                for (int j = 0; j < sukod; j++){
                    
                    buttons[i][j].setText("");//i-clear tanan
                    
                }
            }
            
            //ibalik ang X nga turn kay sya may una
            whoTurn = true;//rest sad ang turn
            updateTurnLabel();
            
        }
    }
}