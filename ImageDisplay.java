import java.io.*;

//This program displays an image by using characters to represent brightness levels
/* Assume that there are 64 rows and 64 columns in the image. 
   Assume that the integers are in the range 0 to 63 */
public class ImageDisplay {
    public static void main(String[] args) {
        //This program reads in a file that contains one integer per line 
        try (BufferedReader reader = new BufferedReader(new FileReader("image.txt"))) {
            String line;
            int lineLen = 0, len = 8;
            
            //Each integer represents one location in the image
            while ((line = reader.readLine()) != null) {
                int value = Integer.parseInt(line.trim());
                /* Writes out a single character depending on its value. 
                   Don't put extra spaces between characters */
                char character = getCharacterForValue(value);
                System.out.print(character);
                
                lineLen++;
                
                //Start a new line after each row of 64 characters
                if (lineLen % 64 == 0) 
                    System.out.println();
            }
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* This is one place where the switch statement is convenient. 
       To use it, divide the input value by 8 to get the integer for the switch */
    public static char getCharacterForValue(int value) {
        int index = value / 8;
        
        switch (index) {
            case 0:
                return ' ';
            case 1:
                return '.';
            case 2:
                return ',';
            case 3:
                return '-';
            case 4:
                return '+';
            case 5:
                return 'o';
            case 6:
                return 'O';
            default:
                return 'X';
        }
    }
}