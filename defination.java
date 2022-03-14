package arith;

import java.util.Scanner;

class arithmatic

{
	arithmatic(int a,int b)
	
	{
		int add=a+b;
		System.out.println("Addition is : "+add);
		
		int sub=a-b;
		System.out.println("subtraction is : "+sub);
		
		int mul=a*b;
		System.out.println("multiplication is : "+mul);
		
		double div=a/b;
		System.out.println("division is : "+div);
		
	}
}

class main1

{
	public static void main(String args[])
	{
		int x,y;
		Scanner sc = new Scanner(System. in);
		System.out.println("Enter number 1 :");
		x=sc.nextInt();
		System.out.println("Enter number 2 :");
		y=sc.nextInt();
		arithmatic obj1=new arithmatic(x,y);
		
	}
}