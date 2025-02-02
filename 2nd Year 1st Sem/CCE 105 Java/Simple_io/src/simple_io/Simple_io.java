/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simple_io;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author USER
 */
public class Simple_io {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = "student.txt";
        PrintWriter pw;
        FileWriter fw;
        BufferedReader br;
        FileReader fr;

        //pila ka students ang butngan ug record
        say("How many students? ");
        int manyStud = s.nextInt();
        s.nextLine();

        //if-else para dli below 1
        if (manyStud >= 1){

            try{
                
                fw = new FileWriter(filename);
                pw = new PrintWriter(fw);

                //for loop ug daghan students
                for (int i = 1; i <= manyStud; i++){
                    
                    says("\nEnter details for student " + i + ":");
                    
                    bts student = bts.himoStudent();

                    //print sa file
                    pw.println("Student " + i + "'s details: ");
                    pw.print(student);
                    pw.println();
                    
                }
                //close ang pw
                pw.close();

                fr = new FileReader(filename);
                br = new BufferedReader(fr);

                says("\nReadings from " + filename + ":\n");
                
                /*para sa br.readLine, dli balik2on ug type labi nag daghan studs
                as long as naay sulod ang br.readline(!=null), mag-print sya sa hantod2
                ug br.readline
                */
                String line;
                while((line = br.readLine()) != null){
                    System.out.println(line);
                }

                //forda estetik
                say("\nLoading");
                for(int i = 0; i < 5; i++){
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.err.println("The loading process was interrupted.");
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    say(".");
                }
                says("");

                says("\nSuccess! Student records have been written to " + filename);
                br.close();
                fw.close();

            }catch(IOException e){
                
                System.err.println("File IO error: Exception thrown");
                e.printStackTrace();
                 
            }

        }else{
            says("\nInvalid Input!\nShould be 1 and above!");
        }
        
        s.close();
        
    }
    
    //para dli hasol sige type ug System.out.print(ln)
    static void says(String word){
        System.out.println(word);
    }
    static void say(String word){
        System.out.print(word);
    }
    
}
