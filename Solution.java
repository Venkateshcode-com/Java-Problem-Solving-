import java.util.*;
class shop
{
	public Boolean Change(int[] arr)
	{
		int five=0;
		int ten=0;
		for(int i=0;i<arr.length;i++)
		{
			if(5==arr[i])
			{
				five++;
			}
			if(10==arr[i])
			{
				if(five>=1)
				{
					five--;
					ten++;
				}
				else
				{
					return false;
				}
			}	
			if(20==arr[i])
			{
				if(five>=3)
				{
					five=five-3;
				}
				else 
				{
					if(ten>=1 && five>=1)
					{
						five--;
						ten--;
					}
					else
					{
						return false;
					}
				}
			    }
			
		}
		return true;
	}
	
}
class Solution 
{
	public static void main(String arg[])
	{
		Scanner Scn=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=Scn.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Customer Rupees:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Scn.nextInt();
		}
		shop Sol=new shop();
		boolean ans= Sol.Change(arr);
		if(ans)
		{
			System.out.println("You can give change all the  customer:");
		}
		else
		{
			System.out.println("You can't give change all the  customer:");
		}
		
	}
}