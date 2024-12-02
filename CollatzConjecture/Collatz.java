
import java.util.Scanner;
public class Collatz
{
     public static void main(String [] args)
     {
          while(true)
          {
               Scanner input = new Scanner(System.in);
               int n;
               System.out.print("Bir pozitif sayı giriniz: ");
               n = input.nextInt();
               collatz_conjecture(n);
          }
     }

     public static void collatz_conjecture(int n)
     {
          if (n > 0)
          {
               while(n > 1)
               {
                    System.out.println(n);
                    n = (n % 2 == 0 ? (n / 2) : (3 * n + 1));
               }
               System.out.println(1);
          }
          else
          {
               System.out.println("Tekrar değer giriniz!!");
          }
     }
}