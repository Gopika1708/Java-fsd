package methods;

public class Overloading {
	
		
		public void area(int l,int b,int h)
		    {
		         System.out.println("Area of Rectangle : "+(l*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of Square : "+(r*r));
		    }

		    public static void main(String args[])
		   {

		    	Overloading ob=new Overloading();
		       ob.area(2,10,12);
		       ob.area(5);  
		   }
		}




