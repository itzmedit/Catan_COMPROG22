import java.io.*;
import java.util.Scanner;

//A program that reads in lines and outputs only those lines that start with "//"
//When a Java source file is used as input the program will echo lines that describe the program
//You can scan in a line and test its length
public class DocumentationPrinter {
   public static void main(String[] args) throws IOException {
      
      File myFile = new File("Z:\\MM107\\Chapter44Exercise5SampleFile.txt");

      //Use a Scanner and nextLine() for input
      Scanner input = new Scanner(myFile);
      String line = input.nextLine().trim();
      
      int space = 0;
       
      //The while loop of the program uses hasNextLine() to decide if it should continue
      while (input.hasNextLine()) {
         boolean noComment = true;
      
         for (int n = 0 ; n < line.length() ; n++) {
            switch (line.charAt(n)) {
               case '/' : 
                  if (n != line.length()-1) {
                     if (line.charAt(n+1) == '/') {
                        System.out.println(line.substring(line.indexOf('/'), line.length()));
                        noComment = false;
                        space = 0;
                     }
                  }
               break;
            }  
         }
         
         if (noComment) {
               space++;
               if (space == 1)
                  System.out.println();         
         }   
            
         line = input.nextLine().trim();
      }
   }
}