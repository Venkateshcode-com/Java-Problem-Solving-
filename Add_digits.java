import java.util.*;
class Solution
{
	public int addDigits(int num)
	{
		while(num>9)
		{
			int rev=num%10;
			int digit=num/10;
			num=rev+digit;
		}
		return num;
	}
}
class Add_digits
{
	public static void main(String arg[])
	{
		Scanner Scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=Scn.nextInt();
		Solution Sol=new Solution();
		int ans=Sol.addDigits(num);
		System.out.println(ans);
		
	}
}