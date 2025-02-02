/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashing;
import java.util.LinkedList;
/**
 *
 * @author USER
 */
public class Hashing {

    /**
     * @param args the command line arguments
     */
    private final int SIZE;
    private LinkedList<Entry>[] table;

    public Hashing(int size){
        
        SIZE = size;
        table = new LinkedList[SIZE];
        
        for (int i = 0; i < SIZE; i++){
            
            table[i] = new LinkedList<>();
            
        }
    }

    class Entry{
        
        String key;
        int value;

        public Entry(String key, int value){
            
            this.key = key;
            this.value = value;
            
        }

        public String toString(){
            
            return key + " => " + value;
            
        }
    }
   
    private int getHash(String key){
        
        return Math.abs(key.hashCode()) % SIZE;
        
    }
   
    public void insert(String key, int value){
        
        int index = getHash(key);
        table[index].add(new Entry(key, value));
        
    }

    public int get(String key){
        
        int index = getHash(key);
        
        for (Entry entry : table[index]){
            if (entry.key.equals(key)){
                
                return entry.value;
                
            }
        }
        
        return -1; 
        
    }

    public void display(){
        
        for (int i = 0; i < SIZE; i++){
            
            System.out.println("Index " + i + ": " + table[i]);
            
        }
    }

    public static void main(String[] args){
        
        Hashing ht = new Hashing(10);
        ht.insert("apple", 100);
        ht.insert("banana", 200);
        ht.insert("grape", 300);

        ht.display();

        System.out.println("Value for 'banana': " + ht.get("banana"));
        
    }
}

