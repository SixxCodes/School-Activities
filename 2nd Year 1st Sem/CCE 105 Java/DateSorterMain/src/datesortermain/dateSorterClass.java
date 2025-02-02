/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datesortermain;

/**
 *
 * @author USER
 */
public class dateSorterClass {
    public void quickSort(String[] arr, int low, int high){
        
        if (low < high){
            
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  
            quickSort(arr, pi + 1, high);
            
        }
    }

    private int partition(String[] arr, int low, int high){
        
        String pivot = arr[high];  
        int i = low - 1;  

        for (int j = low; j < high; j++){
            
            if (arr[j].compareTo(pivot) <= 0){
                
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
        
    }

    public void printArray(String[] arr){
        
        for (String date : arr){
            
            System.out.println(date + " ");
            
        }
        
        System.out.println();
        
    }
}
