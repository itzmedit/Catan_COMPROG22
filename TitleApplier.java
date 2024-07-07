import java.util.Scanner;

/* All other names will be echoed without a title. 
   The program continues looping until the user hits "enter" without first typing a name */
/* Use a Scanner to read user input. Uses a while loop that tests the length of the input line. 
   Use startsWith() to test the names */
public class TitleApplier {
   public static void main(String[] args) {
      String name;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter a name: "); //asks for the user's name
      name = input.nextLine().trim();
      
      while (!name.equals("")) {
      
         /* Writes that name to the monitor with either "Ms." or "Mr." in front, 
            depending if the name is for a female or male */
         if (name.startsWith("Amy") || name.startsWith("Buffy") || name.startsWith("Cathy")) //assume that these are the only female names
            System.out.println("Ms. " + name);
         else if (name.startsWith("Elroy") || name.startsWith("Fred") || name.startsWith("Graham")) //assume that these are the only male names
            System.out.println("Mr. " + name);
         else
            System.out.println(name);  
                 
         System.out.println("\nEnter a name: ");
         name = input.nextLine().trim();
      }
   }
}