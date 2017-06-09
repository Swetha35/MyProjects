import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  "jdbc:mysql://localhost:3306/sonoo","root","root");  

Statement st=con.createStatement();  
Statement stmt = null;
ResultSet a=stmt.executeQuery("select * from user"); 

while(a.next())  
System.out.println(a.getInt(1)+a.getString(2)+a.getString(3)+a.getString(4)+a.getString(5));  



ResultSet a1=st.executeQuery("select * from book_rating"+ ""); 

while(a1.next())  
System.out.println(a1.getInt(1)+" "+a1.getInt(2)+a1.getInt(3) );  
con.close();  
}catch(Exception e){ 
System.out.println(e);}  
}  
	}


