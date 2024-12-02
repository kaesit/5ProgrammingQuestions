
import java.util.Scanner;
public class Fibonacci
{
     public static void main(String [] args)
     {
          while(true)
          {
               Scanner input = new Scanner(System.in);
               int s, s1 = 0, s2 = 1, s3;
               System.out.print("Bir adım sayısı giriniz: ");
               s = input.nextInt();
               for(int i = 2; i < s; i++)
               {
                    s3 = s1 + s2;
                    System.out.println(s3);
                    s1 = s2;
                    s2 = s3;
               }
          }
     }
}