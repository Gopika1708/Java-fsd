package innerclass;

public class InnerclassDemo {
	private String msg="Hii!!! guys"; 
	 
	 class Inner{  
	  void hello()
	  {
		  System.out.println(msg+", Welcome to innerclass learning...");
	   }  
	 }  


	public static void main(String[] args) {

		InnerclassDemo obj=new InnerclassDemo();
		InnerclassDemo.Inner in=obj.new Inner();  
		in.hello();  
	}


}
