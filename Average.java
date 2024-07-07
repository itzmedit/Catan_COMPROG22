//To check your method, initialize the array to ten values that have an easily computed average
class AverageSub {
  private int[] data;
  private int sum = 0;

  public AverageSub(int[] init) {
    data = new int[init.length];

    for (int j = 0 ; j < data.length ; j++) 
      data[j] = init[j];
  }
  
  //Use integer math
  public int average() { //the average() method 
    for (int a = 0 ; a < data.length ; a++) 
      sum += data[a];

    return sum / data.length;
  }
}

public class Average {  
  public static void main(String[] args) {
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
                    
    AverageSub june = new AverageSub(values);
    int avg = june.average();
    System.out.println("Average = " + avg);
  }
}