//The additional constructor will not alter its parameter, merely use its data
/* The additional constructor will initialize the greeting variable of the new object 
   to be a reference to the same String object that the parameter object refers to */
class HelloObject4 {
  private String greeting;
  	
  public HelloObject4() {
    greeting = "Hello World!";
  }

  //A constructor that takes a HelloObject object as a parameter
  public HelloObject4(HelloObject4 init) {
    // initialize the new object's greeting to the same
    // as that of the init parameter
    greeting = new String(init.greeting);
    //uses "dot notation" to refer to the String inside the parameter
  }

  public void greet() {
    System.out.println(greeting);
  }
}

public class Ch46Exer4 {
  public static void main(String[] args) {
    //There will be one String object, with two HelloObject objects referring to it
    HelloObject4 obj1 = new HelloObject4();
    HelloObject4 obj2 = new HelloObject4();
    
    obj1.greet();
    obj2.greet();
  }
}