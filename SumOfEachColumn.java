import java.io.*;

//This program computes and prints the sum of each column of the array
//This problem is much harder than the previous because some rows have more columns than others
/* You can't just reverse the inner and outer loops of the previous program 
   because this will try to access columns that don't exist in some rows */
public class SumOfEachColumn {
  public static void main(String[] args) {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
   
    int colMax = 0;
    
    //Determine how long this array of sums should be
    for (int row = 0 ; row < data.length ; row++) 
      colMax = data[row].length > colMax ? data[row].length : colMax;
      
    int colSum[] = new int[colMax]; //a second 1D array that holds the column sums
    
    /* Iterate over the array as before adding each array element 
       to the appropriate sum as it is encountered */
    for (int row = 0 ; row < data.length ; row++) {
      for (int col = 0 ; col < data[row].length ; col++) 
         colSum[col] += data[row][col]; 
    }
    
    for (int sum = 0 ; sum < colMax ; sum++) {
        int col = sum + 1; 
        System.out.println("Sum of column " + col + " is " + colSum[sum]);
    }
  }
}      