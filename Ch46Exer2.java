//The program has two greeting messages: a morning greeting and an evening greeting
//There will two output methods, one for each greeting
class HelloObject2 {
   public void greetDay() {
      System.out.println("Good morning World!");
   }
   
   public void greetNight() {
      System.out.println("Good evening World!");
   }
}

public class Ch46Exer2 {
   public static void main(String[] args) {
      HelloObject2 world = new HelloObject2();
      
      world.greetDay();
      world.greetNight();
   }
}