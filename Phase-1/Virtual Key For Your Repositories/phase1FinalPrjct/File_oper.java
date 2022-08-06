package phase1FinalPrjct;
                        //Virtual Key For Your Repositories
import java.io.IOException;
import java.util.Scanner;

public class File_oper {
         public static void main(String[] args) throws IOException {
	      Scanner sc=new Scanner(System.in);
	      
	      CreateNewFile cf=new CreateNewFile();
	      Display_File df=new Display_File();
	      Search_File sf=new Search_File();
	      Delete_File delf=new Delete_File();
	      Exit e=new Exit();
	      
	     while(true) {
	     System.out.println("Enter your choice\n1.Retrieve the Files\n2.Business Level Operations\n3.Close the Application");
	      int Choice=sc.nextInt();
	      switch(Choice)
	          {
	    	  case 1:
	    		  df.Display_File();
	    		  break;
	    	   case 2:int temp=1; 
	    		  while(temp==1) { 
	    		  System.out.println("\t........Business Level Operations.........\nSelect your choice\n1.Add a New File\n2.Search the File\n3.Delete the File\n4.Exit");
	    		int option1=sc.nextInt(); 
	    		switch(option1)
	    		  {
	    		  case 1:cf.AddFile();
	    		         break;
	    		  case 2: sf.Searchfile();
	    		         break;
	    		  case 3: delf.deletefile();
	    		         break;
	    		  case 4:temp=0;
	    		         break;
	    		  default: System.out.println("Invalid option");
	    		          break;
	    		  }
	    	  }
	    	  break;
	    	  case 3:e.Closeapp();
	    		  System.exit(0); 
	    	       break;
	    	  default: 
	    		  System.out.println("Invalid option");
	    	  break;
	    	  }
	      }
}
}

