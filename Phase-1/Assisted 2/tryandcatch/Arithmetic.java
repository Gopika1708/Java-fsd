package tryandcatch;

public class Arithmetic {

		public static void main(String args[]){  
			   try{  
			      
			      int c=100/0;  //raise exception
			   }
			   catch(ArithmeticException e)
			   {
				   System.out.println(e);
			   
			   }  
			    System.out.println("rest of the code...");  
			  }  
			}  
