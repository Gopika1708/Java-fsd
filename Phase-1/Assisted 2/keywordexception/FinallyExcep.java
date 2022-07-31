package keywordexception;

public class FinallyExcep {
    public static void main(String[] args)
    {
        int a=10,b=0,result=0;
        try
        {
            result = a / b;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\nThe result is : " + result);
        }
    }


}
