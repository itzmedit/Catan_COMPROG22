import java.util.Scanner;

//A program that repeatedly asks the user for a proposed password until the user enters an acceptable password
//The logic of this program can be quite tricky
/* Hint: use toUpperCase(), toLowerCase(), and equals(). 
   You will also need nested ifs */
public class PasswordChecker {
   public static void main(String[] agrs) {
      boolean notAcceptable = true;
      
      Scanner input = new Scanner(System.in);

      //The program writes a message and exits
      while (notAcceptable) {
         String password, ch;
         int upperCase = 0, lowerCase = 0, digit = 0, space = 0;
         
         System.out.println("Enter your password: "); //user enters an acceptable password
         password = input.nextLine().trim();
         
         if (password.length() >= 7) { //acceptable passwords are at least 7 characters long
            for (int n = 0 ; n < password.length() ; n++) {
               char character = password.charAt(n);
               
               switch (character) { //contain at least 1 digit
                  case '1': case '2': case '3': case '4': case '5': 
                  case '6': case '7': case '8': case '9': case '0':
                  digit++;
                  case ' ': space++;
                  break;
                     
                  default: 
                     ch = String.valueOf(character);

                     if (ch.equals(ch.toLowerCase())) //contain both lower case alphabetic characters
                        lowerCase++;  
                     if (ch.equals(ch.toUpperCase())) //contain both upper case alphabetic characters
                        upperCase++;
               }
            }
            
            if (lowerCase != 0 && upperCase != 0 && digit != 0 && space != 0)
               notAcceptable = false;
            else {
               notAcceptable = true;
               System.out.println("That password is not acceptable.");
               System.out.println();
            }
         }
         else {
            notAcceptable = true;
            System.out.println("That password is not acceptable.");
            System.out.println();
         }
      } 
   
      System.out.println("Acceptable password.");
   }
}
