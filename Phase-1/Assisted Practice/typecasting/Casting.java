package typecasting;

public class Casting {
	public static void main(String[] args) {
		System.out.println("Implicit Conversion");
		char a='D';
		System.out.println("The value of a is:" +a);
		
		int b=a; // char to int
		System.out.println("Conversion of char to int is:" +b);
		
		double c=b;// int to double
		System.out.println("conversion of int to double is:" +c);
		
	    float d=a;//char to float
	    System.out.println("conversion of char to float is:" +d);
	    
	    long e=a;//char to long
	    System.out.println("conversion of char to long is:" +e);
	    System.out.println("\n");
	    
	    System.out.println("Explicit Conversion");
	    
	    double A=100;
	    float B=(float)A;//double to float
	    System.out.println("conversion of double to float is:"+B);
	    
	    float C=B;
	    int D=(int)C;//float to double
	    System.out.println("Conversion of float to int is :"+D);
	    
	    int E=D;
	    char F=(char)E;
	    System.out.println("Conversion of int to char is:"+F);
	    
	}

}
