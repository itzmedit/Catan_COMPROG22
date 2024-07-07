import java.util.Scanner;

//The program where the greeting that is printed by the object is given by the user
/* This is actually a more interesting program than it might appear because it involves 
   a difficult design decision: who should ask the user for the greeting, the static main() 
   method of the HelloTester class or the Hello object? */
class HelloObject3 {
   public void greeting() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter greet: "); 
      System.out.println("\n" + input.nextLine());
   }
} 

public class Ch46Exer3 {
   public static void main(String[] args) {
      HelloObject3 obj = new HelloObject3();
      
      obj.greeting();
   }
}