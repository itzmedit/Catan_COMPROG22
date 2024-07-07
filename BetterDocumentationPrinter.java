import java.io.*;
import java.util.Scanner;

//A program that reads in a source file and outputs only some lines
//Note: This program has a major design flaw because in Java comments may start with "/*" anywhere in a line and may end with "*/" 
//      anywhere in a line. Our program (as described) will miss these situations.
/* A better program outputs comments no matter where they begin and end. 
   If you decide to do this, study the String documentation for useful methods. 
   indexOf() comined with substring()would be especially useful */
public class BetterDocumentationPrinter {
   public static void main(String[] args) throws IOException {
      
      File myFile = new File("Z:\\MM107\\Chapter44Exercise5SampleFile.txt");

      Scanner input = new Scanner(myFile);
      String line = input.nextLine().trim();
      
      int space = 0, strtLn = 0, endLn = 0;
      boolean bol = false;
   
      while (input.hasNextLine()) {
         boolean noComment = true;
      
         for (int n = 0 ; n < line.length() ; n++) {
            switch (line.charAt(n)) {
               case '/' : 
                  if (n != line.length()-1) {
                     if (line.charAt(n+1) == '/') { //lines that start with "//" are output
                        System.out.println(line.substring(line.indexOf('/'), line.length()));
                        noComment = false;
                        space = 0;
                     }
                     else if (line.charAt(n+1) == '*') 
                        bol = true; //use a boolean variable that is set to true when "/*" is encountered
                  }
               break;
            }
         }
         
         //All lines between those that start with "/*" and "*/" are output  
         //Output lines when the variable is true    
         if (bol) {
            if (line.startsWith("/*")) { //lines that start with "//" are output
               System.out.println(line.substring(line.indexOf("/*")));
               noComment = false;
               }
            else if (line.endsWith("*/")) { //lines that start with "*/" are output
               System.out.println("   " + line.substring(0, line.indexOf("*/")+2));
               noComment = false;
               bol = false; //use a boolean variable that is set to false when "*/" is encountered
            }
            else {
               System.out.println("   " + line.substring(0,line.length()));
               noComment = false;
               
            }
            
         space = 0;
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