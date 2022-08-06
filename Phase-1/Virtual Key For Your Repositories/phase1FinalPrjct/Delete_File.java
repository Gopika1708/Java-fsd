package phase1FinalPrjct;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Delete_File {
	public static void deletefile() throws IOException {
		String path="C:\\Users\\DELL\\Desktop\\Virtual\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Filename to deleted");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
		
	}

}
