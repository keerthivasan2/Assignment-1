import java.util.*;
class pronicNumber
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=sc.nextInt();
		int n=(int)Math.sqrt(number);
		if(n*(n+1)==number)
		{
			System.out.println(number+" is a pronic number");
		}
		else
		{
			System.out.println(number+" is NOT  pronic number");
		}
	}
}
		