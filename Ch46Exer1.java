class HelloObject1 {
   private String greeting;
   
   //A constructor that allows the main() method to initialize objects to different greetings
   public HelloObject1(String greeting) {
      this.greeting = greeting;
   }
   
   public void greeting() {
      System.out.println(greeting);
   }
}

public class Ch46Exer1 {
   public static void main(String[] args) {
      HelloObject1 obj = new HelloObject1("Hello!");
      HelloObject1 obj1 = new HelloObject1("Hi!");
      HelloObject1 obj2 = new HelloObject1("Hey!");
      HelloObject1 obj3 = new HelloObject1("Yow!");
      HelloObject1 obj4 = new HelloObject1("Wassup!"); 
      
      //Writes out the greeting as many times as there are characters in the greeting
      obj.greeting();
      obj1.greeting();
      obj2.greeting();
      obj3.greeting();
      obj4.greeting();
   }
}