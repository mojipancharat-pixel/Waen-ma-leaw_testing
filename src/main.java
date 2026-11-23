public class main {
   public int formulaTwo(int x, int y) { // x = 2, y = 3
       for (int i = 0; i < y; i++) {
           if (x > y) {
               x = x + 1;
           } else {
               x = x + 2;
           }
       }
       return x; // x=???
   }
}