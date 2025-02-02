/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayparitymain;

/**
 *
 * @author USER
 */
public class arrayParityClass {
    public void rearrangeArrayByParity(int[] arr){
        
        int[] tempArr = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;

        for (int num : arr){
            
            if (num % 2 == 0){
                
                tempArr[evenIndex++] = num;
                
            }else{
                
                tempArr[oddIndex--] = num;
                
            }
        }

        for (int i = 0; i < arr.length; i++){
            
            arr[i] = tempArr[i];
            
        }
    }

    public void printArray(int[] arr){
        
        for (int j : arr){
            
            System.out.print(j + " ");
            
        }
        
        System.out.println();
        
    }
}
