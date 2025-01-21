
import java.util.Scanner;

class triangle_nums
{
     // Palindrome Kontrolü
     // ara, bbggbb 1221
     public static void main(String[] args)
     {
          Scanner input = new Scanner(System.in);
          int s1 = 1, a = 2, next;
          next = s1;
          System.out.print("Kaç adımlık üçgensel sayıyı istiyorsunuz: ");
          int adim = input.nextInt();
          for (int i = 1; i <= adim; i++)
          {
               System.out.print(s1 + " \n");
               s1 = a + s1;
               a+=1;
          }
          System.out.print("Kaçıncı adımda ki üçgensel sayıyı istiyorsunuz: ");
          int adim2 = input.nextInt();
          System.out.printf("%d. adımdaki üçgensel sayı: %d", adim2, TriangleNumsStep(adim2));

     }
     static int TriangleNumsStep(int step)
     {
          int sum = (step * (step + 1)) / 2;
          return sum;
     }
}