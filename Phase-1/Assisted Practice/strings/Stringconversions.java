package strings;

public class Stringconversions {
	public static void main(String[] args) {
		
		System.out.println("Methods of Strings");
		
		 String str=new String("Hii!!! How are you");
		 String str1=new String("Welcome to Everyone");
		
		 
		 System.out.println("The actual string is:" +("Hii!!! How are you"));
		 
		//len of the strings
		 System.out.println("The length of the string is:" +(str.length()));
		 
		//lowercase
		 System.out.println("The lowercase of the string will be:" +(str.toLowerCase()));
		 
		//uppercase
		 System.out.println("The uppercase of the string will be:" +(str.toUpperCase()));
		 
		 //Substring
		  System.out.println("The substring is :"+(str1.substring(3) ));
		  
		  //comparsion of two strings
		  System.out.println("The comparsion of two string is: "+(str1.compareTo(str)));
		  
		  // replace
		 System.out.println("Before Replacing:" +("Welcome to Everyone"));
		  System.out.println("After Replacing:" +str1.replace('e','i'));
		  
		  //equals
		  System.out.println("The equals of the string: "+str.equals(str1));
		  
		  System.out.println("\n");
		  
		System.out.println("Creating StringBuffer");
			//Creating StringBuffer and append method
			StringBuffer s=new StringBuffer("Welcome to W3schools!!");
			s.append("Enjoy your learning");
			System.out.println(s);

	
	}

}
