
public class DifferentCalling {
	static int someInt = 10;
	  public static void changeIt(int a){
	   // a = 20;
	  }
	  public static void main(String[] args){
		  TestClass test=new TestClass();
	   changeIt(someInt);// By using method(args) to call the static variable. 
	   System.out.println(DifferentCalling.someInt);// Normal Static var Calling
	  }
}
