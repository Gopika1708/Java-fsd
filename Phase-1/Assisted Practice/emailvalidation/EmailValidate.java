package emailvalidation;

import java.util.Scanner;

public class EmailValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String id;
		System.out.println("Enter the email-id:");
		String arr[]= {"prem@gmail.com,sandy@gmail.com,janani154@gmail.com,jackie23@gmailcom"};
	     id=sc.next();
	
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i].equals(id))
		   {
			   System.out.println("Email id is found");
			   break;
		   }
		   else
		   {
			   System.out.println(("Email id id not found"));
		   }
	   }
	}

}
