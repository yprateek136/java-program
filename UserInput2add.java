import java.util.Scanner;
class UserInput2add
{
	public static void main(String v[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of x:");
		int x=s.nextInt();
		
		System.out.println("Enter the value of y:");
		int y=s.nextInt();
		
		int z=x+y;
		
		System.out.println("addition of two integers is:"+ z);
	}
}
