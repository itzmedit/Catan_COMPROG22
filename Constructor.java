//The program that constructs the array data, then copies values from the parameter init into data 
class ConstructorSub {
  private int[] data;
  private String print = "  int[] data = { ";
  
  // Constructor
  public ConstructorSub(int[] init) {
    // Make data the same length
    // as the array referenced by init.
    data = new int[init.length];
    
    // Copy values from the 
    // input data to data.
    for (int j = 0 ; j < data.length ; j++) 
      data[j] = init[j];
  }
  
  //Print
  public String toString() { //the toString() method
   for (int a = 0 ; a < data.length ; a++) {
      if (a != data.length - 1) {
         if (a < 3)
            print += data[a] + ",  ";
         else
            print += data[a] + ", ";
         
         if (a == 9 || a == 19)
            print += "\n\t\t";
      }
      else
         print += data[a] + "};";
   }
  
   return print;
  }
}

public class Constructor {
  public static void main(String[] args) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
                    
    ConstructorSub june = new ConstructorSub(values);
    System.out.println(june);
  }
}
