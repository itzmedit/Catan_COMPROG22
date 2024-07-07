import java.io.*;

/* A gray-level image is sometimes stored as a list of int values. 
   The values represent the intensity of light at discrete positions in the image */
//An image may be smoothed by replacing each element with the average of the element's neighboring elements
//Assume that the image is rectangular, that is, all rows have the same number of columns. Use integer arithmetic for this so that the values in smooth are integers
public class ImageSmoother {
  public static void main(String[] args) {
    int[][] image  = {{0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,5,5,5,5,5,5,5,5,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0},
                      {0,0,0,0,0,0,0,0,0,0,0,0}};

    // assume a rectangular image
    int[][] smooth = new int[image.length][image[0].length];
    //Uses integer arithmetic so that the values in smooth are integers
    
    System.out.println("Input: ");
    // Compute the smoothed value for 
    // non-edge locations in the image.

    for (int row = 1 ; row < image.length - 1 ; row++) {
      for (int col = 1 ; col < image[row].length - 1 ; col++) {
        int sum = image[row - 1][col - 1] + image[row - 1][col] + image[row - 1][col + 1] +
          image[row][col - 1] + image[row][col] + image[row][col + 1] +
          image[row + 1][col - 1] + image[row + 1][col] + image[row + 1][col + 1];
          
        smooth[row][col] = sum / 9;
      }
    }
      
    // write out the input
    for (int row = 0 ; row < image.length ; row++) {
      for (int col = 0 ; col < image[row].length ; col++) {
         System.out.print(image[row][col]);
      }
      System.out.println();
    }
    
    System.out.println("\nOutput: ");   
    // write out the result
    for (int row = 0 ; row < smooth.length ; row++) {
      for (int col = 0 ; col < smooth[row].length ; col++) {
         System.out.print(smooth[row][col]);
      }
      System.out.println();
    }
  }
}
