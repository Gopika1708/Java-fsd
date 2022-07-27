package arrayDemo;

import java.util.Scanner;

public class Arraysdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int[n];//define an array
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println("The elemets in an indeax:"+i);
			 a[i]=sc.nextInt();
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println("The elements are:"+a[i]);
		 }
		
	}

}
