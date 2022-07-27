package emailvalidation;

import java.util.Scanner;

public class EmailValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String id;
		System.out.println("Enter the email-id:");
		String arr[]= {"prem@gmail.com","sandy@gmail.com","janani154@gmail.com","jackie23@gmail.com"};
	     id=sc.next();
	     boolean f=false;
	
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i].equals(id))
		   {
			   System.out.println("Email id is found");
			   f=true;
			   break;
		   }
	   }
	   else if(f==false)
		   {
			   System.out.println(("Email id is not found"));
		   }
	   
	}

}
