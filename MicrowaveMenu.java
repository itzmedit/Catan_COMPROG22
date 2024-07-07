import java.util.Scanner;

//Assume that if two or fewer digits are entered that the digits represent seconds
//Display a zero before the colon. If three or more digits are entered, the last two represent seconds
public class MicrowaveMenu {
   public static void main(String[] args) {
      String time, sec = "00", min = " 0";
       
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter cook time-> "); //asks the user to enter the time as a sequence of digits    
      time = input.nextLine().trim();
      
      //Displays the time as "minutes:seconds" 
      if (time.length() == 1) 
         sec = "0" + time;
      else if (time.length() == 2) 
         sec = time;
      else if (time.length() == 3) {
         sec = time.substring(1);
         min = " " + time.charAt(0);
      }
      else if (time.length() == 4) {
         sec = time.substring(2);
         min = time.substring(0,2);
      }
      else
         System.out.println("Exceeded the required digits!");
      
      System.out.println("Your time-> " + min + ":" + sec);
   }
}