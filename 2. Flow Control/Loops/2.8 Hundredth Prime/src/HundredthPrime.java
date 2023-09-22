public class HundredthPrime
{
   public static void main(String[] args)
   {
      int currentNumber = 2;
      int count = 1;
         while (count != 100) {
            currentNumber++;
            for (int divisor = 2; divisor <= currentNumber; divisor++) {


               if (divisor == currentNumber) {
                  count++;
                  break;
               }
               if (currentNumber % divisor == 0) {
                  break;
               }
            }
         }System.out.println(currentNumber);
   }
}