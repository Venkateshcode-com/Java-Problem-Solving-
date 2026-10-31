import java.util.*;
class Solution
{
	public boolean change(int num)
	{
		int sqrt=1;
		int n=num;
		if(n==1)
		{
			n=n;
		}
		else
		{
			n=n/2;
		}
		if(n>0)
		{
			for(int i=1;i<=n;i++)
			{
				sqrt=i*i;
				if(sqrt<=num)
				{
					if(sqrt==num)
					{
						return true;
					}
				}
			}
		}	
		return false;
	} 
}
class Valid_Perfect_Square
{
	public static void main(String arg[])
	{
		Scanner Scn=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=Scn.nextInt();
		Solution Sol=new Solution();
		boolean ans=Sol.change(num);
		if(ans)
		{
			System.out.println("Your number is Perfect Square");
		}
		else
		{
			System.out.println("Your number is non Perfect Square");
		}
	}
}