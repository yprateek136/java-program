class FibonacciSeries
{  
	public static void main(String args[])  
	{    
		int num1=0, num2=1, num3,till=5;    
		System.out.print(num1+" "+num2);    
		for(int i=2 ; i<till ; ++i)
		{    
			num3=num1+num2;    
			System.out.print(" "+num3);    
			num1=num2;    
			num2=num3;    
		}    
	}
}
