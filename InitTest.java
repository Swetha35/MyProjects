
public class InitTest {
	{
	      s1 = sM1("1");//four
	   }
	   static String s1 = sM1("a");//First
	   String s3 = sM1("2");//five(Non-static)
	{
	      s1 = sM1("3");//six(Non-static)
	   }
	   static
	{
	      s1 = sM1("b");//Second
	   }
	   static String s2 = sM1("c");//Third
	   String s4 = sM1("4");//seven  (Non-static)
	    public static void main(String args[])
	{
	        InitTest it = new InitTest();
	    }
	    private static String sM1(String s)
	{
	       System.out.println(s);  return s;
	    }
}
