/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minheapexample;
import java.util.PriorityQueue;
/**
 *
 * @author USER
 */
public class MinHeapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(15);
        
        System.out.println("Min-Heap elements: " + minHeap);
        System.out.println("Smallest element (peek): " + minHeap.peek());
        System.out.println("Polling elements from Min-Heap in sorted order:");
        
        while (!minHeap.isEmpty()){
            
            System.out.println(minHeap.poll());  
            
        }
    }
}
