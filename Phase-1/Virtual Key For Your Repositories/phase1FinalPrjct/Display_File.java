package phase1FinalPrjct;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Display_File {
	public void Display_File() throws IOException {
		String path="C:\\Users\\DELL\\Desktop\\Virtual\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Retrieving the FileName in an ascending order");
		String filename=sc.next();
		File f=new File(path);
		//display operation
		File filenames[]=f.listFiles();
		for(File ff:filenames) {
			System.out.println(ff.getName());
		}
		
	}

}


