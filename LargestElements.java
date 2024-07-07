import java.io.*;

//This program computes and prints the largest element in each row
public class LargestElements {
   public static void main(String[] args) {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    //Computes the largest element in each row
    for (int row = 0 ; row < data.length ; row++) { 
      int max = 0;
      for (int col = 0 ; col < data[row].length ; col++) {
         max = max > data[row][col] ? max : data[row][col];
      }
      
      int rowNum = row + 1; 
      //Prints the largest element in each row
      System.out.println("The largest element in row " + rowNum + " is " + max); 
    }
  }
}      