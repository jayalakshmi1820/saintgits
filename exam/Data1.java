import java.util.*;
import java.sql.*;
class Data1
{
public static void main(String args[])
{
  Scanner s= new Scanner(System.in);
   try
{
  Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/reshma","root","");
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery("select * from student");
 while(rs.next())
 {
   System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	}
}
catch(Exception e1)
{
   System.out.println(e1);
}
}
}
		
