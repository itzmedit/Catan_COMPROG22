import java.util.Scanner;

public class NameEcho {
   public static void main(String[] args) {
      String name, nameEcho;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      name = input.nextLine().trim();
      
      System.out.println();
      
      if (name.indexOf(" ") > 0) {
         nameEcho = name.substring(name.indexOf(" "));
         name = name.substring(0, name.indexOf(" "));
         name = name.concat(" " + nameEcho.toUpperCase().trim());
      }
      
      System.out.println(name);
   }
}
