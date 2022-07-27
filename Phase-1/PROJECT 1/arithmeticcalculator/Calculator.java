package arithmeticcalculator;
import java.util.*;
public class Calculator {
	public  int add(int x,int y)
	{
		int res=x+y;
		return res;
	}
	public  int sub(int x,int y)
	{
		int res=x-y;
		return res;
	}
	public  int mul(int x,int y)
	{
		int res=x*y;
		return res;
	}
	public  int div(int x,int y)
	{
		int res=x/y;
		return res;
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int num1,num2,result;
		char op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1 value:");
		num1=sc.nextInt();
		System.out.println("Enter the num2 value:");
		num2=sc.nextInt();
		System.out.println("Enter the operator");
		op=sc.next().charAt(0);
		
		 if(op=='+')
		{
			result=obj.add(num1,num2);
			System.out.println("The addition of two number is:"+result);
		}
		else if(op=='-')
		{
			result=obj.sub(num1,num2);
			System.out.println("The subtraction of two number is:"+result);
		}
		else if(op=='*')
		{
			result=obj.mul(num1,num2);
			System.out.println("The multiplication of two number is:"+result);
		}
		else if(op=='/')
		{
			result=obj.div(num1,num2);
			System.out.println("The division of two number is:"+result);
		}
		else
		{
			System.out.println("Getting as error");
		}
		
	}

}
