package filehandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileappend {
	public static void main(String[] args) throws IOException {
		 System.out.println("New line is appending");
		File myFile=new File("C:\\Users\\DELL\\Documents\\workspace-spring-tool-suite-4-4.15.1.RELEASE\\Project1\\src\\filehandling\\Prem.text");
	    FileWriter fr1=new FileWriter(myFile,true);//Appending..
	   fr1.write("I hope u are doing well");
	   fr1.flush();
	   System.out.println(myFile);
	    System.out.println("The new line is appended");
	
	
	
	}

}
