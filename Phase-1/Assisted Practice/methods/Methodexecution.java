package methods;
// method
public class Methodexecution {
	public int add(int a,int b) {
		int z=a+b;
		return z;
	}

	public static void main(String[] args) {

		Methodexecution b=new Methodexecution();
		int ans= b.add(10,30);
		System.out.println("Multipilcation is :"+ans);
		}

}
