package accessmodifiers;
class modifiers1
{ 
	private void display() 
    { 
        System.out.println("This is a  private access specifier"); 
    } 

} 

public class Privatemodifier {
	public static void main(String[] args) {
		
		System.out.println("Private access  Specifier!!!");
		modifiers1 obj = new modifiers1(); 		  
        //obj.display(); 

	}

}
