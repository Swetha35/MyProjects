
public class Main {
	public static void main(String args[]) {
	    Professor s1 = new Professor("AAA");
	    Professor s2 = new Professor("BBB");
	    s1.age = 45;
	   // s2.age=100;
	    System.out.println(s1.age + s2.getSpecialization());
	    System.out.println(s2.age + s1.getSpecialization());
	  }
}

