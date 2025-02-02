/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medianmain;

/**
 *
 * @author USER
 */
public class medianClass {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);  // Sort left subarray
            quickSort(arr, pi + 1, high); // Sort right subarray
        }
    }

    // Partition method for QuickSort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as pivot
        int i = low - 1;  // Index of the smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or the pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;  // Return the partition index
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println(); 
    }

    // Method to find the median of the sorted array
    public static double findMedian(int[] arr) {
        int n = arr.length;
        if (n % 2 == 1) {
            // Odd number of elements, return the middle one
            return arr[n / 2];
        } else {
            // Even number of elements, return the average of the two middle ones
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}
