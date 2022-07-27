package accessmodifiers;
class AccessSpecifier
{ 
  void display() 
     { 
         System.out.println("Welcome to Access modifiers learning!!!"); 
     } 
} 



public class Defaultmodifier {
	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		AccessSpecifier obj = new AccessSpecifier(); 		  
        obj.display(); 

	}

}
