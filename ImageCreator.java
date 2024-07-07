import java.io.*;

/* This program uses no arrays. It is put here because it is useful 
   for use with some of the other programs of this section */
//This program creates a 64 by 64 image as a text file 
//Uses output redirection to send the output to a file
public class ImageCreator {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("image.txt")) {
            /* The image starts out with 8 rows of 64 zeros. Next, the image has 8 rows 
               of 64 eights. Next, the image has 8 rows of 64 sixteens, and so on */
            for (int i = 0 ; i < 8 ; i++) {
                for (int j = 0 ; j < 512 ; j++) {
                    writer.write(String.valueOf(i * 8));
                    //writes one value per line, without spaces or commas
                    writer.write('\n');
                }
            }
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}