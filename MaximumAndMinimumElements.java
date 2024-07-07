import java.io.*;

//This program computes the maximum and minimum of the elements in the array
/* This program works even if the dimensions of the rows and columns are changed. 
   Use length rather than hard-coded numbers */
/* Think carefully about how max and min should be initialized. Debug your program 
   by editing the array. Change it in unexpected ways, such as all negative values, 
   or the largest element as the last, or first, or all elements the same */
public class MaximumAndMinimumElements {
   public static void main(String[] args) {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    // declare and initialize the max and the min
    int max = 0, min = 0; 
    
    // compute the max and min
    for (int row = 0 ; row < data.length ; row++) { 
      for (int col = 0 ; col < data[row].length ; col++) {
         max = max > data[row][col] ? max : data[row][col]; 
         min = min < data[row][col] ? min : data[row][col];
      }
    }
      
    // write out the results  
    System.out.println("max = " + max + "\nmin = " + min); 
  }
}      