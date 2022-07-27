package arrays;
//Single dimension array
public class Array {
	public static void main(String[] args) {
		int a[]= {2,3,1,5,8,9}; 
		for(int i=0;i<=5;i++)
		{
			System.out.println("The elements are:"+a[i]);//print all the elements in an array
		
		}
		System.out.println("The elements at index of a[2] is :"+a[2]);// get the elements at the specific index
		System.out.println("The elements at index of a[4] is :"+a[4]);	
		
		// Multidimension array
		
		
		System.out.println("2 dimensional arrays");
		int b[][]= {{2,8,3},{2,0,1},{1,2}};
		
	      
	      System.out.println("\nLength of row 1: " + b[0].length);
	    
		
	}
	

}
