/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package closestpairmain;

/**
 *
 * @author USER
 */
public class closestPairClass {
    public void quickSort(int[] arr, int low, int high){
        
        if (low < high){
            
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high); 
        }
    }

    private int partition(int[] arr, int low, int high){
        
        int pivot = arr[high]; 
        int i = low - 1;  
        
        for (int j = low; j < high; j++){
            
            if (arr[j] <= pivot){
                
                i++;
                
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  
    }

    public void findClosestPair(int[] arr){
        
        if (arr.length < 2){
            
            System.out.println("Array needs at least two elements to find a pair.");
            return;
            
        }

        int minDiff = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < arr.length - 1; i++){
            
            int diff = arr[i + 1] - arr[i];
            
            if (diff < minDiff){
                
                minDiff = diff;
                num1 = arr[i];
                num2 = arr[i + 1];
                
            }
        }

        System.out.println("\nThe closest pair is: " + num1 + " and " + num2);
        
    }

    public void printArray(int[] arr){
        
        for (int j : arr) {
            
            System.out.print(j + " ");
            
        }
        
        System.out.println();
        
    }
}
