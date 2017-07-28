
public class Person {
	 protected int age;

	  protected void setAge(int val)
	  {
	   age = val;
	  }

	  protected int getAge()
	  {
	    return age;
	  }
	}

	class Professor extends Person 
	{
	  Professor(String val)
	      {
	    specialization = val;
	      }

	  String specialization;

	  String getSpecialization()
	  {
	    return specialization;
	  }
	}

