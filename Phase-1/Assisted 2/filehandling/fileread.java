package filehandling;
import java.io.File;
import java.util.Scanner;
public class fileread {
	public static void main(String[] args) {
		// reading a file
	try {
	
		File myFile=new File("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\Project1\\src\\filehandling\\Prem.text");
	   Scanner sc=new Scanner(myFile);
		System.out.println("Reading a file");
	
		while(sc.hasNextLine())
		   {
			   System.out.println(sc.nextLine());
			  System.out.println("Reading is over");
			
		   }
		  sc.close();
		
	}
	catch(Exception e)
		{
			System.out.println("Error occurs");
		}
	
}
}
