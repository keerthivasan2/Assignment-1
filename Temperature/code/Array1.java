import java.util.*;
class Array1
{
	public static void main(String[]args)
	{
		int[]tem[]=new int[1][7];
		Scanner c=new Scanner(System.in);
		for(int i=0;i<tem.length;i++)
		{
			System.out.println("CHENNAI CITY");
			System.out.println("Enter the temperature of chennai city -7 days"); 
			for(int j=0;j<tem[i].length;j++)
			{
			tem[i][j]=c.nextInt();
			}
		}
		for(int i=0;i<tem.length;i++)
		{
			for(int j=0;j<tem[i].length;j++)
			{
				System.out.print(tem[i][j]+"\t");
			}
			System.out.println();
		}			
		for(int i=0;i<tem.length;i++)
		{
			System.out.println("BENGALUR CITY");
			System.out.println("Enter the temperature of bengalur city -7 days"); 
			for(int j=0;j<tem[i].length;j++)
			{
			tem[i][j]=c.nextInt();
			}
		}
		for(int i=0;i<tem.length;i++)
		{
			for(int j=0;j<tem[i].length;j++)
			{
				System.out.print(tem[i][j]+"\t");
			}
			System.out.println();
		}			
	}
}
		
		