package arrayDemo;

import java.util.Scanner;

// copy of one array to another array
public class ArrayDemo1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	 int a[]=new int[n];
	 //define an array
	 int b[]=new int[n];
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println("The elemets in an indeax:"+i);
		 a[i]=sc.nextInt();
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.println("The elements are:"+a[i]);
	 }
	 System.arraycopy(a, 0, b, 0, a.length);
	  System.out.println(("the elemants in b are:"));
	 for(int data:b) {
		 
			System.out.println(data);
			

}
	}
}
		
		
	
	
		
		


