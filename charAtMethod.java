import java.util.Scanner;

/* A program where the user enters a string, 
   and the program echos it to the monitor with one character per line */
public class charAtMethod {
   public static void main(String[] args) {
      String string;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      string = input.nextLine().trim();
      
      System.out.println();
      
      /* This method returns the character that is at index inx of the String. 
         Characters are indexed beginning at index 0 */
      for (int inx = 0 ; inx < string.length() ; inx++)
         System.out.println(string.charAt(inx));           
   }
}