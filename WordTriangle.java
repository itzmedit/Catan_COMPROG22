import java.util.Scanner;

//Note: You will have to be careful with words having and odd number of characters
public class WordTriangle {
   public static void main(String[] args) {
      String word;
      int num;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a word --> "); //asks the user for a word
      word = input.nextLine().trim();
      
      num = word.length()/2 + 1;
      
      //Writes out that word once per line
      //Continue until no characters are left
      for (int x = 0 ; x < num ; x++) {
         for (int y = 0; y <= x ; y++) {
            if (y != 0)
               System.out.print(" "); //for each line replace the first character of the word with a space 
         }
         
         System.out.println(word.substring(x, word.length()-x)); //remove the last character of the word
      }
   }
}