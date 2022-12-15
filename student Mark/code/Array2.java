import java.util.*;
class Array2
{
	public static void main(String[]args)
	{
		int mark[][]=new int[2][3];
		Scanner st=new Scanner(System.in);
		System.out.println("EEE department");
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("Enter the mark of the student in 3 subject");
			for(int j=0;j<mark[i].length;j++)
			{
			mark[i][j]=st.nextInt();
			}
		}
		System.out.println("          MARK OF TWO STUDENT");
		for(int i=0;i<mark.length;i++)
		{
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.print(mark[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("MECHANICAL department");
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("Entet the mark of the student in 3 subject"); 
			for(int j=0;j<mark[i].length;j++)
			{
			mark[i][j]=st.nextInt();
			}
		}
		System.out.println("          MARK OF TWO STUDENT");
		for(int i=0;i<mark.length;i++)
		{
			for(int j=0;j<mark[i].length;j++)
			{
				System.out.print(mark[i][j]+"\t");
			}
			System.out.println();	
		}  	
	}
}

			
			
		
		