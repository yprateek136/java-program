// Palidrome program
class palidrome
{
	public static void main(String [] args)
	{
		int a=121,remainder=0,sum=0;
		int temp=a;
		while(a>0)
		{
			remainder=a%10;
			sum=(sum*10)+remainder;
			a=a/10;
		}
		if(sum==temp)
		{
			System.out.println("Number is Palidrome");
		}
		else
		{
			System.out.println("Number is not Palidrome");
		}
	}
}
