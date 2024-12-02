
import java.util.Scanner;
public class asal 
{
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner input = new Scanner(System.in);
			boolean check = true;
			int n;
			System.out.print("Bir sayı giriniz: ");
			n = input.nextInt();
			for(int i = 2; i < n; i++)
			{
				if(n % i == 0)
				{
					check = false;
					break;
				}
			}
			if (check)
			{
				System.out.println("Bu sayı asal bir sayıdır.");
			}
			else
			{
				System.out.println("Bu sayı asal bir sayı değildir.");
			}
		}
	}
}