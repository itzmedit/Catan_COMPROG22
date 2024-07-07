import java.util.Scanner;

//Assume that there is only a first and last name and that they are separated by a single space character
/* The program could be improved by testing if there were indeed more than one name. 
   Test that the value returned from indexOf() is greater than zero. If not, merely echo the input */
public class NameEcho {
   public static void main(String[] args) {
      String name, nameEcho;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your name: "); //asks for user's name
      name = input.nextLine().trim(); //use the trim() method to remove possible leading spaces
      
      System.out.println();
      
      //Writes it back with the first name as entered, and the last name all in capital letters
      if (name.indexOf(" ") > 0) {
         nameEcho = name.substring(name.indexOf(" "));
         name = name.substring(0, name.indexOf(" "));
         name = name.concat(" " + nameEcho.toUpperCase().trim());
      }
      
      System.out.println(name);
   }
}