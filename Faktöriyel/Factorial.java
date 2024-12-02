import java.util.Scanner;


public class Factorial
{
     public static void main(String[] args)
     {
          while(true)
          {
               Scanner input = new Scanner(System.in);
               long n;
               System.out.print("Bir sayı giriniz: ");
               n = input.nextLong();
               System.out.println(factorial(n));
          }
     }

     static long factorial(long n)
     {
          // 0! ve 1! = 1, 2 3 4
          if (n < 2)
          {
               return 1;
          }
          return n * factorial(n - 1);
     }
}