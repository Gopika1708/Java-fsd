package oopsconcept;

public class Poly {
	public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int mul(int x, int y, int z) 
    { 
        return (x * y * z); 
    } 
    public double sub(double x, double y) 
    { 
        return (x - y); 
    } 
    public static void main(String args[]) 
    { 
        Poly s = new Poly(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.mul(10, 20, 30)); 
        System.out.println(s.sub(40.5, 20.5)); 
    } 


}
