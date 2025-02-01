/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity9;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Activity9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //enter matrix dimensions
        System.out.println("Enter the number of rows of matrix ");
        int rows = s.nextInt();

        System.out.println("Enter the number of columns of matrix ");
        int columns = s.nextInt();

        //enter first na matrix
        System.out.println("Input elements of first matrix ");
        int[][] matrix1 = readMatrix(rows, columns, s);

        //enter second na matrix
        System.out.println("Enter the elements of second matrix ");
        int[][] matrix2 = readMatrix(rows, columns, s);

        //add tanan
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        //display
        System.out.println("Sum of the matrices:-");
        displayMatrix(resultMatrix);

        s.close();
    }

    public static int[][] readMatrix(int rows, int columns, Scanner scanner){
        
        int[][] matrix = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                matrix[i][j] = scanner.nextInt();
                
            }
            
        }
        
        return matrix;
        
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < columns; j++) {
                
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                
            }
            
        }

        return resultMatrix;
        
    }

    //display na
    public static void displayMatrix(int[][] matrix) {
        
        for (int[] row : matrix) {
            
            for (int element : row) {
                
                System.out.print(element + " ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
