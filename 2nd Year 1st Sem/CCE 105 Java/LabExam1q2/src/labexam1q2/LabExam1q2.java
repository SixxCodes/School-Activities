/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labexam1q2;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class LabExam1q2 {

    /**
     * @param args the command line arguments
     */
    public static int sunod(int[] nums, int[] longestSequence){
        
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int longest = 1;
        int now = 1;
        int index = 0;

        int currentStartIndex = 0; 

        for (int i = 1; i < nums.length; i++){
            
            if (nums[i] == nums[i - 1]) continue;
            
            if (nums[i] == nums[i - 1] + 1){
                now++;
                
                if (now == 2){
                    
                    longestSequence[0] = nums[currentStartIndex];
                    longestSequence[1] = nums[i]; 
                    index = 2; 
                    
                }else{
                    
                    longestSequence[index++] = nums[i];
                    
                }
                
            }else{
                
                longest = Math.max(longest, now);
                now = 1; 
                currentStartIndex = i;
                index = 0;
                
            }
        }

        longest = Math.max(longest, now);
        
        if (now > 1){
            
            System.arraycopy(nums, currentStartIndex, longestSequence, 0, now);
            
        }

        return longest;
        
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        says("***CONSECUTIVE SEQUENCE COUNTER***");
        says("\nEnter integers separated by spaces:");
        String butang = s.nextLine();

        String[] inputStrings = butang.split(" ");
        int[] numbers = new int[inputStrings.length];

        for (int i = 0; i < inputStrings.length; i++){
            
            numbers[i] = Integer.parseInt(inputStrings[i]);
        }
        
        Arrays.sort(numbers);
        says("\nSorted array: " + Arrays.toString(numbers));

        int[] longestSequence = new int[numbers.length];
        int pinakataas = sunod(numbers, longestSequence);

        says("\nLongest consecutive sequence length is " + pinakataas);
        says("\nConsecutive numbers: " + Arrays.toString(Arrays.copyOf(longestSequence, pinakataas)));

        s.close();
        
    }

    static void says(String word){
        
        System.out.println(word);
        
    }
}
