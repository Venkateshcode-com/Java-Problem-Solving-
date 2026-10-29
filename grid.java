import java.util.*;
class Solution
{
	public String[] gridElement(int m, int n)
	{
		String[] arr=new String[m];
		for(int i=0;i<m;i++)
		{
			// brute force 
			String s=" ";
			for(int j = 0; j < n; j++)
			{
				if(i==0 || j==n-1)
				{
					s +=".";
				}
				else
				{
					s +="#";
				}
			}
			arr[i]=s;
		}
		return arr;
	}
}
class grid
{
	public static void main(String arg[])
	{
		Scanner scn = new Scanner(System.in);	
		System.out.println("Enter the row size : ");
		int row = scn.nextInt();
		System.out.println("Enter the column size : ");
		int col = scn.nextInt();

		Solution sol = new Solution();
		String s[] = sol.gridElement(row,col);
		System.out.println("The only way to reach from (0,0) to (m-1 , n-1) : ");
		for(int i=0;i<col;i++)
		{
			System.out.println(s[i]);
		}
	}
}