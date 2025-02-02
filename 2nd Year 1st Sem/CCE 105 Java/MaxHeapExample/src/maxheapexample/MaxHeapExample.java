/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxheapexample;
import java.util.PriorityQueue;
import java.util.Collections;
/**
 *
 * @author USER
 */
public class MaxHeapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(15);
        
        System.out.println("Max-Heap elements: " + maxHeap);
        
        System.out.println("Polling elements from Max-Heap:");
        
        while (!maxHeap.isEmpty()){
            
            System.out.println(maxHeap.poll()); 
            
        }
    }
}
