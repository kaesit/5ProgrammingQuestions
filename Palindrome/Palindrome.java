
import java.util.Scanner;

class Palindrome
{
     // Palindrome Kontrolü
     // ara, bbggbb 1221
     public static void main(String[] args)
     {
          Scanner input = new Scanner(System.in);
          String text;
          System.out.print("Bir metin giriniz: ");
          text = input.nextLine();
          if(palindrome_check(text))
          {
               System.out.println("Bu metin bir palindrome");
          }
          else
          {
               System.out.println("Bu metin palindrome değil");
          }
     }
     static boolean palindrome_check(String text)
     {
          String clean_text = text.replaceAll("[//W_]+", "").toLowerCase();

          String reverse_text = new StringBuilder(clean_text).reverse().toString();

          return clean_text.equals(reverse_text);
     }
}