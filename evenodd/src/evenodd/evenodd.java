package evenodd;

import java.util.Scanner;

public class evenodd 
{
	public static void main(String args[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number");
		x=sc.nextInt();
		if(x%2==0)
			System.out.print("even");
		else
			System.out.print("Odd");
	}
}
