public class MaxOfEight {
   public static void main(String[] args) {
      int a = 99, b = 91, c = 95, d = 100, e = 97, f = 94, g = 92, h = 96;      
      
      System.out.print("The max of " + a + ", " + b + ", " + c + ", " + d +
                       ", " + e + ", " + f + ", " + g + ", " + h + " is " +
                       maxEight(a,b,c,d,e,f,g,h));
   }
   
   public static int maxEight(int a, int b, int c, int d, int e, int f, int g, int h) {
      if (a > b) { 
         if (a > c) {
            if (a > d) {
               if (a > e) {
                  if (a > f) {
                     if (a > g) {
                        if (a > h) 
                           return a;
                     }
                  }
               }
            }
         }
      }
      if (b > c) {
         if (b > d) {
            if (b > e) {
               if (b > f) {
                  if (b > g) {
                     if (b > h)
                        return b;
                  }
               }
            }
         }
      }
      if (c > d) {
         if (c > e) {
            if (c > f) {
               if (c > g) {
                  if (c > h)
                     return c;
               }
            }
         }
      }
      if (d > e) {
         if (d > f) {
            if (d > g) {
               if (d > h)
                  return d;
            }
         }
      }
      if (e > f) {
         if (e > g) {
            if (e > h)
               return e;
         }
      }
      if (f > g) {
         if (f > h)
            return f;
      }
      if (g > h)
         return g;
      else 
         return h;
   }
}