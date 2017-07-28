
public class ReturnType {

	//public byte  x(byte by)//not compile becz double is largest datatype
public double  x(byte by)
{
	 double d = 10.0;
	    return (long) by/d*3;
}
}
