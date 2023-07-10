// We have an array of integers given in a non-decreasing order. We have to return an array which consists of the squares of each of the numbers in the ascending order 
// So traverse through the array and then return the square of all the elements

import java.util.*;
import java.io.*;

class SquareSort {
    public static void sortedSquares(int[] nums) {

        // This variable will contain the squared value
        // int squared = 0;

        // Iterating the array
        for (int i = 0; i < nums.length; i++) 
            //Squaring each element
            //Storing that value in the array
            nums[i] = nums[i] * nums[i];
            Arrays.sort(nums);
        

        // Sorting the array
       
       
    }

    public static void main(String[] args) {
        int[] nums = { -6, -3, -1, 2, -4, 5 };
        sortedSquares(nums);
        // System.out.println("");
        System.out.println("After Sort: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    
        
    }
}